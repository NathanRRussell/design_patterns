package observer.Books;

/**
 * An interface to register, remove, and notify observers
 * @author Nathan Russell
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Book book);
}
