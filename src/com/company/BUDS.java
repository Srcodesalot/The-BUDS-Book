package com.company;
import com.company.User;
import java.util.Arrays;
import java.util.List;

public class BUDS {

    //first create yourself as a user
    private User aidan;
    private User michaelm;
    private User ollie;
    private User Maddie;
    private User sean;

    private List<User> users;

    {
        users = Arrays.asList(
                //create a profile !! and update your bio!!!
                //COPY PASTA THIS EXAMPLE IF NEED BE
                // You need a firstname,lastname,gradeclassification,major,minor, and a bio
                //If you do not have a minor please leave that enter ""
                aidan = new User(
                        "Aiden",
                        "Gutierrez",
                        "Senior",
                        "Computer Science",
                        "Economics",
                        "I like long walks in the park and on the beach. Pepperoni pizza or Die. \n " +

                                "live fast die free. ball hard! <(^(00)^)> "),//add a ', ' here
                michaelm = new User(
                        "Michael",
                        "McGaw",
                        "Senior",
                        "Computer Science & Philosophy",
                        "aint got one",
                        "uwu what's this \n " +
                                "im a big fan of myself"),

                ollie = new User(
                        "Ollie",
                        "Barwise",
                        "Junior",
                        "Computer Science",
                        "Chemistry (premed focus",
                        "Have you ever heard of the Denisovans?"),

                sean = new User(
                        "Sean",
                        "Newell",
                        "Senior",
                        "AET",
                        "Computer Science",
                        "Four score and seven years ago our fathers brought forth \n " +
                                "on this continent a new nation, conceived in liberty \n" +
                                "and dedicated to the proposition that all men are created equal."),//add a ', ' here

                Maddie = new User(
                        "Madison",
                        "Everett",
                        "Senior",
                        "Computer Science",
                        "Mathematics",
                        "Dogs and ice cream are the key to life! \n " +
                                "Litty McScitty! ;)))))))))))) ")//add a ', ' here


        );

    }

    public List getUsers (){
        return users;
    }
}
