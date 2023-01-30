package com.hfad.android.cleanarchitecture.domain.usecase

import com.hfad.android.cleanarchitecture.domain.models.UserName
import com.hfad.android.cleanarchitecture.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {

        return userRepository.getName()
    }
}