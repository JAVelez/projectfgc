package com.example.projectfgc.character

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.children
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.data.characterFields
import com.example.projectfgc.data.createData
import com.example.projectfgc.data.priorityMoveFields
import com.example.projectfgc.general.generalCharacterActivity
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
        charBannerClickable.setOnClickListener {
            val intent = Intent(this, generalCharacterActivity::class.java)
            intent.putExtra("character", character)
            this.startActivity(intent)
        }

        return character
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.search_filter_menu, menu)
        val reset = menu.findItem(R.id.reset)
        reset.setOnMenuItemClickListener {
            Toast.makeText(this@characterActivity, reset.title, Toast.LENGTH_SHORT).show()
            displayMoveList.clear()
            displayMoveList.addAll(moveList)
            move_list.adapter?.notifyDataSetChanged()
            true
        }

        // Filter launchers
        val launcher = menu.findItem(R.id.launcher)
        launcher.setOnMenuItemClickListener {
            Toast.makeText(this@characterActivity, "Launchers on hit or on counterhit", Toast.LENGTH_SHORT).show()
            displayMoveList.clear()
            for(m in moveList){
                if(m.onHit == createData.la || m.onHit == createData.ls || m.onHit == createData.lastb
                    || m.onCounterHit == createData.la || m.onCounterHit == createData.ls || m.onCounterHit == createData.lastb){
                    displayMoveList.add(m)
                }
            }
            move_list.adapter?.notifyDataSetChanged()
            true
        }
        // Filter knockdown moves
        val knd = menu.findItem(R.id.knd)
        knd.setOnMenuItemClickListener {
            Toast.makeText(this@characterActivity, "Knockdown on hit or on counterhit", Toast.LENGTH_SHORT).show()
            displayMoveList.clear()
            for(m in moveList){
                if(m.onHit == createData.k || m.onHit == createData.kstb
                    || m.onCounterHit == createData.k || m.onCounterHit == createData.kstb){
                    displayMoveList.add(m)
                }
            }
            move_list.adapter?.notifyDataSetChanged()
            true
        }
//        // Filter single low moves
//        val low = menu.findItem(R.id.lows)
//        low.setOnMenuItemClickListener {
//            Toast.makeText(this@characterActivity, low.title, Toast.LENGTH_SHORT).show()
//            displayMoveList.clear()
//            for(m in moveList){
//                if(m.hitProperty.indexOf(createData.l) == 0){
//                    displayMoveList.add(m)
//                }
//            }
//            move_list.adapter?.notifyDataSetChanged()
//            true
//        }
        // Filter strings that contain lows in them
        val low = menu.findItem(R.id.lows)
        low.setOnMenuItemClickListener {
            Toast.makeText(this@characterActivity, low.title, Toast.LENGTH_SHORT).show()
            displayMoveList.clear()
            for(m in moveList){
                if(m.hitProperty.contains(createData.l)){
                    displayMoveList.add(m)
                }
            }
            move_list.adapter?.notifyDataSetChanged()
            true
        }
//        val homing = menu.findItem(R.id.homing)
//        homing.setOnMenuItemClickListener {
//            Toast.makeText(this@characterActivity, homing.title, Toast.LENGTH_SHORT).show()
//            true
//        }
        // Filter + on block moves
        val plusOnBlock = menu.findItem(R.id.plus)
        plusOnBlock.setOnMenuItemClickListener {
            Toast.makeText(this@characterActivity, plusOnBlock.title, Toast.LENGTH_SHORT).show()
            displayMoveList.clear()
            for(m in moveList){
                if(m.onBlock > 0){
                    displayMoveList.add(m)
                }
            }
            move_list.adapter?.notifyDataSetChanged()
            true
        }
        // Filter punishable moves (-10 or more)
        val punishable = menu.findItem(R.id.punishable)
        punishable.setOnMenuItemClickListener {
            Toast.makeText(this@characterActivity, "Punishable Strings", Toast.LENGTH_SHORT).show()
            displayMoveList.clear()
            for(m in moveList){
                if(m.onBlock <= -10){
                    displayMoveList.add(m)
                }
            }
            move_list.adapter?.notifyDataSetChanged()
            true
        }


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