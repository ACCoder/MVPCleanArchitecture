package net.angrycode.mvpcleanarchitecture.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Base activity for doing the Dependency
 *
 * @author glomadrian
 */
public abstract class BaseActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectDependencies();
        injectViews();
    }

    private void injectDependencies() {

    }


    private void injectViews() {
        ButterKnife.bind(this);
    }
}
