package com.example.mycocktailbar.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mycocktailbar.domain.CocktailEntity

@Dao
interface CocktailDao {

    @Insert
    suspend fun addCocktail(cocktailEntity: CocktailEntity)

//    @Query("SELECT * FROM cocktail_table")
//     fun getCocktailList(): LiveData<List<CocktailEntity>>
//
//    @Query("SELECT * FROM cocktail_table WHERE id = :cocktailId")
//    suspend fun getCocktailById(cocktailId: Int): CocktailEntity






}