package cotroller;

import model.Employee;
import storage.EmployeeData;
import storage.FileManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    EmployeeData employeeData = FileManager.getINSTANCE();
    List<Employee> employees = new ArrayList<>();

    public EmployeeManager(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() throws IOException, ClassNotFoundException {
        employees = employeeData.getData();
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addNewEmployee(Employee e){
        employees.add(e);
        employeeData.setData(employees);
    }
    public void showAllEmployee(){
        for (Employee e: employees
             ) {
            System.out.println(e.toString());
        }
    }
}
