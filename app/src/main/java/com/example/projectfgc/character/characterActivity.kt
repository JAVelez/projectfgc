package com.example.projectfgc.character

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectfgc.R
import com.example.projectfgc.data.characterFields
import com.example.projectfgc.move.moveAdapter
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_character_screen.*
import kotlinx.android.synthetic.main.char_layout.view.*

class characterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_screen)

        helpSnackBar()

        val character: characterFields = setCharBanner()

//        helpButton.setOnClickListener {
//            helpSnackBar()
//        }

        movesRecView.apply{
            layoutManager = LinearLayoutManager( this@characterActivity)
            adapter = moveAdapter(character.moveList, 0)
        }
    }

    private fun helpSnackBar(){
        Snackbar.make(linearLayout, "\"Move\" opens up details. \"On Block\" opens up punishes.", Snackbar.LENGTH_LONG).show()
    }

    private fun setCharBanner(): characterFields {
        //  Get characterFields of chosen character
        val character : characterFields = intent.getSerializableExtra("character") as characterFields
        val view = findViewById<ConstraintLayout>(R.id.charBanner)
        view.charName.text = character.name
        view.charImage.setImageDrawable(getDrawable(character.imageName))
        return character
    }

}