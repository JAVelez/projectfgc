package com.example.projectfgc.punish

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.data.characterFields
import kotlinx.android.synthetic.main.char_layout.view.*
import com.example.projectfgc.data.createData
import com.example.projectfgc.data.priorityMoveFields

class punishCharacterAdapter(val characterList: MutableList<characterFields>, val move: priorityMoveFields) : RecyclerView.Adapter<punishCharacterAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.card_char_layout, parent, false)

        return ViewHolder(layoutView)
    }

    override fun getItemCount() = characterList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {



        //  Assign values to correctly display the view of each character
        var char = characterList[position]
        // Insert moves
        char = createData.setCharMovesList(char)
        holder.view.charName.text = "${char.name}"
        holder.view.charImage.setImageDrawable(holder.view.context.getDrawable(char.imageName))

        //  Touch a character card to view their punishes to the move
        holder.view.constraintLayout1.setOnClickListener{
            Log.d("${char.name}", "was selected from punish at $position")
            val intent = Intent(holder.view.context, punishCharacterActivity::class.java)
            intent.putExtra("character", char)
            intent.putExtra("move", move)

            holder.view.context.startActivity(intent)
        }


    }
    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)

}