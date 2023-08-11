package com.example.mycocktailbar.presentation.reccler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycocktailbar.R
import com.example.mycocktailbar.domain.CocktailEntity

class CocktailsAdapter: RecyclerView.Adapter<CocktailViewHolder>() {
    var cocktailsList = listOf<CocktailEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CocktailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cocktail_entity, parent,false)
        return CocktailViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cocktailsList.size
    }

    override fun onBindViewHolder(holder: CocktailViewHolder, position: Int) {
        val cocktailItem = cocktailsList[position]
        holder.title.text = cocktailItem.title
        holder.description.text = cocktailItem.description
        holder.recipe.text = cocktailItem.recipe
    }

    fun updateList(newListCocktails: List<CocktailEntity>){
        cocktailsList = newListCocktails
    }
}