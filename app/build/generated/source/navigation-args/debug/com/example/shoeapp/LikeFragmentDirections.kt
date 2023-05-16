package com.example.shoeapp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class LikeFragmentDirections private constructor() {
  public companion object {
    public fun actionLikeFragment2ToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_likeFragment2_to_mainFragment)
  }
}
