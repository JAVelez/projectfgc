package com.example.projectfgc.move

import android.app.ProgressDialog.show
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.data.priorityMoveFields
import com.example.projectfgc.punish.punishMainActivity
import kotlinx.android.synthetic.main.moves_layout.view.*

class moveAdapter(val moveList: List<priorityMoveFields>, val state: Int) : RecyclerView.Adapter<moveAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.moves_layout, parent, false)
        return ViewHolder(layoutView)
    }

    override fun getItemCount()= moveList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //  Assign values to correctly display the view of each move
        val move = moveList[position]
        holder.view.stickyMovesMoveName.text = move.moveName
        holder.view.stickyMovesMoveNotation.text = move.moveInput
        holder.view.stickyMovesSpeed.text = move.speed.toString()
        if(move.onBlock > 0)
            holder.view.stickyMovesOnBlock.text = "+" + move.onBlock.toString()
        else
            holder.view.stickyMovesOnBlock.text = move.onBlock.toString()
        holder.view.stickyMovesOnHit.text = move.onHit
        holder.view.stickyMovesDmg.text = move.totalDmg.toString()

        // Touch a move to expand details
        // Hay un detalle en moves_layout con el height y los constraints en donde se supone que aqui haya hecho dos onClickListeners


        holder.view.stickyMovesMoveName.setOnClickListener {
            val intent = Intent(holder.view.context, moveActivity::class.java)
            intent.putExtra("move", move)
            holder.view.context.startActivity(intent)
        }
        if (state == 0) {

            holder.view.stickyMovesOnBlock.setOnClickListener {
                if (move.onBlock <= -10) {
                    val intent = Intent(holder.view.context, punishMainActivity::class.java)
                    intent.putExtra("move", move)
                    holder.view.context.startActivity(intent)
                } else {
                    Toast.makeText(holder.view.context, "The move isn't punishable!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)

}