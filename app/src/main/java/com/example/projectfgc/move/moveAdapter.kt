package com.example.projectfgc.move

import android.content.Intent
import android.util.Log.d
import android.view.*
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.projectfgc.R
import com.example.projectfgc.data.createData
import com.example.projectfgc.data.priorityMoveFields
import com.example.projectfgc.punish.punishMainActivity
import kotlinx.android.synthetic.main.moves_layout.view.*

class moveAdapter(val moveList: List<priorityMoveFields>, val state: Int) : RecyclerView.Adapter<moveAdapter.ViewHolder>(){

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

        holder.view.detailButton.setOnClickListener {
            val intent = Intent(holder.view.context, moveActivity::class.java)
            intent.putExtra("move", move)
            holder.view.context.startActivity(intent)
        }

        if (state == 0) {

            holder.view.punishButton.setOnClickListener {
                if (move.onBlock <= -10) {
                    val intent = Intent(holder.view.context, punishMainActivity::class.java)
                    intent.putExtra("move", move)
                    holder.view.context.startActivity(intent)
                } else {
                    var response = createData.getRecommendation(move)
                    if (move.onBlock < -5 && response == "The string isn't punishable!"){
                        Toast.makeText(holder.view.context, response + " But it's your turn.", Toast.LENGTH_LONG).show()
                    }else {
                        d("response", "${response}")
                        Toast.makeText(holder.view.context, response, Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)

}