package com.example.projectfgc.character

import android.os.Bundle
import android.view.Menu
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
        charRecView.layoutManager = LinearLayoutManager( this@MainActivity)
        charRecView.adapter = characterAdapter(displayCharacterList)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.search_menu, menu)
        var searchItem = menu.findItem(R.id.app_bar_search)

        if(searchItem != null){
            var searchView = searchItem.actionView as SearchView

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

                override fun onQueryTextSubmit(query: String?): Boolean {
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
            searchView.setQuery("", false)
            searchView.isIconified
        }
        return super.onCreateOptionsMenu(menu)
    }

}
