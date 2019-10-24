package com.example.projectfgc.move

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectfgc.R
import com.example.projectfgc.data.priorityMoveFields
import kotlinx.android.synthetic.main.activity_move_screen.*

class moveActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_screen)

        //  Receive move data
        val move : priorityMoveFields = intent.getSerializableExtra("move") as priorityMoveFields
        moveName.text = move.moveName
        moveInput.text = move.moveInput

        if(!move.natural)
            moveSpeed.text = "(" + move.speed.toString() + ")"
        else moveSpeed.text = move.speed.toString()

        moveHitProperty.text = move.hitProperty
        if(move.onBlock > 0)
            moveOnBlock.text = "+" + move.onBlock.toString()
        else
            moveOnBlock.text = move.onBlock.toString()
        moveOnHit.text = move.onHit
        moveOnCounterHit.text = move.onCounterHit
        moveDmg.text = move.dmg.toString()
        if(!move.natural)
            moveNatural.text = "No"
        else moveNatural.text = "Yes"


    }

}