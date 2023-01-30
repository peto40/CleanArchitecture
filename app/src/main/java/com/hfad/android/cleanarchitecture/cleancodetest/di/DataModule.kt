package com.hfad.android.cleanarchitecture.cleancodetest.di

import com.hfad.android.cleanarchitecture.data.repository.UserRepositoryImpl
import com.hfad.android.cleanarchitecture.data.storage.UserStorage
import com.hfad.android.cleanarchitecture.data.storage.sharedprefs.SharedPrefUserStorage
import com.hfad.android.cleanarchitecture.domain.repository.UserRepository
import org.koin.dsl.module

val dataModule = module {

    single<UserStorage> {
        SharedPrefUserStorage(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }
}