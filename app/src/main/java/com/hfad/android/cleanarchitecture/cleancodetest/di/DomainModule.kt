package com.hfad.android.cleanarchitecture.cleancodetest.di

import com.hfad.android.cleanarchitecture.data.repository.UserRepositoryImpl
import com.hfad.android.cleanarchitecture.data.storage.sharedprefs.SharedPrefUserStorage
import com.hfad.android.cleanarchitecture.domain.usecase.GetUserNameUseCase
import com.hfad.android.cleanarchitecture.domain.usecase.SaveUserNameUseCase
import org.koin.dsl.module


val domainModule = module {

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepository = get())
    }

    factory<GetUserNameUseCase> {
        GetUserNameUseCase(userRepository = get())
    }
}