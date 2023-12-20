// Generated by view binder compiler. Do not edit!
package com.luminapp.luminsight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityMetodeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCari;

  @NonNull
  public final ImageView imgAdd;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final TextView tvNama;

  private ActivityMetodeBinding(@NonNull LinearLayout rootView, @NonNull Button btnCari,
      @NonNull ImageView imgAdd, @NonNull ImageView imgBack, @NonNull TextView tvNama) {
    this.rootView = rootView;
    this.btnCari = btnCari;
    this.imgAdd = imgAdd;
    this.imgBack = imgBack;
    this.tvNama = tvNama;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMetodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMetodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_metode, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMetodeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cari;
      Button btnCari = ViewBindings.findChildViewById(rootView, id);
      if (btnCari == null) {
        break missingId;
      }

      id = R.id.img_add;
      ImageView imgAdd = ViewBindings.findChildViewById(rootView, id);
      if (imgAdd == null) {
        break missingId;
      }

      id = R.id.img_back;
      ImageView imgBack = ViewBindings.findChildViewById(rootView, id);
      if (imgBack == null) {
        break missingId;
      }

      id = R.id.tv_nama;
      TextView tvNama = ViewBindings.findChildViewById(rootView, id);
      if (tvNama == null) {
        break missingId;
      }

      return new ActivityMetodeBinding((LinearLayout) rootView, btnCari, imgAdd, imgBack, tvNama);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
