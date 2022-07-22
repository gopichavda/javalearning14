package jv14;

public class java14 {

    public static void main(String[] args) {
// Arithmetic operators //
        int a = 10;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //  Relational operators //

        System.out.println(a == b); // false  because 10 is not equal to 20//
        System.out.println(a!= b); // true because 10 is not equal to 20//
        System.out.println(a>b); // false because 10 is not greater than 20//
        System.out.println(a<b); // true because 10 is less than 20 //
        System.out.println(a>=b); // false because 10 is not greater than 20//
        System.out.println(a<=b); // true because 10 is less than 20//

        // logical operator //

        System.out.println(a<10 & a<20); //false because only one is true//
        System.out.println(a<10 || a<20); //true because one is right//
        System.out.println(! (a<10 & a<20)); // true because inside became false so outside true//

        // Unary operator //

        System.out.println(a++); // 10
        System.out.println(++a); //12
        System.out.println(a--); //
        System.out.println(--a); //


        //Assignment operators//

        int c = 10;
        int d = 20;


        System.out.println(d+=c); //10+20=30//
        System.out.println(d-=c); //30-10=20//
        System.out.println(d*=c); //20*10=200//
        System.out.println(d/=c); //200/10=20//
        System.out.println(d%=c); //20%10=
        System.out.println(d^=c); //
    }
}
