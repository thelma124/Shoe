package com.example.shoeapp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class SignInFragmentFragmentDirections private constructor() {
  public companion object {
    public fun actionSignInFragmentFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signInFragmentFragment_to_mainFragment)

    public fun actionSignInFragmentFragmentToSignUpFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signInFragmentFragment_to_signUpFragment)
  }
}
