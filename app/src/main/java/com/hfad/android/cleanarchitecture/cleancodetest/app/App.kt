package com.hfad.android.cleanarchitecture.cleancodetest.app

import android.app.Application
import com.hfad.android.cleanarchitecture.cleancodetest.di.appModule
import com.hfad.android.cleanarchitecture.cleancodetest.di.dataModule
import com.hfad.android.cleanarchitecture.cleancodetest.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(appModule, dataModule, domainModule)
        }
    }


}