// Generated by view binder compiler. Do not edit!
package com.example.shoeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
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

public final class FragmentDetailspageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnDetailsAddToCart;

  @NonNull
  public final MaterialToolbar detailActualToolbar;

  @NonNull
  public final Toolbar detailToolbar;

  @NonNull
  public final ImageView ivDetails;

  @NonNull
  public final LinearLayout llBottomDetails;

  @NonNull
  public final RecyclerView rvSelectSize;

  @NonNull
  public final TextView tvDetailsProductDescription;

  @NonNull
  public final TextView tvDetailsProductName;

  @NonNull
  public final TextView tvDetailsProductPrice;

  private FragmentDetailspageBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnDetailsAddToCart, @NonNull MaterialToolbar detailActualToolbar,
      @NonNull Toolbar detailToolbar, @NonNull ImageView ivDetails,
      @NonNull LinearLayout llBottomDetails, @NonNull RecyclerView rvSelectSize,
      @NonNull TextView tvDetailsProductDescription, @NonNull TextView tvDetailsProductName,
      @NonNull TextView tvDetailsProductPrice) {
    this.rootView = rootView;
    this.btnDetailsAddToCart = btnDetailsAddToCart;
    this.detailActualToolbar = detailActualToolbar;
    this.detailToolbar = detailToolbar;
    this.ivDetails = ivDetails;
    this.llBottomDetails = llBottomDetails;
    this.rvSelectSize = rvSelectSize;
    this.tvDetailsProductDescription = tvDetailsProductDescription;
    this.tvDetailsProductName = tvDetailsProductName;
    this.tvDetailsProductPrice = tvDetailsProductPrice;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailspageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailspageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detailspage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailspageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDetailsAddToCart;
      AppCompatButton btnDetailsAddToCart = ViewBindings.findChildViewById(rootView, id);
      if (btnDetailsAddToCart == null) {
        break missingId;
      }

      id = R.id.detailActualToolbar;
      MaterialToolbar detailActualToolbar = ViewBindings.findChildViewById(rootView, id);
      if (detailActualToolbar == null) {
        break missingId;
      }

      id = R.id.detailToolbar;
      Toolbar detailToolbar = ViewBindings.findChildViewById(rootView, id);
      if (detailToolbar == null) {
        break missingId;
      }

      id = R.id.ivDetails;
      ImageView ivDetails = ViewBindings.findChildViewById(rootView, id);
      if (ivDetails == null) {
        break missingId;
      }

      id = R.id.llBottomDetails;
      LinearLayout llBottomDetails = ViewBindings.findChildViewById(rootView, id);
      if (llBottomDetails == null) {
        break missingId;
      }

      id = R.id.rvSelectSize;
      RecyclerView rvSelectSize = ViewBindings.findChildViewById(rootView, id);
      if (rvSelectSize == null) {
        break missingId;
      }

      id = R.id.tvDetailsProductDescription;
      TextView tvDetailsProductDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvDetailsProductDescription == null) {
        break missingId;
      }

      id = R.id.tvDetailsProductName;
      TextView tvDetailsProductName = ViewBindings.findChildViewById(rootView, id);
      if (tvDetailsProductName == null) {
        break missingId;
      }

      id = R.id.tvDetailsProductPrice;
      TextView tvDetailsProductPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvDetailsProductPrice == null) {
        break missingId;
      }

      return new FragmentDetailspageBinding((ConstraintLayout) rootView, btnDetailsAddToCart,
          detailActualToolbar, detailToolbar, ivDetails, llBottomDetails, rvSelectSize,
          tvDetailsProductDescription, tvDetailsProductName, tvDetailsProductPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
