package day5_reviewSecondWeek;

import java.util.Scanner;

public class _02Task {
    public static void main(String[] args) {
        //// Girilen 3 basamaklı bir sayının basamaklarına göre
        // tersini bir sayı olarak ekrana yazdırınız 435 --> 534


    /*
    int a = 2;
    int b = 5;
    int c =6;
    int result = a*(b+c);
    System.out.println(result);

     */

        Scanner scan = new Scanner (System.in);
        System.out.println(" 3 basamakli bir sayi giriniz: ");
        int sayi = scan.nextInt();

        int birler = sayi%10; //5
        System.out.println("birler = " + birler);

        int onlar = (sayi/10)%10; //3
        System.out.println("onlar = " + onlar);

        int yuzler = sayi/100; //4
        System.out.println("yuzler = " + yuzler);

        //534 olusturacagiz
        int yeniSayi = birler*100+onlar*10+yuzler;
        System.out.println("yeniSayi = " + yeniSayi);

       // String birlerStr = Integer.toString(birler); // değişiikenin tipine uygun dönüşüm
       // String onlarStr = Integer.toString(onlar); // değişiikenin tipine uygun dönüşüm
       // String yuzlerStr = Integer.toString(yuzler); // değişiikenin tipine uygun dönüşüm
       // String result = birlerStr+onlarStr+yuzlerStr;
       // System.out.print("result = "+result);


    }

}
