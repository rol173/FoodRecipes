package ru.albeiz.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipe(
    val title: String,
    val publisher: String,
    val ingredients: List<String>,
    val recipe_id: String,
    val image_url: String,
    val social_rank: Float
): Parcelable