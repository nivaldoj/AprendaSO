package com.example.android.aprendaso;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by Nivaldo on 22/04/2016.
 */
public class Fx {

    public static void slideDown(Context context, View view) {

        Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide_down);

        if (animation != null) {
            animation.reset();
        }

        if (view != null) {
            view.clearAnimation();
            view.startAnimation(animation);
        }
    }

    public static void slideUp(Context context, View view) {

        Animation animation = AnimationUtils.loadAnimation(context, R.anim.slide_up);

        if (animation != null) {
            animation.reset();
        }

        if (view != null) {
            view.clearAnimation();
            view.startAnimation(animation);
        }
    }

}
