package com.example.android.dagger.di.component

import com.example.android.dagger.di.scope.ActivityScope
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@Subcomponent
@ActivityScope
interface RegistrationComponent {


    @Subcomponent.Factory
    interface Factory {
        fun create() : RegistrationComponent
    }

    /**
     * the RegistrationActivity inject function
     */
    fun inject(registrationActivity: RegistrationActivity)
    /**
     * the EnterDetailsFragment inject function
     */
    fun inject(enterDetailsFragment: EnterDetailsFragment)

    /**
     * the TermsAndConditionsFragment inject function
     */
    fun inject(termsAndConditionsFragment: TermsAndConditionsFragment)
}