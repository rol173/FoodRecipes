package ru.albeiz.requests

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.albeiz.util.BASE_URL

object ServiceGenerator {

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val recipeApi = retrofit.create(RecipeApi::class.java)

    fun getRecipeApi(): RecipeApi {
        return recipeApi
    }


    init {


    }
}