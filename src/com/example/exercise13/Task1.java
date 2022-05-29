package com.example.exercise13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> Employees = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("Employees.txt"))) {
            while (br.ready()) {
                Employees.add(br.readLine());
            }

        } catch (IOException e) {
            System.out.println("Error reading the file" + e);
        }
        //Displaying the size of the collection
        System.out.println("Size of the collection is: " + Employees.size());

        System.out.println("Displaying the collection of employees:");

        //Printing the Arraylist using for loop
        for (int i = 0; i < Employees.size(); i++) {
            System.out.println(Employees.get(i));
        }
        System.out.println("--------------------------------");

        //Printing the ArrayList using for-each loop
        for (String names : Employees) {
            System.out.print(Employees + "\n");
        }
        System.out.println("--------------------------------");

        //Printing the ArrayList using iterator
        Iterator<String> it = Employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}