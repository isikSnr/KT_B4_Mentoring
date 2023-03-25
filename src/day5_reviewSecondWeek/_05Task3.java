package day5_reviewSecondWeek;

import java.util.Scanner;

public class _05Task3 {
    public static void main(String[] args) {
        //task 4
        //Kullanıcıdan 2 int değeişken  alınız ve
        //sayıların farklarının tek olduğunu
        //kontrol eden bir boolean değiken tanımlayınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz:");
        int sayia = scan.nextInt();
        int sayib = scan.nextInt();

        boolean tekMi = (sayia-sayib)%2==1;
        //boolean tekMi = (sayia-sayib)%>0;
        System.out.println("tekMi = " + tekMi);


    }
}
