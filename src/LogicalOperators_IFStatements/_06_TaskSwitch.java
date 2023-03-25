package LogicalOperators_IFStatements;

import java.util.Scanner;

public class _06_TaskSwitch {
    public static void main(String[] args) {

//Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = oku.nextInt();
        int onlar=(sayi/10)%10;     //127 12 2
                                    //355 35 3

        switch(onlar){
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
    }
    }
}
