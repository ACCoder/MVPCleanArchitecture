package net.angrycode.mvpcleanarchitecture.domain.repository;

import net.angrycode.mvpcleanarchitecture.domain.model.MarvelCharacter;

import java.util.List;

/**
 * The domain model is different from others resources models, in each case the repository must map
 * the response to a basic model
 *
 * @author glomadrian
 */
public interface ResponseMapper<T> {
    List<MarvelCharacter> mapResponse(T response);
}
