package LogicalOperators_IFStatements;

import java.util.Scanner;

public class _04_Ternary {
    public static void main(String[] args) {
        int n = 6;
        int result=0;
        if (n % 2 == 0) {
           // System.out.println("10");
            result=10;
        } else {
           // System.out.println("20");
            result =20;


            //ternary:
            //result=(n%2==0)? "10": "20";
            System.out.println(result);

            //// Soru: Girilen sayı 50den büyük ise 1, değilse 0 değerini ekrana yazdırınız
            //        // Ternary operator ile yapınız

           /* Scanner scan =new Scanner(System.in);
            System.out.println("sayi : ");
            int sayi = scan.nextInt();
            int result=sayi>50?1:0);*/

            // Ternary operator:   (condition) ? (return if true) : (return if false);

//bir işci 2 saatin altındaki çalışma için 10
//2 ile 5 saat arası    20
//5 saatten fazla çalışırsa 35 dolar alıyor

            Scanner oku=new Scanner(System.in);
            System.out.println("Saati giriniz: ");
            int saat = oku.nextInt();

            if(saat<=2) {
                System.out.println("10");
            }else if (saat<5) {
                System.out.println("20");
            }
            else System.out.println("35");
            }
            }
        }


