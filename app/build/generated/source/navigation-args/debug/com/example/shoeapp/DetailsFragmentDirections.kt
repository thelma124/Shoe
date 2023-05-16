package com.example.shoeapp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class DetailsFragmentDirections private constructor() {
  public companion object {
    public fun actionDetailsFragmentToCartFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_detailsFragment_to_cartFragment)
  }
}
