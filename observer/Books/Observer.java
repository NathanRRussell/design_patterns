package observer.Books;

/**
 * An interface to update and display books on the best seller list or customers wish list
 * @author Nathan Russell
 */
public interface Observer {
    public void update(Book book);
    public void display();
}
