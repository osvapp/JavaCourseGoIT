package modul2.meeting1;

public class OperatorsResultClass {
    public static void main(String[] args) {
        int a = 8, b = 3, c = 1989, d = 11, e = 13;
        //      " +, -, *, / <=> % "
        int result  = a + b + c;
        int result2 = c - a - b;
        int result3 =  a * b * c;
        double result4 = c / a / b;         //  "/" division or div <- slang |
        int result5 = c % b;                //  "%" modulus  od mod <- slang | !не совсем понял как это получилось!
        int result6 = c % a;


        // Addition assignment
        b = b + 17; // old, not used !
        a += 12; // Заменяте b = b + 17
        // Subtraction assignment
        c -=1988;

        //      "Increment (++) and Decrement (--)"

        d++;
        e--;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

}
