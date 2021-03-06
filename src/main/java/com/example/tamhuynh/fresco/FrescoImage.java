package com.example.tamhuynh.fresco;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by tamhuynh on 1/29/16.
 */
public class FrescoImage extends LinearLayout {

    private SimpleDraweeView simpleDraweeView;

    public FrescoImage(Context context) {
        super(context);
        initUI(context);
    }

    public FrescoImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        initUI(context);
    }

    public FrescoImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initUI(context);
    }

    private void initUI(Context context){
        View viewRoot = LayoutInflater.from(context).inflate(R.layout.image_fresco, this);
        simpleDraweeView = (SimpleDraweeView) viewRoot.findViewById(R.id.fresco_image_view);
    }

    public void setBackgroundImage(String url){
        Uri uri = Uri.parse(url);
        simpleDraweeView.setImageURI(uri);
    }

}
