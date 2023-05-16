package com.example.shoeapp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class SignUpFragmentDirections private constructor() {
  public companion object {
    public fun actionSignUpFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpFragment_to_mainFragment)

    public fun actionSignUpFragmentToSignInFragmentFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpFragment_to_signInFragmentFragment)
  }
}
