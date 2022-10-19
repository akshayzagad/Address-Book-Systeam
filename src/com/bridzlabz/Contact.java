package com.bridzlabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phoneNo;
    private String email;
public Contact(){};
public Contact(String firstName, String lastName, String street, String city, String state, String zip, String phoneNo, String email ){
    this.firstName = firstName;
    this.lastName = lastName;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.phoneNo = phoneNo;
    this.email = email;
}

//    public String getFirstName() {
//        return firstName;
//    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

//    public String getLastName() {
//        return lastName;
//    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String getStreet() {
//        return street;
//    }

    public void setStreet(String street) {
        this.street = street;
    }

//    public String getCity() {
//        return city;
//    }

    public void setCity(String city) {
        this.city = city;
    }

//    public String getState() {
//        return state;
//    }

    public void setState(String state) {
        this.state = state;
    }

//    public String getZip() {
//        return zip;
//    }

    public void setZip(String zip) {
        this.zip = zip;
    }

//    public String getPhoneNo() {
//        return phoneNo;
//    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

//    public String getEmail() {
//        return email;
//    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' +
                '}';
    }
}