package com.example.android.dagger.di.component

import android.content.Context
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.main.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubComponents::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context) : AppComponent
    }

    /**
     * register the sub component for the appComponent
     */
    fun registrationComponent(): RegistrationComponent.Factory

    /**
     * the LoginActivity inject function
     */
    fun inject(loginActivity: LoginActivity)

    /**
     * the MainActivity inject function
     */
    fun inject(mainActivity: MainActivity)

}