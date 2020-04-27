package com.example.projectfgc.character

import android.content.Intent
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.data.characterFields
import com.example.projectfgc.data.createData.setCharMovesList
import kotlinx.android.synthetic.main.char_layout.view.*

class characterAdapter(val charactersList: MutableList<characterFields>) : RecyclerView.Adapter<characterAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.card_char_layout, parent, false)
        return ViewHolder(layoutView)
    }
    override fun getItemCount() = charactersList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //  Assign values to correctly display the view of each character
        var char = charactersList[position]
        // Insert moves
        char = setCharMovesList(char)
        holder.view.charName.text = "${char.name}"
        holder.view.charImage.setImageDrawable(holder.view.context.getDrawable(char.imageName))

        //  Touch a character card to view moveslist
        holder.view.constraintLayout1.setOnClickListener {
                //d("${char.name}", "was selected at $position")
                val intent = Intent(holder.view.context, characterActivity::class.java)
                intent.putExtra("character", char)
                holder.view.context.startActivity(intent)
            }
        holder.view.favBtn.setOnClickListener {
            holder.view.favBtn.setImageResource(R.drawable.ic_favorite_24dp)
            Toast.makeText(holder.view.context, "${charactersList[position].name} was added to favorites", Toast.LENGTH_SHORT).show()
        }

    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)

}