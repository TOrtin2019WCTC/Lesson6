package lab3;
import javax.swing.JOptionPane;


/**
 *
 * @author jlombardo
 */

public class EmployeeReportservice{
    
private String report = "";

    public void addData(String data) {
        report += data;
    }

    public void outputReport() {
        JOptionPane.showMessageDialog(null, report);
        System.out.println(report);
    }

    public void clearReport() {
        report = "";
    }

}



