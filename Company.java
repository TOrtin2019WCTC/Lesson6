/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author tim
 */
public class Company {

    private lab4.solution.HrPerson hr;

    public Company() {
        hr = new lab4.solution.HrPerson();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }

    public lab4.solution.HrPerson getHr() {
        return hr;
    }

    public void setHr(lab4.solution.HrPerson hr) {
        this.hr = hr;
    }

}