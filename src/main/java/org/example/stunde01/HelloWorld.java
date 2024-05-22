package org.example.stunde01;

public class HelloWorld {

    // psvm oder main <- schnell Erzeugung
    public static void main(String[] args) {

        int a = 9, b = 3;
        int sum = a + b;
        double d1 = 9, d2 = 3;
        float f1 = 9, f2 = 3;

        // sout -> schnell Erzeugen
        System.out.println("Java is cool!\n" + "Die Summe ist: " + sum + "\n\nAufgabe 2:\n\n");

        System.out.println("-------");
        System.out.println("| int |");
        System.out.println("-------");

        System.out.println("Add: " + (a+b));
        System.out.println("Sub: " + (a-b));
        System.out.println("Mult: " + (a*b));
        System.out.println("Div: " + (a/b));

        System.out.println();

        System.out.println(a + " > " + b + " = " + (a>b));
        System.out.println(a + " < " + b + " = " + (a<b));
        System.out.println(a + " == " + b + " = " + (a==b));

        System.out.println("\n----------");
        System.out.println("| double |");
        System.out.println("----------");

        System.out.println("Add: " + (d1+d2));
        System.out.println("Sub: " + (d1-d2));
        System.out.println("Mult: " + (d1*d2));
        System.out.println("Div: " + (d1/d2));

        System.out.println();

        System.out.println(d1 + " > " + d2 + " = " + (d1>d2));
        System.out.println(d1 + " < " + d2 + " = " + (d1<d2));
        System.out.println(d1 + " == " + d2 + " = " + (d1==d2));

        System.out.println("\n---------");
        System.out.println("| float |");
        System.out.println("---------");
        System.out.println("Add: " + (f1+f2));
        System.out.println("Sub: " + (f1-f2));
        System.out.println("Mult: " + (f1*f2));
        System.out.println("Div: " + (f1/f2));

        System.out.println();

        System.out.println(f1 + " > " + f2 + " = " + (f1>f2));
        System.out.println(f1 + " < " + f2 + " = " + (f1<f2));
        System.out.println(f1 + " == " + f2 + " = " + (f1==f2));
    }

}