public class Lesson2 {
    public static void main (String[] args) {
    first(5,20);
    second(-89);
    three(100);
    four("hello", 4);
    }
    public static void first ( int y, int x) {
        int z=x+y;
        if (z>10 && z<=20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
    public static void second (int x) {
        if (x>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void three (int x) {
        if (x>=0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void four (String message, int x ) {
        int i = 1;
        while (i<=x){
            System.out.println(message);
            i++;
        }
    }

}
