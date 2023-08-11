package com.example.mycocktailbar.domain

import androidx.lifecycle.LiveData

interface CocktailRepository {

    suspend fun addCocktail(cocktailEntity: CocktailEntity)

    suspend fun getCocktailById(cocktailId: Int): CocktailEntity

    fun getCocktailsList(): LiveData<List<CocktailEntity>>


}