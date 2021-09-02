package observer.Books;

/**
 * A Book
 * @author Nathan Russell
 */
public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * Creates a new book with the indicated title and author name
     * @param title The name of a book 
     * @param authorFirstName The authors first name of a book
     * @param authorLastName The authors last name of a book
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    /**
     * Gets the title of a specified book
     * @return The title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the first name of the author of a specified book
     * @return The author's first name of the book
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Gets the last name of the author of a specified book
     * @return The author's last name of the book
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Creates a string representation of a the title and author name of a book
     * @return A string representation of a book
     */
    public String toString() {
        return title+" by: "+authorFirstName+" "+authorLastName;
    }
}
