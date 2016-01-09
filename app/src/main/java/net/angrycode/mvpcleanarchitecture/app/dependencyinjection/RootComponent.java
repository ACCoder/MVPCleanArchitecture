package net.angrycode.mvpcleanarchitecture.app.dependencyinjection;

import net.angrycode.mvpcleanarchitecture.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 阳仔 on 2016/1/7.
 */
@Component(
        modules = {
                RootModule.class,
                InteractorModule.class,
                ExecutorModule.class,
                RepositoryModule.class
        })
@Singleton
public interface RootComponent {
    void inject(MainActivity activity);
}
