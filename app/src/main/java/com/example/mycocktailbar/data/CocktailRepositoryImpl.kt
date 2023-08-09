package com.example.mycocktailbar.data

import androidx.lifecycle.LiveData
import com.example.mycocktailbar.domain.CocktailEntity
import com.example.mycocktailbar.domain.CocktailRepository

class CocktailRepositoryImpl(private val dao: CocktailDao): CocktailRepository {
    override suspend fun addCocktail(cocktailEntity: CocktailEntity) {
        dao.addCocktail(cocktailEntity)
    }

//    override suspend fun getCocktailById(cocktailId: Int): CocktailEntity =
//        dao.getCocktailById(cocktailId)


//    override fun getCocktailsList(): LiveData<List<CocktailEntity>> =
//        dao.getCocktailList()

}