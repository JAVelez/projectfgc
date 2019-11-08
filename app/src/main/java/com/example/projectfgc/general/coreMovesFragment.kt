package com.example.projectfgc.general

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.data.characterFields
import com.example.projectfgc.data.priorityMoveFields
import com.example.projectfgc.move.moveAdapter

class coreMovesFragment: Fragment() {

    lateinit var character: characterFields

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // create view -ish
        val v = inflater!!.inflate(R.layout.sub_content_character_screen, container, false)

        // get character information
        character = arguments?.getSerializable("character") as characterFields

        // get movesRecView to display core moves
        val recview: RecyclerView = v.findViewById(R.id.movesRecView)

        // filter out the character's core moves
        var coreMoves = mutableListOf<priorityMoveFields>()
        for (m in character.moveList){
            if(m.core){
                coreMoves.add(m)
            }
        }

        // call the movesAdapter to display the moves in its recyclerview
        recview.apply {
            layoutManager = LinearLayoutManager(v.context)
            adapter = moveAdapter(coreMoves, 0)   // state declares that it is coming from characterActivity or generalCharacterActivity instead of punishCharacterActivity
            val divItemDecor = DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL)
            divItemDecor.setDrawable(resources.getDrawable(R.drawable.divider))
            addItemDecoration(divItemDecor)
        }
        return v
    }
}