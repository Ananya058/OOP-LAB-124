import java.util.ArrayList;

public class Book_Collection 
{
    public ArrayList < Book > books = new ArrayList < > ();
 
    //book_add
    public void addBook(Book book) 
    {
        books.add(book);
    }
    //book_remove
    public void removeBook(Book book) 
    {
        books.remove(book);
    }
    
    //get_book
    public ArrayList < Book > getBook() 
    {
       return books;
    }
}

 
