public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(34532, 10000.0,
                "John Doe", "john.doe@gmail.com",
                "456-789-1011");
//        account.setAccountNumber(43251134);
//        account.setAccountBalance(10000.0);
//        account.setCustomerName("John Doe");
//        account.setEmail("john.doe@gmail.com");
//        account.setPhoneNumber("456-789-1011");
        account.describeAccount();
        account.deposit(2789.85);
        account.describeAccount();
        account.withdrawal(9878.43);
        account.describeAccount();
        account.withdrawal(4000);
        account.describeAccount();
    }
}