package com.ankn.composepagingapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class ComposePagingApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ComposePagingApplication)
            modules()
        }
    }
}