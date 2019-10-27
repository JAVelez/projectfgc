package com.example.projectfgc.punish

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectfgc.R
import com.example.projectfgc.character.MainActivity
import com.example.projectfgc.data.characterFields
import com.example.projectfgc.data.priorityMoveFields
import com.example.projectfgc.move.moveAdapter
import kotlinx.android.synthetic.main.app_bar_layout.*
import kotlinx.android.synthetic.main.content_punish_character_screen.*
import kotlinx.android.synthetic.main.content_character_screen.view.*
import kotlinx.android.synthetic.main.char_layout.view.*
import kotlinx.android.synthetic.main.moves_layout.view.*
import java.lang.Math.abs

class punishCharacterActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_punish_character_screen)

        titleLogo.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        //  Get characterFields of chosen character
        val character = setCharBanner()

        //helpButton.visibility = Button.GONE

        //  Get characterFields of chosen character
        val move : priorityMoveFields = intent.getSerializableExtra("move") as priorityMoveFields

        //  Set values for move to punish
        val view = findViewById(R.id.pcConstraintLayout) as ConstraintLayout
        view.stickyMovesMoveName.text = move.moveName
        view.stickyMovesMoveNotation.text = move.moveInput
        view.stickyMovesSpeed.text = move.speed.toString()
        if(move.onBlock > 0)
            view.stickyMovesOnBlock.text = "+" + move.onBlock.toString()
        else
            view.stickyMovesOnBlock.text = move.onBlock.toString()
        view.stickyMovesOnHit.text = move.onHit
        view.stickyMovesDmg.text = move.totalDmg.toString()


        //  Make a punisher only list to pass onto moveAdapter
        val punishers = mutableListOf<priorityMoveFields>()

        //  Cover SEN case where SEN is a high crush
        if(move.hitProperty[move.hitProperty.size-1] == "(SEN)"){
            for (m in character.moveList){
                if(m.speed<=abs(move.onBlock) && m.natural && m.hitProperty[0] == "m" ){
                    if(!m.crouch){
                        punishers.add(m)
                    }
                }
            }
            Toast.makeText(view.context, "Use a long range and low hitting mid as a punish!", Toast.LENGTH_LONG).show()
        }else{
            for (m in character.moveList) {
                //  Cover low cases
                if (move.hitProperty.get(move.hitProperty.size - 1) == "l") {   //this will not consider cancels after lows or sway after a low and will display standing punishes
                    //d("low", "${m.crouch} ${m.moveInput}")
                    if(m.crouch) {
                        if (m.speed <= abs(move.onBlock) && m.natural) {
                            punishers.add(m)
                        }
                    }
                }else if (m.speed <= abs(move.onBlock)) {
                    //d("highmid", "${move.moveInput}")
                    if(m.natural) {
                        if(move.forceCrouch) {
                            if (m.crouch)
                                punishers.add(m)
                        }else if(!m.crouch)
                            punishers.add(m)
                    }
                }
            }
        }

        //  Sort punishers by priority
        //  Could be more efficient if we pass a comparator that sorts the list in reverse
        punishers.sortBy { it.priority }
        punishers.reverse()
        punishLayout.movesRecView.apply{
            layoutManager = LinearLayoutManager( this@punishCharacterActivity)
            adapter = moveAdapter(punishers, 1)
            val divItemDecor = DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL)
            divItemDecor.setDrawable(resources.getDrawable(R.drawable.divider))
            addItemDecoration(divItemDecor)
        }

    }

    private fun setCharBanner(): characterFields {
        //  Get characterFields of chosen character
        val character : characterFields = intent.getSerializableExtra("character") as characterFields
        val charView = findViewById<ConstraintLayout>(R.id.charBanner)
        charView.charName.text = character.name
        charView.charImage.setImageDrawable(getDrawable(character.imageName))
        return character
    }

}