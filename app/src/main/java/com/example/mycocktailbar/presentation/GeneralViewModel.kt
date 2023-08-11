package com.example.mycocktailbar.presentation

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import com.example.mycocktailbar.data.AppDatabase
import com.example.mycocktailbar.data.CocktailDao
import com.example.mycocktailbar.data.CocktailRepositoryImpl
import com.example.mycocktailbar.domain.CocktailRepository
import com.example.mycocktailbar.domain.GetCocktailsListUseCase
import java.security.AccessControlContext

class GeneralViewModel(context: Application) : AndroidViewModel(context) {

    private lateinit var dao: CocktailDao
    private lateinit var getCocktailsListUseCase: GetCocktailsListUseCase
    private lateinit var repository: CocktailRepository

    init {
        dao = AppDatabase.getInstance(context).cocktailDao()
        repository = CocktailRepositoryImpl(dao)
        getCocktailsListUseCase = GetCocktailsListUseCase(repository)
    }


}