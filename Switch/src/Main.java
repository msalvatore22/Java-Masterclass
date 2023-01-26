public class Main {
    public static void main(String[] args) {
        int myValue = 3;
        switch (myValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> System.out.println("Was a 3, 4 or 5");
            default -> System.out.println("Value is not 1, 2, 3, 4 or 5");
        }
        System.out.println(getQuarter("May"));
    }

    public static String getQuarter(String month) {
        return switch(month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}