public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

        for(double rate = 7.5; rate <= 10; rate+=.25){
            double interestAmount = calculateInterest(100, rate);
            if (interestAmount > 8.5){
                break;
            }
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }
        System.out.println(sumOdd(10,10));
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate /100));
    }

    public static boolean isOdd(int number){
        if(number > 0 && number % 2 > 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((end < start) || (end < 0) || (start < 0)){
            return -1;
        }
        for(int i = start; i<=end; i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }
}