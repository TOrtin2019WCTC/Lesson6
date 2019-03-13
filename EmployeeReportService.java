package lab4;

/**
 *
 * @author tim
 */
public class EmployeeReportService {

    private String report = "";

    public void addData(String data) {
        report += data;
    }

    public void outputReport() {
        System.out.println(report);
    }

    public void clearReport() {
        report = "";
    }

}
