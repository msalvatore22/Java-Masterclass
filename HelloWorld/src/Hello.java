import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello {
    public static void myNumberMethod(){
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;
        System.out.println(myTotal);
        System.out.println(myLastOne);
    }

    public static void myIfMethod(){
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }
        int topScore = 90;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is an error.");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic){
            System.out.println("This car is domestic to our country.");
        }

        String s = (isDomestic) ? "This car is domestic" : "This care is not domestic";
        System.out.println(s);

        double chall1 = 20.00d;
        double chall2 = 80.00d;
        double challTotal = (chall1 + chall2) * 100.00d;
        System.out.println("Challenge total = "+challTotal);
        double rem = challTotal % 40.00d;
        System.out.println("The remainder is "+rem);
        boolean isRemaining0 = (rem == 0) ? true : false;
        System.out.println(isRemaining0);
        if(!isRemaining0){
            System.out.println("got some remainder");
            System.out.println(rem);
        }

    }

    public static void myArrayMethod(ArrayList<Integer> arr){
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add(0, 0);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i) + 2);
        }

        arr.forEach((n) -> System.out.println(n));
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        myNumberMethod();
        myIfMethod();
        ArrayList<Integer> myFirstArray = new ArrayList<Integer>(
                Arrays.asList(2,4,6,8));
//        myArrayMethod(myFirstArray);
    }
}
