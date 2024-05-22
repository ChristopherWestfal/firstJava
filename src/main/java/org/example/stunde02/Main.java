package org.example.stunde02;

public class Main {
    public static void main(String[] args) {
        int x = 2, y = 3;

        System.out.println(add(x, y));

        System.out.println(sub(x, y));

        if(x > y)
            System.out.println(sub(x,y));
        else
            System.out.println(add(x, y));

        System.out.println(makePositive(-5));

        System.out.println("Ist ein Palindrom: " + isPalindrome("lagerregal"));
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static double add(double x, double y){
        return x + y;
    }

    public static int sub(int x, int y){
        return x - y;
    }

    public static int makePositive (int x){

        if(x >= 0)
            return x;
        else
            return x*(-1);
    }

    public static int evenOrOdd (int x){
        if(x % 2 == 0)
            return x;
        else
            return x*2;
    }

    public static boolean isPalindrome(String wort){
        int anfang = 0, ende = wort.length()-1;

        for(int i = 0; i <= (wort.length()/2); i++){
            if(wort.charAt(anfang) != wort.charAt(ende)) {
                return false;
            }
            anfang++;
            ende--;
        }
        return true;
    }
}
