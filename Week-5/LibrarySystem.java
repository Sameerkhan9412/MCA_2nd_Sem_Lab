import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Base class representing a book
class Book {
    private String bookID;
    private String title;
    private String author;
    private String genre;
    private int bookCount;

    public Book(String bookID, String title, String author, String genre, int bookCount) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookCount = bookCount;
    }

    public String getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getBookCount() { return bookCount; }

    public void borrowBook() {
        if (bookCount > 0) {
            bookCount--;
        } else {
            System.out.println("Book is out of stock.");
        }
    }

    public void returnBook() { bookCount++; }

    public void displayDetails() {
        System.out.println("Book: " + title + " by " + author + " (Genre: " + genre + ", Available: " + bookCount + ")");
    }
}

// FictionBook class extending Book
class FictionBook extends Book {
    public FictionBook(String bookID, String title, String author, int bookCount) {
        super(bookID, title, author, "Fiction", bookCount);
    }
}

// NonFictionBook class extending Book
class NonFictionBook extends Book {
    public NonFictionBook(String bookID, String title, String author, int bookCount) {
        super(bookID, title, author, "Non-Fiction", bookCount);
    }
}

// Class representing a user
class User {
    private String name;
    private List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }

    public void borrowBook(Book book) {
        if (book.getBookCount() > 0) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + name);
        }
    }
}

// Class representing the catalog
class Catalog {
    private List<Book> books;

    public Catalog() { books = new ArrayList<>(); }

    public void addBook(Book book) { books.add(book); }

    public void displayBooks() {
        for (Book book : books) {
            book.displayDetails();
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

// Main class to run the simulation
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catalog catalog = new Catalog();

        System.out.print("Enter number of books to add: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter book ID: ");
            String bookID = scanner.nextLine();
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter author name: ");
            String author = scanner.nextLine();
            System.out.print("Enter genre (Fiction/Non-Fiction): ");
            String genre = scanner.nextLine();
            System.out.print("Enter book count: ");
            int count = scanner.nextInt();
            scanner.nextLine();

            Book book;
            if (genre.equalsIgnoreCase("Fiction")) {
                book = new FictionBook(bookID, title, author, count);
            } else {
                book = new NonFictionBook(bookID, title, author, count);
            }
            catalog.addBook(book);
        }

        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        while (true) {
            System.out.println("\n1. Display Books\n2. Borrow Book\n3. Return Book\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    catalog.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    Book borrowBook = catalog.findBookByTitle(borrowTitle);
                    if (borrowBook != null) {
                        user.borrowBook(borrowBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    Book returnBook = catalog.findBookByTitle(returnTitle);
                    if (returnBook != null) {
                        user.returnBook(returnBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...\n");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
