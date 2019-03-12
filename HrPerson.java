/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tim
 */
public class HrPerson {

    private List<lab4.solution.Employee> employees;

    public HrPerson() {
        employees = new ArrayList();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        lab4.solution.Employee e = new lab4.solution.Employee(firstName, lastName, ssn);
        employees.add(e);
        orientEmployee(e);
    }

  
    public void orientEmployee(lab4.solution.Employee e) {
        e.doFirstTimeOrientation("B101");
    }

    public void outputReport(String ssn) {
        lab4.solution.Employee e = null;

        for (lab4.solution.Employee emp : employees) {
            if (emp.getSsn().equals(ssn)) {
                e = emp;
                break;
            } else{
                
                return;
            }
        }

        // if found run report
        if (e.isMetWithHr() && e.isMetDeptStaff()
                && e.isReviewedDeptPolicies() && e.isMovedIn()) {

            e.getReportService().outputReport();

        }
    }

    public List<lab4.solution.Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<lab4.solution.Employee> employees) {
        this.employees = employees;
    }

    public static void main(String[] args) {
        HrPerson hr = new HrPerson();
        hr.hireEmployee("John", "Doe", "333-33-3333");
        System.out.println(hr.getEmployees());
      }
    }


