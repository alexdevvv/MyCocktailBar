package com.example.mycocktailbar.presentation.reccler_view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycocktailbar.R

class CocktailViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val title = itemView.findViewById<TextView>(androidx.core.R.id.title)
    val description = itemView.findViewById<TextView>(R.id.descEditText)
    val recipe = itemView.findViewById<TextView>(R.id.recipeEditText)
}