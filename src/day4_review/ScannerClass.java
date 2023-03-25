package day4_review;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){

        int num=6;
        System.out.println(num);
        System.err.println("hataaaa");

        //String
        Scanner sc = new Scanner(System.in);
        System.out.print("Adınız");
        String name=sc.nextLine();
        System.out.println("Adı "+name +" miş.");

        System.out.println("Bir sayı giriniz:");
        int num1=sc.nextInt();


        //Float
        System.out.println("Boyunuz");
        float boy=sc.nextFloat();
        System.out.println("boy= " +boy);

        //double
        System.out.println("Boyunuz");
        double boy1=sc.nextDouble();
        sc.nextDouble();
        System.out.println("boy1 = "+boy1);
        System.out.println("Soy isim giriniz");
        String soyisim=sc.nextLine();
        System.out.println("Verilerinin basarili bir sekilde girilmistir");












    }
}
