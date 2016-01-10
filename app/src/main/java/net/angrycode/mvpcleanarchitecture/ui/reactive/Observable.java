package net.angrycode.mvpcleanarchitecture.ui.reactive;

/**
 * @author glomadrian
 */
public interface Observable<T> {

    void register(T observer);

    void unregister(T observer);
}
