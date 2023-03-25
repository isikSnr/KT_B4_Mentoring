package Loops;

public class _01_While_Loop {
    public static void main(String[] args) {

        //int i=1;
        //if(i<=4){
        //    System.out.println("Hi");   //bir defa yazdırdı. biz 4 defa yzamasını istersek
        //}

        //while(true){
        //    System.out.println("Hi");  //şart true olduğu sürece sonsuz kere Hi yazacak
       // }                                //önlemenin yolu increment koymaktır


        int i=1;    //initialization
        while(i<=4){
            System.out.println("Hi");
            i++;
        }
        System.out.println("Bye "+i);   //blogun dışında oldugundan sona Bye 5 yazar

        //sonraki aşama:
        int k=1;
        while(k<=4){
            System.out.println("Hi");
            int m=1;
            while(m<=3){
                System.out.println("Hello");
                m++;
            }
            k++;
        }

    }

}
