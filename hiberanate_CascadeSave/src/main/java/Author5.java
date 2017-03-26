import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    @Entity
    public class Author5 {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        @Column(name = "FName")
        private String firstName;

        @Column (name = "LName")
        @Transient
        private String lastName;

        @Column (name = "Date_Of_birth")
        @Temporal(TemporalType.DATE)
        private Date dob;

        @Embedded
        Address5 address;

        @ElementCollection
        List<String> subjects;

        @OneToMany(cascade = CascadeType.PERSIST)
        List<Book5> book2 = new ArrayList<Book5>();

        public List<String> getSubjects() {
            return subjects;
        }

        public void setSubjects(List<String> subjects) {
            this.subjects = subjects;
        }

        public Address5 getAddress() {
            return address;
        }

        public void setAddress(Address5 address) {
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

        public void setBook2(List<Book5> book2) {
            this.book2 = book2;
        }

        public List<Book5> getBook2() {
            return book2;
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
                    ", book1=" + book2 +
                    '}';
        }
    }



