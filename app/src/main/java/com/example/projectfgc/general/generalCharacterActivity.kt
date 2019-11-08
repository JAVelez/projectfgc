package com.example.projectfgc.general

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.character.MainActivity
import com.example.projectfgc.data.characterFields
import com.example.projectfgc.data.priorityMoveFields
import com.example.projectfgc.move.moveAdapter
import kotlinx.android.synthetic.main.app_bar_layout.*
import kotlinx.android.synthetic.main.char_layout.view.*
import kotlinx.android.synthetic.main.content_character_general_info.*
import java.io.Serializable

class generalCharacterActivity: AppCompatActivity() {

    lateinit var recMoveList: RecyclerView
    val moveList: MutableList<priorityMoveFields> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_general_info)
        toolbar.setTitle("")
        setSupportActionBar(toolbar)
        titleLogo.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
        val char: characterFields = setCharBanner()

        // prepare the bundle to be sent to each necessary fragment
        val bundle = Bundle().apply{
            putSerializable("character", char)
        }

        // create coreMoves fragment and pass bundle as a argument
        val coreFrag = coreMovesFragment()
        coreFrag.arguments = bundle

        // ViewPageAdapter is init, coreFrag is added
        val vpa = ViewPagerAdapter(supportFragmentManager)
        vpa.addFragment(coreFrag, "Core Moves")
        // assign the adapter to the viewPager in the xml file
        viewPager.adapter = vpa
        // setup the tabs (in the xml file) to have viewPager
        tabs.setupWithViewPager(viewPager)

    }

    private fun setCharBanner(): characterFields {
        //  Get characterFields of chosen character
        val character: characterFields = intent.getSerializableExtra("character") as characterFields
        val view = findViewById<ConstraintLayout>(R.id.charBannerGeneral)
        view.charName.text = character.name
        view.charImage.setImageDrawable(getDrawable(character.imageName))
        return character
    }

}