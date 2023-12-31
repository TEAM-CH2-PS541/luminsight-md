// Generated by view binder compiler. Do not edit!
package com.luminapp.luminsight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class PopupExitBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnBatal;

  @NonNull
  public final Button btnOk;

  @NonNull
  public final TextView tvJudul;

  private PopupExitBinding(@NonNull LinearLayout rootView, @NonNull Button btnBatal,
      @NonNull Button btnOk, @NonNull TextView tvJudul) {
    this.rootView = rootView;
    this.btnBatal = btnBatal;
    this.btnOk = btnOk;
    this.tvJudul = tvJudul;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PopupExitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PopupExitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.popup_exit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PopupExitBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_batal;
      Button btnBatal = ViewBindings.findChildViewById(rootView, id);
      if (btnBatal == null) {
        break missingId;
      }

      id = R.id.btn_ok;
      Button btnOk = ViewBindings.findChildViewById(rootView, id);
      if (btnOk == null) {
        break missingId;
      }

      id = R.id.tv_judul;
      TextView tvJudul = ViewBindings.findChildViewById(rootView, id);
      if (tvJudul == null) {
        break missingId;
      }

      return new PopupExitBinding((LinearLayout) rootView, btnBatal, btnOk, tvJudul);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
