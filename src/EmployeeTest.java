public class EmployeeTest {
    public static void main(String[] args) {
        Employee numberOne = new Employee();
        numberOne.name = "Number One";
        Employee numberTwo = new Employee();
        numberTwo.name = "Number Two";
        Employee numberThree = new Employee();
        numberThree.name = "Number Three";
        numberOne.displayEmployeeInfo();
        numberOne.employeeQuote();
        numberTwo.displayEmployeeInfo();
        numberThree.displayEmployeeInfo();
        System.out.println(Employee.company);
    }

}
