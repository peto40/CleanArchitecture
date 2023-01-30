package com.hfad.android.cleanarchitecture.cleancodetest.di

import com.hfad.android.cleanarchitecture.cleancodetest.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel<MainViewModel>{
        MainViewModel(
            getUserNameUseCase = get(),
            saveUserNameUseCase = get()
        )
    }
}