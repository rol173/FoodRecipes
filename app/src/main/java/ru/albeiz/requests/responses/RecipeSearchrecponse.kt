package ru.albeiz.requests.responses

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import ru.albeiz.models.Recipe

class RecipeSearchResponse {

    @SerializedName("count")
    @Expose
    private var count: Int = 0

    @SerializedName("recipes")
    @Expose
    private var recipes: List<Recipe>? = null

    fun getCount(): Int {
        return count
    }

    fun getRecipes(): List<Recipe>? {
        return recipes
    }

    override fun toString(): String {
        return "RecipeSearchResponse{" +
                "count= $count" +
                "recipes= $recipes}"
    }
}