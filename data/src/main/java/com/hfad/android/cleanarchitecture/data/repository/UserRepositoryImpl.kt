package com.hfad.android.cleanarchitecture.data.repository

import com.hfad.android.cleanarchitecture.data.storage.models.User
import com.hfad.android.cleanarchitecture.data.storage.UserStorage
import com.hfad.android.cleanarchitecture.domain.models.SaveUserNameParam
import com.hfad.android.cleanarchitecture.domain.models.UserName
import com.hfad.android.cleanarchitecture.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {


    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val user = User(firstName = saveParam.name, "")

        return userStorage.save(user)
    }

    override fun getName(): UserName {
        val user = userStorage.get()

        return UserName(firstName = user.firstName, lastName = user.lastName)
    }
}