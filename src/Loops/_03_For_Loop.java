package Loops;

public class _03_For_Loop {
    public static void main(String[] args) {

        int i = 1;        //initilization
        while (i <= 4) {    //condition
            System.out.println("Hi " + i);
            i++;        //increment
        }

        //while for loop a nasıl dönüşüyor
        for (int k = 1; k <= 4; k++) {       //initilization-condition-increment
            System.out.println("Hi " + k);
        }
        //geriye doğru yazdırmak istersek
        for (int k = 4; k > 0; k--) {       //initilization-condition-increment
            System.out.println("Hi " + k);
        }

        for (int m = 0; m <=6; m++) {       //initilization-condition-increment
            System.out.println("Day " + (m+1));  //day 6 da bittiğinden +1 ekledik ki 7 gün olsun
        //bunun içine bir de 9-6 saatleri arasını yazdır demek için j gibi bir atamayla yeni bir for ekliycez

            for(int k=1; k<=4; k++ ){       //initilization-condition-increment
                System.out.println("Hi "+k);
            }

            /* int i=1;
            for(;i<=5;){       //initilization-condition-increment
                System.out.println("Day "+1=;
                i++;    şeklinde de yazılabilir ama çok kullanışlı değil */



            /*for(int i=1;i<9;i++){
            System.out.println("hello"};    //8 kez yazdıracak
             */

        }
    }
}