
import javax.persistence.*;

@Entity
public class Book4 {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookid;
    private String bookName;

    @ManyToOne
    Author4 author3;

    public Author4 getAuthor3() {
        return author3;
    }

    public void setAuthor3(Author4 author3) {
        this.author3 = author3;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book3{" +
                "bookid=" + bookid +
                ", bookName='" + bookName + '\'' +
                ", author3=" + author3 +
                '}';
    }
}
