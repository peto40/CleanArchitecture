package com.hfad.android.cleanarchitecture.domain.repository

import com.hfad.android.cleanarchitecture.domain.models.SaveUserNameParam
import com.hfad.android.cleanarchitecture.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}