package ru.albeiz.requests.responses

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import ru.albeiz.models.Recipe

class RecipeResponse {

    @SerializedName("recipe")
    @Expose
    private var recipe: Recipe? = null

    fun getRecipe(): Recipe? {
        return recipe
    }
    override fun toString(): String {
        return "RecipeResponse{recipe: $recipe}"
    }
}