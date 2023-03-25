package day2_Review;

import javax.swing.*;
import java.sql.SQLOutput;

public class Task {
    public static void main(String[] args) {

        /* bir dikdörtgenin kısa ve uzun kenar için 2 değişken tanımlayınız.
        7 ve 12 değerlerini atayınız. alanını yazdırınız.

         */
        int kisaKenar = 7;
        int uzunKenar = 12;
        int alan = kisaKenar*uzunKenar;
        System.out.println(alan);
        System.out.println("alan=" + alan);

        String name = "Ali";
        String surname = "Oğuz";

             System.out.println("name = " +name);
        System.out.println("surname = " + surname);
        String fullname = name + " "+ surname;
        System.out.println("fullname = "+ fullname);
        int age= 41;
        System.out.println(name+age+surname);
        int a = 4;
        int b = 8;
        System.out.println(a+b);
        System.out.println(a+b+"surname");


    }
}
