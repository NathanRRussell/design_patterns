package observer.Books;
import java.util.*;

/**
 * A customers wish list
 * @author Nathan Russell
 */
public class Customer implements Observer {
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;
    
    /**
     * Creates a new customer with an indicated name and initializes their wish list
     * @param subject An interface to register the observer
     * @param firstName A customers first name
     * @param lastName A customers last name
     */
    public Customer(Subject subject, String firstName, String lastName) {
        wishList = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        subject.registerObserver(this);
    }

    /**
     * Adds a book to a customers wish list
     */
    public void update(Book book) {
        wishList.add(book);
    }

    /**
     * Prints a list of book that are on a customers wish list 
     */
    public void display() {
        System.out.println("Wish List:");
        for(int i = 0;i<wishList.size();i++) {
            System.out.println("- "+wishList.get(i));
        }
    }
}
