/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the password? ");
        String password = sc.nextLine();
        String pass = new String("Mateo");
        if (pass.equals(password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
