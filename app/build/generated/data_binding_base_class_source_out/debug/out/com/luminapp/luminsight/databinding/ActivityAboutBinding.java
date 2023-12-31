// Generated by view binder compiler. Do not edit!
package com.luminapp.luminsight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.luminapp.luminsight.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAboutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView img1;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final TextView tvAbout;

  @NonNull
  public final TextView tvNama;

  private ActivityAboutBinding(@NonNull LinearLayout rootView, @NonNull ImageView img1,
      @NonNull ImageView imgBack, @NonNull TextView tvAbout, @NonNull TextView tvNama) {
    this.rootView = rootView;
    this.img1 = img1;
    this.imgBack = imgBack;
    this.tvAbout = tvAbout;
    this.tvNama = tvNama;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img1;
      ImageView img1 = ViewBindings.findChildViewById(rootView, id);
      if (img1 == null) {
        break missingId;
      }

      id = R.id.img_back;
      ImageView imgBack = ViewBindings.findChildViewById(rootView, id);
      if (imgBack == null) {
        break missingId;
      }

      id = R.id.tv_about;
      TextView tvAbout = ViewBindings.findChildViewById(rootView, id);
      if (tvAbout == null) {
        break missingId;
      }

      id = R.id.tv_nama;
      TextView tvNama = ViewBindings.findChildViewById(rootView, id);
      if (tvNama == null) {
        break missingId;
      }

      return new ActivityAboutBinding((LinearLayout) rootView, img1, imgBack, tvAbout, tvNama);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
