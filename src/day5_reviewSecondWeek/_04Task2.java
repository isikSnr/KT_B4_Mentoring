package day5_reviewSecondWeek;

import java.util.Scanner;

public class _04Task2 {
    public static void main(String[] args) {
        // Task 2
        // Kullanıcıdan bir sayı alın
        // sayı cift sayı mı olduğunu bir boolean değişkeni ile kontrol edin

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = scan.nextInt();
        boolean ciftSayiMi1 = (sayi%2==0); //sayi/2==0;
        //boolean ciftSayiMi2 = !(sayi%2==1); //sayi/2==0;
        System.out.println("ciftSayiMi1 = " + ciftSayiMi1);
        //System.out.println("ciftSayiMi2 = " + ciftSayiMi2);

        //boolean tekMi1 = (sayi%2==1);
        //System.out.println("ciftSayiMi = " + ciftSayiMi);
        boolean tekMi2 = !(sayi%2==0);
        System.out.println("tekMi2 = " + tekMi2);

        //boolean tekMi3 = (sayi%2!=0);
    }   //System.out.println("tekMi3 = " + tekMi3);
}
