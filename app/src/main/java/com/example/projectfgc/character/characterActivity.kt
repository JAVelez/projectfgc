package com.example.projectfgc.character

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import android.view.GestureDetector
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.GestureDetectorCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.data.c
import com.example.projectfgc.data.characterFields
import com.example.projectfgc.data.priorityMoveFields
import com.example.projectfgc.move.moveAdapter
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.app_bar_layout.*
import kotlinx.android.synthetic.main.content_character_screen.*
import kotlinx.android.synthetic.main.char_layout.view.*

class characterActivity : AppCompatActivity(){

    lateinit var move_list: RecyclerView
    lateinit var searchView: SearchView
    val displayMoveList: MutableList<priorityMoveFields> = ArrayList()
    val moveList: MutableList<priorityMoveFields> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_screen)
        toolbar.setTitle("")
        setSupportActionBar(toolbar)
        titleLogo.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        helpSnackBar()

        val character: characterFields = setCharBanner()

        moveList.addAll(character.moveList)
        displayMoveList.addAll(moveList)

        move_list = findViewById(R.id.movesRecView)

        move_list.apply{
            layoutManager = LinearLayoutManager( this@characterActivity)
            adapter = moveAdapter(displayMoveList, 0)   // state declares that it is coming from characterActivity instead of punishCharacterActivity
            val divItemDecor = DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL)
            divItemDecor.setDrawable(resources.getDrawable(R.drawable.divider))
            addItemDecoration(divItemDecor)
        }
    }

    private fun helpSnackBar(){
        Snackbar.make(characterScreenLayout, "Left half opens up details. Right half opens up punishes.", Snackbar.LENGTH_LONG).show()
    }

    private fun setCharBanner(): characterFields {
        //  Get characterFields of chosen character
        val character : characterFields = intent.getSerializableExtra("character") as characterFields
        val view = findViewById<ConstraintLayout>(R.id.charBanner)
        view.charName.text = character.name
        view.charImage.setImageDrawable(getDrawable(character.imageName))
        return character
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.search_menu, menu)
        var searchItem = menu.findItem(R.id.app_bar_search)
        searchView = searchItem.actionView as SearchView
        var simpleSearch = mutableListOf<String>()

        if(searchItem != null){
            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

                override fun onQueryTextSubmit(query: String?): Boolean {
                    searchView.hideKeyboard()
                    return true
                }

                override fun onQueryTextChange(newText: String): Boolean {

                    if(newText.isNotEmpty()){
                        displayMoveList.clear()

                        val search = newText.toLowerCase()

                        // this method only takes into consideration the simple method IF there is no / or + in the search
                        if(search.contains("/") || search.contains("+") || search.contains(",")) {
                        }else{
                            simpleSearch = mutableListOf()
                            for (s in search) {
                                simpleSearch.add(s.toString())
                            }
                            //d("simplesearch", "$simpleSearch")
                            moveList.forEach {
                                if (sSearch(simpleSearch, it)) {
                                    displayMoveList.add(it)
                                }
                            }
                        }

//                        simpleSearch = mutableListOf()
//                            for (s in search) {
//                                simpleSearch.add(s.toString())
//                            }
//                            //d("simplesearch", "$simpleSearch")
//                            moveList.forEach {
//                                if (sSearch(simpleSearch, it)) {
//                                    displayMoveList.add(it)
//                                }
//                            }

                        moveList.forEach{
                            val input = it.moveInput.replace(" ", "")
                            if(it.moveName.toLowerCase().contains(search) || it.moveInput.toLowerCase().contains(search) || input.toLowerCase().contains(search)){
                                displayMoveList.add(it)
                            }
                        }

                        move_list.adapter?.notifyDataSetChanged()
                    }else{
                        displayMoveList.clear()
                        displayMoveList.addAll(moveList)
                        move_list.adapter?.notifyDataSetChanged()
                    }

                    return true
                }
            })
        }

        searchView.setOnQueryTextFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                searchView.showKeyboard()
            }
            else {
                searchView.hideKeyboard()
            }
        }

        searchItem.setOnActionExpandListener(object: MenuItem.OnActionExpandListener {
            override fun onMenuItemActionExpand(p0: MenuItem?): Boolean {
                searchView.isIconified = false
                searchView.requestFocusFromTouch()
                return true
            }

            override fun onMenuItemActionCollapse(p0: MenuItem?): Boolean {
                // when back, clear all search
                searchView.setQuery("", true)
                return true
            }
        })

        return super.onCreateOptionsMenu(menu)
    }

    fun sSearch(search: MutableList<String>, move: priorityMoveFields): Boolean{
        var index = mutableListOf<Int>()
        var substring = 0
        for(s in search){
            if(!move.moveInput.toLowerCase().contains(s)){
                return false
            }
            index.add(move.moveInput.substring(substring).toLowerCase().indexOf(s))
            substring = index.last() + 1
        }
        var i = 0

        if(move.moveInput.toLowerCase().contains("or")) {
            while (i < index.size - 1) {
                if (index[i] > index[i + 1]) {
                    return false
                }
                i++
            }
            return true
        }else{
            i = 0
            while (i < index.size - 1) {
                if (index[i] > index[i + 1] || index[i+1] - index[i] > 3) {
                    return false
                }
                i++
            }
        }
        return true
    }
}