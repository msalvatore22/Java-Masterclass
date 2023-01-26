public class Main {
    public static void main(String[] args) {
//        int j = 1;
//
//        boolean isReady = true;
//        do {
//            if(j > 5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//        } while(isReady);

//        int number = 0;
//        while (number < 50){
//            number += 5;
//            if (number % 25 == 0){
//                continue;
//            }
//            System.out.print(number + "_");
//        }

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while(number <= finishNumber){
            number ++;
            if(!isEven(number)){
                oddCount++;
                continue;
            }
            if(evenCount == 5){
                break;
            }
            evenCount++;
            System.out.println("Even number " + number);
        }
        System.out.println("Odd count is " + oddCount);
        System.out.println("Even count is " + evenCount);
    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

}