package day3_TypeConversion_Casting;

public class _03NumString {

    public static void main(String[] args) {
        String str="65";
        int i=3;
        //int toplam=i+str;

        //kelimenin sayıya çevrilmesi
        /*int strToNum=Integer.parseInt(str);
        System.out.println("strToNum = " + strToNum);;
        System.out.println("str = "+str);
        
        int toplam=i+strToNum;
        System.out.println("toplam = " + toplam);

        //sayının kelimeye çevrilmesi
        String numToStr=Integer.toString(i);
        System.out.println("numToStr = " + numToStr);
        int toplam3= Integer.parseInt(i+numToStr);*/


        int a=265;  //byte -128 den +127 ye kadar toplam 256;
        byte b=18;
        b=(byte)a;
        System.out.println("b = " + b);




    }


}
