package net.angrycode.mvpcleanarchitecture.ui.activity;

import android.os.Bundle;
import android.widget.TextView;

import net.angrycode.mvpcleanarchitecture.R;
import net.angrycode.mvpcleanarchitecture.app.BaseActivity;
import net.angrycode.mvpcleanarchitecture.app.MVPCleanArchitectureApplication;
import net.angrycode.mvpcleanarchitecture.domain.interactor.GetMarvelCharactersLimit;
import net.angrycode.mvpcleanarchitecture.domain.model.MarvelCharacter;

import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;


/**
 * Created by 阳仔 on 2016/1/7.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.tv_content)
    TextView mTextView;

    @Inject
    GetMarvelCharactersLimit getMarvelCharactersLimit;

//    @Inject
//    InteractorExecutor interactorExecutor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        MVPCleanArchitectureApplication mvpCleanArchitectureApplication = (MVPCleanArchitectureApplication) getApplication();
        mvpCleanArchitectureApplication.inject(this);

//        ExecutorComponent component = DaggerExecutorComponent.create();
//        component.inject(this);


//        getMarvelCharactersLimit = new GetMarvelCharactersLimitImp(new ThreadExecutor(), new MainThreadExecutorImp(), new MarvelMockRepository());
        getMarvelCharactersLimit.execute(10, new GetMarvelCharactersLimit.Callback() {
            @Override
            public void onMarvelCharacterList(List<MarvelCharacter> marvelCharacters) {
                mTextView.setText("size:" + marvelCharacters.size() + "," + (marvelCharacters.size() > 0 ? marvelCharacters.get(0).getDescription() : ""));
//                mTextView.setText(interactorExecutor.toString());
            }

            @Override
            public void onError() {

            }
        });
    }
}
