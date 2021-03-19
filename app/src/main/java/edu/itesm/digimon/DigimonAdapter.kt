package edu.itesm.digimon

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DigimonAdapter(private val digimon_list: List<Digimon>)
    : RecyclerView.Adapter<DigimonAdapter.DigimonViewHolder>(){

    var context: Context? = null

    inner class DigimonViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var name_digi = renglon.findViewById<TextView>(R.id.name)
        var stage_digi = renglon.findViewById<TextView>(R.id.stage)
        var desc_digi = renglon.findViewById<TextView>(R.id.description)
        var pic_digi = renglon.findViewById<ImageView>(R.id.picture)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DigimonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.digimon_renglon, parent, false)
        return DigimonViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: DigimonViewHolder, position: Int) {
        val digimon = digimon_list[position]
        holder.pic_digi.setImageResource(digimon.picture)
        holder.name_digi.text = digimon.name
        holder.stage_digi.text = digimon.stage
        holder.desc_digi.text = digimon.description

        context = holder.itemView.context

        holder.itemView.setOnClickListener{
            val text = "Hello " +digimon.name+ " you are nice!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(context, text, duration)
            toast.show()
        }

    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return digimon_list.size
    }
}