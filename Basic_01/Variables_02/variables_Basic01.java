package Basic_01.Variables_02;

public class variables_Basic01 {
    public static void  main(String[] args){
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum of "+ x +" and "+ y +" = " + sum);

        //  Product
        int product = x * y;
        System.out.println(("Product of "+x+" and "+y+" = "+product));

        //  Division and Modulo x/y, y/x, x % y

        int Div = x / y;
        System.out.println("Division of "+x+" and "+y+" = "+Div);
        int div = y / x;
        System.out.println("Division of "+y+" and "+x+" = "+div);
        int modulo = x % y;
        System.out.println("Modulus of "+x+" and "+y+ " = "+modulo);

        // Expression
        int Expression = x*y / x+y;
        System.out.println("Expression of "+x+" and "+y+" = "+Expression);
        int expression = (x*y)/(x+y);
        System.out.println("Bodmas of "+x+" and "+y+ " = "+expression);
    }
}
