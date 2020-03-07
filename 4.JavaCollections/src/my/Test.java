package my;

import java.util.*;

public class Test /*extends Private*/{
    public static void main(String[] args) throws NoSuchMethodException {
//        ArrayList
//        Map
//        Vector
//        Stack
//        SortedMap
//        PriorityQueue
//          LinkedList
//                   Object
//                        StringBuilder
//                String

        byte b=Byte.MAX_VALUE;System.out.println(b);
        short s=Short.MAX_VALUE;System.out.println(s);
        int i=Integer.MAX_VALUE;System.out.println(i);
        long l =Long.MAX_VALUE;System.out.println(l);

        System.out.println("bs/f---------------");
        float f=Float.MAX_VALUE;
        double d=Double.MAX_VALUE;
        f=b;
        System.out.println(f);
        f=s;
        System.out.println(f);
        System.out.println("bs/d---------------");
        d=b;
        System.out.println(d);
        d=s;
        System.out.println(d);

        System.out.println("ii/fd---------------");
        f=i;
        d=i;
        System.out.println(f);
        System.out.println(d);

        System.out.println("LL/fd---------------");
        f=l;
        d=l;
        System.out.println(f);
        System.out.println(d);

        ////////////////////////
        System.out.println("---------------");
        //System.out.println((double)Short.MAX_VALUE);
        /////
        if(true&true){}
        if(true&&true){}
        //System.out.println(Short.MAX_VALUE|Short.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE&&Short.MIN_VALUE);

       l= true ? 4 : 5       ;


        Float f2 = new Float(3.1F);
        f2=f2.MAX_VALUE  ;
    }
}

// Демонстрация перегрузки методов.
class OverloadDemo {
    void test () {
        System.out.println("Параметры отсутствуют");
    }
//    ONLY CHANGed "static"
//    static void test () {
//        System.out.println("Параметры отсутствуют");
//    }
    void test (String[] strS) throws Exception{
        System.out.println("Параметры отсутствуют");
    }
    static void test (String str) {
        System.out.println("Параметры отсутствуют");
    }
// Проверка перегрузки на наличие одного целочисленного параметра.
    public
    void test(int а) {
        System.out.println("а: " + а);
    }
    // Проверка перегрузки на наличие двух целочисленных параметров.
    protected
    void test(int a, int b) {
        System.out .println ("а и b: " + a + " " + b) ;
    }
    // Проверка перегрузки на наличие параметра типа double
    private
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
    // Проверка перегрузки на наличие параметра типа double
    private
    double test(Double a) {
        System.out.println("Avtoboxing a: " + a);
        return a*a;
    }
    // Проверка перегрузки на наличие параметра типа double
    double test(Double... d) {
        System.out.println(".... + Avtoboxing d=: " + d);
        return d[0];
    }
}
class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo() ;
        double result;
// вызов всех версий метода test()
        ob.test () ;
        ob.test (10);
        ob.test (10, 20);
        result = ob.test(123.25) ;
        System.out.println("Результат ob.test(123.25) : " + result);
    }
}