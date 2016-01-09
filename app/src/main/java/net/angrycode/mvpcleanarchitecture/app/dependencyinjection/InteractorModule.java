package net.angrycode.mvpcleanarchitecture.app.dependencyinjection;

import net.angrycode.mvpcleanarchitecture.domain.interactor.GetMarvelCharactersLimit;
import net.angrycode.mvpcleanarchitecture.domain.interactor.GetMarvelCharactersLimitImp;
import net.angrycode.mvpcleanarchitecture.domain.interactor.GetMarvelCharactersPaginated;
import net.angrycode.mvpcleanarchitecture.domain.interactor.GetMarvelCharactersPaginatedImp;
import net.angrycode.mvpcleanarchitecture.domain.repository.MarvelRepository;
import net.angrycode.mvpcleanarchitecture.executor.InteractorExecutor;
import net.angrycode.mvpcleanarchitecture.executor.MainThreadExecutor;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author glomadrian
 */
@Module
public class InteractorModule {


    @Provides
    public GetMarvelCharactersLimit provideGetMarvelCharactersLimit(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, @Named("mock_api") MarvelRepository marvelRepository) {
        return new GetMarvelCharactersLimitImp(interactorExecutor, mainThreadExecutor, marvelRepository);
    }

    @Provides
    public GetMarvelCharactersPaginated provideGetMarvelCharactersPaginated(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, @Named("mock_api") MarvelRepository marvelRepository) {
        return new GetMarvelCharactersPaginatedImp(interactorExecutor, mainThreadExecutor, marvelRepository);
    }
}
