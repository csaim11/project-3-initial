package com.example.iterable;

//Codes given in the project instructions.

public interface Container<T> extends Iterable<T> {

    boolean isEmpty();
    int size();
    void add(T item);

}
