package com.hfad.android.cleanarchitecture.data.storage.sharedprefs

import android.content.Context
import android.content.SharedPreferences
import com.hfad.android.cleanarchitecture.data.storage.UserStorage
import com.hfad.android.cleanarchitecture.data.storage.models.User

private const val SHARED_PREFS_NAME = "shared_prefs_name"
private const val KEY_FIRST_NAME = "first_name"
private const val KEY_LAST_NAME = "last_name"
private const val DEFAULT_FIRST_NAME = "default_name"
private const val DEFAULT_LAST_NAME = "default_name"

class SharedPrefUserStorage(context: Context) : UserStorage {
    val sharedPreferences: SharedPreferences =
            context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)


    override fun save(user: User): Boolean {
        sharedPreferences.edit().putString(KEY_FIRST_NAME, user.firstName).apply()
        sharedPreferences.edit().putString(KEY_LAST_NAME, user.lastName).apply()
        return true
    }

    override fun get(): User {
        val firsName = sharedPreferences.getString(KEY_FIRST_NAME, DEFAULT_FIRST_NAME) ?: DEFAULT_FIRST_NAME
        val lastName = sharedPreferences.getString(KEY_LAST_NAME, DEFAULT_LAST_NAME) ?: DEFAULT_LAST_NAME
        return User(firstName = firsName, lastName = lastName)
    }


}