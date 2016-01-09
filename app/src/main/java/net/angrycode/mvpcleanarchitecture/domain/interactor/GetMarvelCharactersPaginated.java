package net.angrycode.mvpcleanarchitecture.domain.interactor;

import net.angrycode.mvpcleanarchitecture.domain.model.MarvelCharacter;

import java.util.List;

/**
 * @author glomadrian
 */
public interface GetMarvelCharactersPaginated {

    void execute(final int limit, final int offset, final Callback callback);

    interface Callback {

        void onMarvelCharacterList(List<MarvelCharacter> marvelCharacters);

        void onError();
    }
}
