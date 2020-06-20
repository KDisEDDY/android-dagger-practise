package com.example.android.dagger.component

import android.content.Context
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [StorageModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context) : AppComponent
    }

    /**
     * the RegistrationActivity inject function
     */
    fun inject(registrationActivity: RegistrationActivity)

    /**
     * the LoginActivity inject function
     */
    fun inject(loginActivity: LoginActivity)

    /**
     * the MainActivity inject function
     */
    fun inject(mainActivity: MainActivity)
}