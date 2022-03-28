public class HomeWorkApp {
    public static void main(String[] args){
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public static void checkSumSing(){
        int a = 5;
        int b = 2;
        if (a+b>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Скмма отрицательная");
        }
    }
    public static void printColor(){
        int value=435;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value>0 && value<=100) {
            System.out.println("Желтый");
        } else  if (value>100){
            System.out.println("Зеленый");
        }

    }
    public  static void compareNumbers() {
        int a =15;
        int b =378;
        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

}
