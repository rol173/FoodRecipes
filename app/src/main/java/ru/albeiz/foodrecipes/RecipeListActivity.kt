package ru.albeiz.foodrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_recipe_list.*
import retrofit2.Call
import ru.albeiz.requests.ServiceGenerator
import ru.albeiz.requests.responses.RecipeSearchResponse
import retrofit2.Callback
import retrofit2.Response
import ru.albeiz.requests.responses.RecipeResponse

private const val TAG = "RecipeListActivity"

class RecipeListActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        test.setOnClickListener {
            if (mProgressBar.visibility == View.VISIBLE) {
                showProgressBar(false)
            } else {
                showProgressBar(true)
            }
            testRetrofitRequest()
        }
    }

    private fun testRetrofitRequest() {
        val recipeApi = ServiceGenerator.getRecipeApi()
        /*val responseCall = recipeApi.searchRecipe(
            "chicken breast",
            page = "1"
        )

        responseCall.enqueue(object: Callback<RecipeSearchResponse> {
            override fun onFailure(call: Call<RecipeSearchResponse>, t: Throwable) {
                Log.d(TAG, "onFailure: server failure: $t")
            }

            override fun onResponse(
                call: Call<RecipeSearchResponse>,
                response: Response<RecipeSearchResponse>
            ) {
                Log.d(TAG, "onResponse: server response: $response")
                if (response.isSuccessful) {
                    Log.d(TAG, "onResponse: ${response.body().toString()}")
                    val recipes = response.body()?.getRecipes()
                    recipes?.let{
                        for (recipe in recipes) {
                            Log.d(TAG, "onResponse: ${recipe.title}")
                        }
                    }
                }
            }
        }
        )*/
        val recipeResponse = recipeApi.getRecipe(recipeId = "41470")
        recipeResponse.enqueue(object : Callback<RecipeResponse> {

            override fun onFailure(call: Call<RecipeResponse>, t: Throwable) {
                Log.d(TAG, "onFailure: server failure: $t")
            }

            override fun onResponse(
                call: Call<RecipeResponse>,
                response: Response<RecipeResponse>
            ) {
                Log.d(TAG, "onResponse: server response: $response")
                if (response.isSuccessful) {
                    Log.d(TAG, "Recipes Body: ${response.body().toString()}")
                    val recipe = response.body()?.getRecipe()
                    Log.d(TAG, "Retrieved Recipe: $recipe")
                }
            }
        }
        )
    }
}