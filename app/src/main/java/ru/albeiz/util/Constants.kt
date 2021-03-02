package ru.albeiz.util

const val BASE_URL = "https://resipesapi.herokuapp.com"
const val API_KEY = ""

const val CONNECTION_TIMEOUT = 10
const val READ_TIMEOUT = 2
const val RECIPE_REFRESH_TIME = 60 * 60 * 24 * 30 //30 days in seconds

val DEFAULT_SEARCH_CATEGORIES = arrayOf(
    "Barbeque",
    "Breakfast",
    "Chicken",
    "Beef",
    "Brunch",
    "Dinner",
    "Wine",
    "Italian"
)

val DEFAULT_SEARCH_CATEGORY_IMAGES = arrayOf(
    "barbeque",
    "breakfast",
    "chicken",
    "beef",
    "brunch",
    "dinner",
    "wine",
    "italian"
)
