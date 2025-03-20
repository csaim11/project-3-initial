package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

//Please write a Bag class that implements the Container interface and the Iterable interface
//that it extends.

//Please use an ArrayList to store the items.

//Please also implement the forEach and spliterator methods from the Iterable interface.


public class Bag<T> implements Container<T> {
    private List<T> items;

    // Constructor to initialize the bag
    public Bag() {
        items = new ArrayList<>();
    }

    // Implement the isEmpty() method from Container interface
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Implement the size() method from Container interface
    @Override
    public int size() {
        return items.size();
    }

    // Implement the add() method from Container interface
    @Override
    public void add(T item) {
        items.add(item);
    }

    // Implement the iterator() method from Iterable interface
    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    // Implement the forEach() method from Iterable interface
    @Override
    public void forEach(java.util.function.Consumer<? super T> action) {
        items.forEach(action);
    }

    // Implement the spliterator() method from Iterable interface
    @Override
    public Spliterator<T> spliterator() {
        return items.spliterator();
    }

    // For testing purposes, to print the items in the bag
    public void printBag() {
        for (T item : this) {
            System.out.println(item);
        }
    }

    // Main method to test the functionality of the Bag class
    public static void main(String[] args) {
        // Create a Bag of String items
        Bag<String> bag = new Bag<>();

        // Add items to the bag
        bag.add("apple");
        bag.add("banana");
        bag.add("orange");

        // Print the size of the bag
        System.out.println("Bag size: " + bag.size());

        // Print all items in the bag using the printBag method
        System.out.println("Items in the bag:");
        bag.printBag();

        // Use forEach to print each item in the bag
        System.out.println("Using forEach to print items:");
        bag.forEach(item -> System.out.println("Item: " + item));

        // Check if the bag is empty
        System.out.println("Is the bag empty? " + bag.isEmpty());

        // Use spliterator to process the items
        System.out.println("Using spliterator to print items:");
        Spliterator<String> spliterator = bag.spliterator();
        spliterator.forEachRemaining(item -> System.out.println("Spliterator item: " + item));
    }
}