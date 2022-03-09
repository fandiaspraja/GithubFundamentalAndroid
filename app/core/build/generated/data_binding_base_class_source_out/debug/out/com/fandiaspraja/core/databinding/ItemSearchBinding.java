// Generated by view binder compiler. Do not edit!
package com.fandiaspraja.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.fandiaspraja.core.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSearchBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CircleImageView imgUser;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvType;

  private ItemSearchBinding(@NonNull CardView rootView, @NonNull CircleImageView imgUser,
      @NonNull TextView tvName, @NonNull TextView tvType) {
    this.rootView = rootView;
    this.imgUser = imgUser;
    this.tvName = tvName;
    this.tvType = tvType;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_user;
      CircleImageView imgUser = ViewBindings.findChildViewById(rootView, id);
      if (imgUser == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_type;
      TextView tvType = ViewBindings.findChildViewById(rootView, id);
      if (tvType == null) {
        break missingId;
      }

      return new ItemSearchBinding((CardView) rootView, imgUser, tvName, tvType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}