public class Book {
    private int bookId;
    private String bookName;
    private String bookReleasedDate;
    private int bookAuthor;
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public int getBookId(){
        return bookId;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookReleasedDate(String bookReleaseddate){
        this.bookReleasedDate=bookReleaseddate;
    }
    public String getBookReleasedDate(){
        return bookReleasedDate;
    }
    public void setBookAuthor(int bookAuthor){
        this.bookAuthor=bookAuthor;
    }
    public int getBookAuthor(){
        return bookAuthor;
    }
}