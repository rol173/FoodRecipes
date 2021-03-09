package ru.albeiz.requests

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import ru.albeiz.requests.responses.RecipeResponse
import ru.albeiz.requests.responses.RecipeSearchResponse

interface RecipeApi {

    //SEARCH
    @GET("api/search")
    fun searchRecipe(
        @Query("q") query: String,
        @Query("page") page: String
    ): Call<RecipeSearchResponse>

    //GET RECIPE REQUEST
    @GET("api/get")
    fun getRecipe(
        @Query("rId") recipeId: String
    ): Call<RecipeResponse>
}