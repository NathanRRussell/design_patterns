package observer.Books;
import java.util.*;

/**
 * A best seller list for books
 * @author Nathan Russell
 */
public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Creates a new Array List of Observer and Book
     */
    public BestSellers() {
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }

    /**
     * Registers Observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes Observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies Observers
     */
    public void notifyObservers(Book book) {
        for(Observer observer : observers) {
            observer.update(book);
        }
    }

    /**
     * Adds a book to the best sellers list
     * @param book A book
     */
    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObservers(book);
    }
}
