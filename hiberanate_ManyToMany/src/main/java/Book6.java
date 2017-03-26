
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book6 {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookid;
    private String bookName;

    @ManyToMany(mappedBy = "book2")
    List<Author6> author3 = new ArrayList<Author6>();

    public List<Author6> getAuthor3() {
        return author3;
    }

    public void setAuthor3(List<Author6> author3) {
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
