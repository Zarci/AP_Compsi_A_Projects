/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringparser;

import java.util.Scanner;

/**
 *
 * @author 213061
 */
public class StringParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name = "Agent Blake Rile";
        System.out.println(name.substring(0, 5));
        System.out.println(name.substring(6, 11));
        System.out.println(name.substring(12, 16));

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name2 = in.nextLine();

        System.out.println("First Name: " + name2.substring(0, name2.indexOf(" ")));
        System.out.println("Middle Name: " + name2.substring(name2.indexOf(" ") + 1, name2.indexOf(" ", name2.indexOf(" ") + 1)));
        System.out.println("Last Name: " + name2.substring(name2.indexOf(" ", name2.indexOf(" ") + 1)));

    }

}
