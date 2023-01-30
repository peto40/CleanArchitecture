package com.hfad.android.cleanarchitecture.data.storage

import com.hfad.android.cleanarchitecture.data.storage.models.User


interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}