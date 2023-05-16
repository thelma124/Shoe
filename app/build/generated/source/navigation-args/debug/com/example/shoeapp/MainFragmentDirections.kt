package com.example.shoeapp

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class MainFragmentDirections private constructor() {
  private data class ActionMainFragmentToDetailsFragment(
    public val productId: String = "null"
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mainFragment_to_detailsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("productId", this.productId)
        return result
      }
  }

  public companion object {
    public fun actionMainFragmentToDetailsFragment(productId: String = "null"): NavDirections =
        ActionMainFragmentToDetailsFragment(productId)

    public fun actionMainFragmentToSignInFragmentFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_signInFragmentFragment)

    public fun actionMainFragmentToCartFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_cartFragment)

    public fun actionMainFragmentSelf(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_self)

    public fun actionMainFragmentToLikeFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_likeFragment2)
  }
}
