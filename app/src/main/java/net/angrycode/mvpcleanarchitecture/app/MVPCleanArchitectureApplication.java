package net.angrycode.mvpcleanarchitecture.app;

import android.app.Application;
import android.content.Context;

import net.angrycode.mvpcleanarchitecture.app.dependencyinjection.DaggerRootComponent;
import net.angrycode.mvpcleanarchitecture.app.dependencyinjection.RootComponent;
import net.angrycode.mvpcleanarchitecture.app.dependencyinjection.RootModule;
import net.angrycode.mvpcleanarchitecture.ui.activity.MainActivity;


/**
 * @author glomadrian
 */
public class MVPCleanArchitectureApplication extends Application {

    /**
     * Static method for get application context
     *
     * @param context
     * @return
     */
    public static MVPCleanArchitectureApplication get(Context context) {
        return (MVPCleanArchitectureApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public void inject(MainActivity activity) {
//        InteractorComponent component = DaggerInteractorComponent.builder()
//                .executorComponent(DaggerExecutorComponent.create())
//                .repositoryComponent(DaggerRepositoryComponent.create())
//                .build();
//        component.inject(activity);

//        InteractorComponent interactorComponent = DaggerInteractorComponent.builder()
////                .executorComponent(DaggerExecutorComponent.create())
//                .repositoryComponent(DaggerRepositoryComponent.create())
//                .interactorModule(new InteractorModule()).build();
        RootComponent component = DaggerRootComponent.builder().rootModule(new RootModule(this)).build();
        component.inject(activity);

    }

    /**
     * Add a new module to the dependency graph
     *
     * @param modules
     */
    public void addModules(Object... modules) {

    }
}
