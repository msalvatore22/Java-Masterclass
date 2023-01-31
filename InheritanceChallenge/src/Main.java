public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "01/01/2021", 95000);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Paycheck = " + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = " + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "01/01/1990", 60.5);
        System.out.println(mary);
        System.out.println("Mary's paycheck = " + mary.collectPay());
        System.out.println("Mary's Holiday pay = " + mary.getDoublePay());
    }

}