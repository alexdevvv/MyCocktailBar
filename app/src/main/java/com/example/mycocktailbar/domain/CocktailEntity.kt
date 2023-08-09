package com.example.mycocktailbar.domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cocktail_table")
data class CocktailEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String = "",
    val recipe: String = ""
)