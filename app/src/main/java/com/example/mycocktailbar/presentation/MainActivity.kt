package com.example.mycocktailbar.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycocktailbar.R
import com.example.mycocktailbar.data.AppDatabase
import com.example.mycocktailbar.data.CocktailRepositoryImpl
import com.example.mycocktailbar.domain.GetCocktailsListUseCase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, GeneralFragment()).commit()
    }
}