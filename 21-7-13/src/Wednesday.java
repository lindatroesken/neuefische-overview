public class Wednesday {
    public static void main(String[] args) {
        int myFirstInt = 5;
        int mySecondInt = 6;

        System.out.println(myFirstInt + " > " + mySecondInt + ": " + (myFirstInt > mySecondInt));
        int result = duplicate(3);
        System.out.println(add(3,4));
        printName("Linda");

    }

    public static int duplicate(int value) {
        return value * 2;
    }

    public static int add(int val1, int val2) {
        return val1 + val2;

    }

    public static void printName(String name){
        System.out.println(name);
    }
}
