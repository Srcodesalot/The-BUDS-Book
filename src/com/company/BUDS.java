package com.company;
import com.company.User;
import java.util.Arrays;
import java.util.List;

public class BUDS {

    //first create yourself as a user
    private User aidan;
    private User ollie;
    private List<User> users;

    {
        users = Arrays.asList(
                //create a profile !! and update your bio!!!
                //COPY PASTA THIS EXAMPLE IF NEED BE
                // You need a firstname,lastname,gradeclassification,major,minor, and a bio
                //If you do not have a minor please leave that enter ""
                aidan = new User(
                        "Aidan",
                        "Gutierrez",
                        "Senior",
                        "Computer Science",
                        "Economics",
                        "I like long walks in the park and on the beach. Pepperoni pizza or Die. \n " +
                                "live fast die free. ball hard! <(^(00)^)> "),
                ollie = new User(
                        "Ollie",
                        "Barwise",
                        "Junior",
                        "Computer Science",
                        "Chemistry (premed focus",
                        "Have you ever heard of the Denisovans?")
        );
    }

    public List getUsers (){
        return users;
    }
}
