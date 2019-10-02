package com.company;
import java.util.Scanner;
import com.company.BUDS;
import com.company.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //maybe add a way to post posts??
    String [] posts = {};


    public static void main(String[] args) {
        BUDS buds = new BUDS();
        System.out.println("~~ Welcome to the BUDS Book! ~~");
	    System.out.println("BUDS Memebers:\n");
	    List<User> list = buds.getUsers();
        for(User user: list){
            System.out.println(user.format());
        }
    }
}
