package LogicalOperators_IFStatements;

public class _01_LogicalOperators {
    public static void main(String[] args) {
        /* &&-and ||-or
                &   |
        T   T   T   T
        T   F   F   T
        F   T   F   T
        F   F   F   F

        r= x<y&a<b


         */

        int x=9;
        int y=7;
        int a=7;
        int b=11;

        //boolean result=x>y;
        //System.out.println( "result = "+result);

        boolean result=x>y&a<b;  //& tek olduğunda ilkini kontroleder ikinciye bakmaz
        System.out.println("result = " + result);

        boolean result2=x>y | a>b;
        System.out.println("result2 = " + result2);


    }
}
