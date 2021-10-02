public class Employee {
    public String name;
    public static String company = "Veridian Dynamics";

    public void displayEmployeeInfo() {
        System.out.println(name + " works for " + company + ".");
    }

    public void employeeQuote() {
        System.out.println(Quote.randomQuote());
    }
}
