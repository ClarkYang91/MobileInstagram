package tabian.com.instagramclone2.Utils;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;



public class Heart {

    private static final String TAG = "Heart";

    private static final DecelerateInterpolator DECCELERATE_INTERPOLATOR = new DecelerateInterpolator();
    private static final AccelerateInterpolator ACCELERATE_INTERPOLATOR = new AccelerateInterpolator();

    public ImageView heartWhite, heartRed;

    public Heart(ImageView heartWhite, ImageView heartRed) {
        this.heartWhite = heartWhite;
        this.heartRed = heartRed;
    }

    public void toggleLike(){
        Log.d(TAG, "toggleLike: toggling heart.");

        if(heartRed.getVisibility() == View.VISIBLE){

            heartRed.setVisibility(View.GONE);
            heartWhite.setVisibility(View.VISIBLE);
        }

        else if(heartRed.getVisibility() == View.GONE){

            heartRed.setVisibility(View.VISIBLE);
            heartWhite.setVisibility(View.GONE);

        }

    }
}

















