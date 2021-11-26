package ss21_creational_design_pattern.thuc_hanh.bai3;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();

        haveBook = borrowedBook != null;
    }

    public String getAuthorAndTitle() {
        if (haveBook)
            return borrowedBook.getAuthorAndTitle();

        return "I don't have books";
    }

    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}
