package com.stvayush.recipebook.requests

import com.stvayush.recipebook.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Authored by s-ayush2903 on 17/7/20
 */

/** This object is useless now, we've used hilt for injecting retrofit! */
object ServiceGenerator {

//    var retrofitBuilder: Retrofit.Builder = Retrofit.Builder()
//        .baseUrl(Constants.BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create())
//    private var retrofit = retrofitBuilder.build()
//
//    private var recipeApi = retrofit.create(RecipeApi::class.java)
//    var getRecipeApi: RecipeApi = recipeApi
}