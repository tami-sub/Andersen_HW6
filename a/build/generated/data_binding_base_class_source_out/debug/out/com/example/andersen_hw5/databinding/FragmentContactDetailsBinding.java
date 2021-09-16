// Generated by view binder compiler. Do not edit!
package com.example.andersen_hw5.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.andersen_hw5.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentContactDetailsBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final EditText detailName;

  @NonNull
  public final EditText detailNumber;

  @NonNull
  public final EditText detailSurname;

  @NonNull
  public final ImageView imageView;

  private FragmentContactDetailsBinding(@NonNull FrameLayout rootView, @NonNull Button btnSave,
      @NonNull EditText detailName, @NonNull EditText detailNumber, @NonNull EditText detailSurname,
      @NonNull ImageView imageView) {
    this.rootView = rootView;
    this.btnSave = btnSave;
    this.detailName = detailName;
    this.detailNumber = detailNumber;
    this.detailSurname = detailSurname;
    this.imageView = imageView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentContactDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentContactDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_contact_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentContactDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_save;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.detailName;
      EditText detailName = ViewBindings.findChildViewById(rootView, id);
      if (detailName == null) {
        break missingId;
      }

      id = R.id.detailNumber;
      EditText detailNumber = ViewBindings.findChildViewById(rootView, id);
      if (detailNumber == null) {
        break missingId;
      }

      id = R.id.detailSurname;
      EditText detailSurname = ViewBindings.findChildViewById(rootView, id);
      if (detailSurname == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      return new FragmentContactDetailsBinding((FrameLayout) rootView, btnSave, detailName,
          detailNumber, detailSurname, imageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
