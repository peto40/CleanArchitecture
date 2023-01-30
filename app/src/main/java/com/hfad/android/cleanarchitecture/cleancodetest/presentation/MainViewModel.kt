package com.hfad.android.cleanarchitecture.cleancodetest.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hfad.android.cleanarchitecture.domain.models.SaveUserNameParam
import com.hfad.android.cleanarchitecture.domain.usecase.GetUserNameUseCase
import com.hfad.android.cleanarchitecture.domain.usecase.SaveUserNameUseCase

class MainViewModel(
    private val getUserNameUseCase: GetUserNameUseCase,
    private val saveUserNameUseCase: SaveUserNameUseCase
): ViewModel() {

    private val mutableResultLive = MutableLiveData<String>()
    val resultLive: LiveData<String> = mutableResultLive

    fun save(text: String) {
        val params = SaveUserNameParam(name = text)
        val result: Boolean = saveUserNameUseCase.execute(param = params)
        mutableResultLive.value =  "Save result = $result"
    }

    fun load() {
        val userName = getUserNameUseCase.execute()

        mutableResultLive.value = "${userName.firstName} ${userName.lastName}"
    }

}