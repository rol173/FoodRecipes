package ru.albeiz.viewmodels

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.albeiz.models.Recipe

class RecipeListViewmodel: ViewModel() {

    private var mRecipes = MutableLiveData<List<Recipe>>()

    fun getRecipes(): LiveData<List<Recipe>> {
        return mRecipes
    }
}