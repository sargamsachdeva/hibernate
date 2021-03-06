package com.hibernate.demo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Author {

    // @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Ques-9
     //@Id @GeneratedValue(strategy = GenerationType.TABLE) Ques-9 (another table hibernate_sequences is formed for storing ids)

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
    Address address;

    @ElementCollection
    List<String> subjects;

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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



    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", subjects=" + subjects +
                '}';
    }
}

