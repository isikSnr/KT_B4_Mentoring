package day3_TypeConversion_Casting;

public class _02NarrowingCasting {

    public static void main(String[] args) {

        double deger=5.8;
        int num=(int)deger;
        System.out.println("num = " + num);

        // 1 tane double 1 tane short değişken tanımlayınız değer atayınız
        //double dğişkeni short değişkene çevirerek yazdırınız

        double deger2=5.6;
        short sh=2;
        sh=(short)deger2;
        System.out.println("sh= "+sh);



    }

}
