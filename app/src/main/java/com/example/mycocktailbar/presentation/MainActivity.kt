package com.example.mycocktailbar.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycocktailbar.R
import com.example.mycocktailbar.data.CocktailDao
import com.example.mycocktailbar.data.CocktailDatabase
import com.example.mycocktailbar.data.CocktailRepositoryImpl
import com.example.mycocktailbar.domain.CocktailRepository
import com.example.mycocktailbar.domain.GetCocktailsListUseCase

class MainActivity : AppCompatActivity() {

    private lateinit var dao: CocktailDao
    private lateinit var getAllCocktailsUseCase: GetCocktailsListUseCase
    private lateinit var repository: CocktailRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dao = CocktailDatabase.getInstance(applicationContext).cocktailDao()
        repository = CocktailRepositoryImpl(dao)
        getAllCocktailsUseCase = GetCocktailsListUseCase(repository)


        supportFragmentManager.beginTransaction()
            .replace(R.id.container, GeneralFragment()).commit()
    }
}