package com.example.android.dagger.component

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Component

@Component
interface AppComponent {

    /**
     * the RegistrationActivity inject function
     */
    fun inject(registrationActivity: RegistrationActivity)
}