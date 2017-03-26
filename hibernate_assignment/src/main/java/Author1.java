
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Author1 {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "FName")
    private String firstName;

    @Column (name = "LName")
    @Transient
    private String lastName;

    @Column (name = "Date_Of_birth")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Embedded
    Address1 address;

    @ElementCollection
    List<String> subjects;

    @OneToOne
    Book1 book1;

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Address1 getAddress() {
        return address;
    }

    public void setAddress(Address1 address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book1 getBook1() {
        return book1;
    }

    public void setBook1(Book1 book1) {
        this.book1 = book1;
    }

    @Override
    public String toString() {
        return "Author1{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", subjects=" + subjects +
                ", book1=" + book1 +
                '}';
    }
}

