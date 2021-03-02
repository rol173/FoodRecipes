package ru.albeiz.foodrecipes

import android.view.View
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import ru.albeiz.util.CONNECTION_TIMEOUT

abstract class BaseActivity: AppCompatActivity() {

    protected lateinit var mProgressBar: ProgressBar;


    override fun setContentView(layoutResID: Int) {
        var constraintLayout = layoutInflater.inflate(R.layout.activity_base, null)
        var frameLayout = constraintLayout.findViewById<FrameLayout>(R.id.activity_content)

        mProgressBar = constraintLayout.findViewById<ProgressBar>(R.id.progress_bar)

        layoutInflater.inflate(layoutResID, frameLayout, true)

        super.setContentView(layoutResID)
    }

    protected fun showProgressBar(visibility: Boolean) {
        mProgressBar.visibility = if (visibility) View.VISIBLE else View.INVISIBLE
    }


}