package net.angrycode.mvpcleanarchitecture.domain.repository;


import net.angrycode.mvpcleanarchitecture.domain.model.MarvelCharacter;
import net.angrycode.mvpcleanarchitecture.domain.repository.exception.GetCharactersException;

import java.util.List;

/**
 * Repository to get marvel information
 *
 * @author glomadrian
 */
public interface MarvelRepository {

    List<MarvelCharacter> getCharacterCollection(int limit) throws GetCharactersException;

    List<MarvelCharacter> getCharacterCollectionPaginated(int limit, int offset) throws GetCharactersException;

}
