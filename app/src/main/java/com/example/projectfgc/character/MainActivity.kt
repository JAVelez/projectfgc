package com.example.projectfgc.character

import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.data.characterFields
import com.example.projectfgc.data.createData.initCharacters

import kotlinx.android.synthetic.main.app_bar_layout.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    lateinit var character_list: RecyclerView
    val displayCharacterList: MutableList<characterFields> = ArrayList()
    val charactersList: MutableList<characterFields> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.setTitle("")
        setSupportActionBar(toolbar)

        charactersList.addAll(initCharacters())
        displayCharacterList.addAll(charactersList)


        character_list = findViewById(R.id.charRecView) as RecyclerView
        charRecView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = characterAdapter(displayCharacterList)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.search_menu, menu)
        val searchItem = menu.findItem(R.id.app_bar_search)
        val searchView = searchItem.actionView as SearchView

        if(searchItem != null){
            searchView.isIconified = false
            searchView.setOnCloseListener(object: SearchView.OnCloseListener {
                override fun onClose(): Boolean {
                    searchView.clearFocus()
                    return true
                }

            })

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

                override fun onQueryTextSubmit(query: String?): Boolean {
                    searchView.hideKeyboard()
                    return true
                }

                override fun onQueryTextChange(newText: String): Boolean {

                    if(newText.isNotEmpty()){
                        displayCharacterList.clear()

                        val search = newText.toLowerCase()
                        charactersList.forEach{
                            if(it.name.toLowerCase().contains(search)){
                                displayCharacterList.add(it)
                            }
                        }

                        character_list.adapter?.notifyDataSetChanged()
                    }else{
                        displayCharacterList.clear()
                        displayCharacterList.addAll(charactersList)
                        character_list.adapter?.notifyDataSetChanged()
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

}

fun View.showKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
}

fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(getWindowToken(), 0)
}