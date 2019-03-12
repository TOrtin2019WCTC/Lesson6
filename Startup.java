
package lab4;

/**
 *
 * @author tim
 */
public class Startup {

    public static void main(String[] args) {

        Employee employee = new Employee("Peter", "Piper", "333-33-3333");

        employee.doFirstTimeOrientation("A101");
        employee.getReportService().outputReport();
    }

}
