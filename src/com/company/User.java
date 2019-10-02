package com.company;

public class User {
    private String FirstName = new String();
    private String LastName = new String();
    private String Classification = new String();
    private String Major = new String();
    private String Minor = "";
    private String Bio = new String();

    public User (String first, String last, String year, String major, String minor, String bio){
        FirstName = first;
        LastName = last;
        Classification = year;
        Major = major;
        Minor = minor;
        Bio = bio;
    }

    public User (){

    }

    String format (){
        String structure = new String();
        if (Minor.equals("")){
            structure = LastName + "... " + FirstName + " " + LastName + "\n" +
                    Classification + " " + Major + "\n";
        }else{
            structure = LastName + "... " + FirstName + " " + LastName + "\n" +
                    Classification + " " + Major + "major w/ a " + Minor + " minor \n"
                    + Bio;
        }
        return structure;
    }

}
