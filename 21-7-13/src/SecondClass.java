public class SecondClass {


    public static void main(String[] args) {
        int val1 = 40;
        int para2 = 300;

        int result = summe(val1, para2);
        System.out.println(returnString(result));

        String myString = returnString(4);
        myString.contains("a");

        System.out.println(isGreaterThan100(result));

        System.out.println(myString.toUpperCase());
        System.out.println(isLongerThan20(myString));
        myString += " fancy";
        System.out.println("'" + myString + "' contains fancy: " + hasFancy(myString));
    }

    public static int summe(int val1, int val2){
        if (isGreaterThan100(val1) || isGreaterThan100(val2)){
            System.out.println("One value is greater than 100");
        }
        return val1 + val2;
    }

    public static String returnString(int value){
        return "Summe: " + value;
    }

    public static boolean isGreaterThan100(int x){
        return x>100;
    }

    public static boolean isCharacterIn(String name, String letter){
        return name.contains(letter);
    }
    public static boolean isLongerThan20(String name){
        int length = name.length();
        return length>20;
    }
    public static boolean hasFancy(String word){
        return word.contains("fancy");
    }


}
