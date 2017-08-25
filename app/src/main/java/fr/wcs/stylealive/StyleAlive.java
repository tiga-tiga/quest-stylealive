package fr.wcs.stylealive;

import android.app.Application;

/**
 * Created by bkrettly on 25/08/17.
 */

public class StyleAlive extends Application {

    public static int sTheme;
    @Override
    public void onCreate() {
        super.onCreate();
        sTheme = R.style.AppTheme;
    }
}
