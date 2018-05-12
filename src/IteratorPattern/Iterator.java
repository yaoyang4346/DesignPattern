package IteratorPattern;

/**
 * Created by cheny on 2018/5/9.
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
