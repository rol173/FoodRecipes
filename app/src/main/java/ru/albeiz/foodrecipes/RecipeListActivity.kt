package ru.albeiz.foodrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import ru.albeiz.models.Recipe
import ru.albeiz.requests.responses.RecipeSearchResponse

class RecipeListActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        findViewById<Button>(R.id.test).setOnClickListener {
            if (mProgressBar.visibility == View.VISIBLE) {
                showProgressBar(false)
            } else {
                showProgressBar(true)
            }
        }
    }
}