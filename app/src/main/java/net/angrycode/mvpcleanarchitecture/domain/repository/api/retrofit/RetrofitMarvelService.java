package net.angrycode.mvpcleanarchitecture.domain.repository.api.retrofit;


import net.angrycode.mvpcleanarchitecture.domain.repository.api.model.CharacterDataWrapper;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * @author glomadrian
 */
public interface RetrofitMarvelService {

    @GET("/v1/public/characters")
    CharacterDataWrapper getCharacters(@Query("limit") int limit);

    @GET("/v1/public/characters")
    CharacterDataWrapper getCharacters(@Query("limit") int limit, @Query("offset") int offset);
}
