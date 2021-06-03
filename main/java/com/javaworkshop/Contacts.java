package com.javaworkshop;

public class Contacts {
    /**
     * Creating Field
     */
    public static String firstName;
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static int zipCode;
    public static long phoneNumber;
    public static String email;

    /**
     Declaration with particular datatype
     */
    public Contacts(String firstName, String lastName, String address,String city,String state,int zipCode,long phoneNumber,String email){
        this.firstName = firstName;
        this.lastName =lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}