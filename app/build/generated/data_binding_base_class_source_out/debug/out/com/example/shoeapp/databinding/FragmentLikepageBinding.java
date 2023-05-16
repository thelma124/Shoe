// Generated by view binder compiler. Do not edit!
package com.example.shoeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.shoeapp.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLikepageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialToolbar likeActualToolbar;

  @NonNull
  public final Toolbar likeToolbar;

  @NonNull
  public final RecyclerView rvLikedProducts;

  private FragmentLikepageBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialToolbar likeActualToolbar, @NonNull Toolbar likeToolbar,
      @NonNull RecyclerView rvLikedProducts) {
    this.rootView = rootView;
    this.likeActualToolbar = likeActualToolbar;
    this.likeToolbar = likeToolbar;
    this.rvLikedProducts = rvLikedProducts;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLikepageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLikepageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_likepage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLikepageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.likeActualToolbar;
      MaterialToolbar likeActualToolbar = ViewBindings.findChildViewById(rootView, id);
      if (likeActualToolbar == null) {
        break missingId;
      }

      id = R.id.likeToolbar;
      Toolbar likeToolbar = ViewBindings.findChildViewById(rootView, id);
      if (likeToolbar == null) {
        break missingId;
      }

      id = R.id.rvLikedProducts;
      RecyclerView rvLikedProducts = ViewBindings.findChildViewById(rootView, id);
      if (rvLikedProducts == null) {
        break missingId;
      }

      return new FragmentLikepageBinding((ConstraintLayout) rootView, likeActualToolbar,
          likeToolbar, rvLikedProducts);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
