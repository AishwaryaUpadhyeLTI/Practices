import java.util.*;
import java.sql.*;
public class Libraryjdbc {
    static Scanner s=new Scanner(System.in);
    Book b=new Book();
    Author a=new Author();
    public void setBookdata(){
        System.out.println("Enter book name:");
        b.setBookName(s.next());
        System.out.println("Enter book released date:");
        b.setBookReleasedDate(s.next());
        System.out.println("Enter author id:");
        b.setBookAuthor(s.nextInt());;
    }
    public void setAuthorData(){
        System.out.println("Enter author name:");
        a.setAuthorName(s.next());
    }
    public void insertBook(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
            java.sql.PreparedStatement ps=conn.prepareStatement("insert into books(bookName,bookReleaseDate,bookAuthor) values(?,?,?)");
            ps.setString(1,b.getBookName());
            ps.setString(2,b.getBookReleasedDate());
            ps.setInt(3,b.getBookAuthor());
            int l=ps.executeUpdate();
            if(l==1){
                System.out.println("**********Inserted successfully**********");
            }
            else{
                System.out.println("*********insertion error**********");
            }
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        catch(SQLException se){
            System.out.println(se);
        }
    }
    public void insertAuthor(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
            java.sql.PreparedStatement ps=conn.prepareStatement("insert into author(authorName) values(?)");
            ps.setString(1,a.getAuthorName());
            int l=ps.executeUpdate();
            if(l==1){
                System.out.println("********Inserted Suucessfully********");
 
            }
            else{
                System.out.println("***********insertion error***********");
            }
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        catch(SQLException se){
            System.out.println(se);
        }
    }
    public void retrieveBook(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
            java.sql.PreparedStatement ps=conn.prepareStatement("select * from books join author on books.bookAuthor=author.authorId");
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                while(rs.next()){
                    System.out.println("Book id: "+rs.getInt("bookId"));
                    System.out.println("Book name:"+rs.getString("bookName"));
                    System.out.println("Book released date:"+rs.getString("bookReleaseDate"));
                    System.out.println("Book author id:"+rs.getInt("bookAuthor"));
                    System.out.println("Author name:"+rs.getString("authorName"));
                }
            }
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        catch(SQLException se){
            System.out.println(se);
        }
    }
    public void choice(){
        System.out.println("Enter your Choice\n1.Insert to author\n2.insert to books\n3.retrieve");
        int ch=s.nextInt();
        switch(ch){
            case 1:
                setAuthorData();
                insertAuthor();
                break;
            case 2:
                setBookdata();
                insertBook();
                break;
            case 3:
                retrieveBook();
                break;
        }
    }
    public static void main(String[] args){
        Libraryjdbc lj=new Libraryjdbc();
        lj.choice();
    }
}