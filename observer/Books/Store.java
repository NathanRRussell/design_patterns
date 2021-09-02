package observer.Books;
import java.util.*;

/**
 * A Store to display and update a best seller list
 * @author Nathan Russell
 */
public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    
    /**
     * Creates a new store with a new linked list and registers the observer
     * @param subject An interface to register the observer
     */
    public Store(Subject subject) {
        bestSellers = new LinkedList<>();
        this.subject = subject;
        subject.registerObserver(this);
    }

    /**
     * Adds up to 5 books to the best seller list then removes the oldest book if there are more than 5
     */
    public void update(Book book) {
        bestSellers.add(book);
        if(bestSellers.size() > 5) {
            bestSellers.remove();
        }
    }

    /**
     * Prints a list of books that are best sellers
     */
    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for(Book book : bestSellers) {
            System.out.println("- "+book);
        }
    }
}
