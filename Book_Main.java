public class Book_Main 
{
    public static void main(String[] args) 
    {
        Book_Collection book_Collection = new Book_Collection();
        
        Book book_01 = new Book("Tunnel","Bonolota",2030);
        Book book_02 = new Book("Mon","Bonolota",2032);
        Book book_03 = new Book("Jani dekha hbe","Bonolota",2035);
        Book book_04 = new Book("Purano","Bonolota",2048);
        
        book_Collection.addBook(book_01);
        book_Collection.addBook(book_02);
        book_Collection.addBook(book_03);
        book_Collection.addBook(book_04);
        
        System.out.println("Book in the Collection: \n");
        book_Collection.getBook().forEach((book) -> 
        {
            System.out.println("BOOK:");
            System.out.println("1.Title: " + book.getTitle());
            System.out.println("2.Author: " + book.getAuthor());
            System.out.println("3.ISBN: " + book.getISBN());
            System.out.println(" ");
        });
        
        System.out.println("\n");
        book_Collection.removeBook(book_03);
        System.out.println("After removing a book in the Collection: "+book_03.getTitle() + "\n");
        
        book_Collection.removeBook(book_04);
        System.out.println("After removing a book in the Collection: "+book_04.getTitle() + "\n");
        
        book_Collection.getBook().forEach((book) -> 
        {
            System.out.println("BOOK: ");
            System.out.println("1.Title: " + book.getTitle());
            System.out.println("2.Author: " + book.getAuthor());
            System.out.println("3.ISBN: " + book.getISBN());
            System.out.println(" ");
        }); 
        
        System.out.println("\n");
    }
}

 
