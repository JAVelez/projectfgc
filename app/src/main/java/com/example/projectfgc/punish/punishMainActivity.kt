package com.example.projectfgc.punish

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.character.MainActivity
import com.example.projectfgc.data.characterFields
import com.example.projectfgc.data.createData.initCharacters
import com.example.projectfgc.data.moveFields
import kotlinx.android.synthetic.main.app_bar_layout.*
import kotlinx.android.synthetic.main.content_bridge_punish.*
import kotlinx.android.synthetic.main.moves_layout.view.*

class punishMainActivity : AppCompatActivity() {

    lateinit var character_list: RecyclerView
    val displayCharacterList: MutableList<characterFields> = ArrayList()
    val charactersList: MutableList<characterFields> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge_punish)
        toolbar.setTitle("")
        setSupportActionBar(toolbar)

        titleLogo.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }


        //  Get characterFields of chosen character
        val move : moveFields = intent.getSerializableExtra("move") as moveFields

        charactersList.addAll(initCharacters())
        displayCharacterList.addAll(charactersList)
        character_list = findViewById(R.id.bpCharactersLayout)

        //  Set values for move to punish
        val view = findViewById(R.id.bpConstraintLayout) as ConstraintLayout
        view.stickyMovesMoveName.text = move.moveName
        view.stickyMovesMoveNotation.text = move.moveInput
        view.stickyMovesSpeed.text = move.speed.toString()
        if(move.onBlock > 0)
            view.stickyMovesOnBlock.text = "+" + move.onBlock.toString()
        else
            view.stickyMovesOnBlock.text = move.onBlock.toString()
        view.stickyMovesOnHit.text = move.onHit

        bpCharactersLayout.layoutManager = LinearLayoutManager( this@punishMainActivity)
        bpCharactersLayout.adapter =
            punishCharacterAdapter(displayCharacterList, move)
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