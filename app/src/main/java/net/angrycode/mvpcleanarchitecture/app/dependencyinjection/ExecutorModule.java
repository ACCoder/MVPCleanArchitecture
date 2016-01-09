package net.angrycode.mvpcleanarchitecture.app.dependencyinjection;

import net.angrycode.mvpcleanarchitecture.executor.InteractorExecutor;
import net.angrycode.mvpcleanarchitecture.executor.MainThreadExecutor;
import net.angrycode.mvpcleanarchitecture.executor.MainThreadExecutorImp;
import net.angrycode.mvpcleanarchitecture.executor.ThreadExecutor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author glomadrian
 */
@Module
public class ExecutorModule {


    @Provides
    @Singleton
    public InteractorExecutor provideExecutor() {
        return new ThreadExecutor();
    }

    @Provides
    @Singleton
    public MainThreadExecutor provideMainThreadExecutor() {
        return new MainThreadExecutorImp();
    }
}
