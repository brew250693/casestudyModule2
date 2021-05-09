package cotroller;

import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;
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

    public void addNewEmployee(Employee e) {
        employees.add(e);
        employeeData.setData(employees);
    }

    public void showAllEmployee() {
        for (Employee e : employees
        ) {
            System.out.println(e.toString());
        }
    }

    public void searchByName(String name) {
        for (Employee e : employees
        ) {
            if (e.getName().equals(name))
                System.out.println(e);
        }
    }

    public void updateEmployeeFullTime(String name, double bonusMoney, double fineMoney, double hardSalary) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof FullTimeEmployee) {
                if (employees.get(i).getName().equals(name)) {
                    ((FullTimeEmployee) employees.get(i)).setBonusMoney(bonusMoney);
                    ((FullTimeEmployee) employees.get(i)).setFineMoney(fineMoney);
                    ((FullTimeEmployee) employees.get(i)).setHardSalary(hardSalary);
                }
            }
        }
    }

    public void updateEmployeePartTme(String name, double timeWork, double wage) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof PartTimeEmployee) {
                if (employees.get(i).getName().equals(name)) {
                    ((PartTimeEmployee) employees.get(i)).setTimeWork(timeWork);
                    ((PartTimeEmployee) employees.get(i)).setWage(wage);
                }
            }
        }
    }

    public void deleteEmployee(String name) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(name)) {
                employees.remove(employees.get(i));
            }
        }
    }

    public void getAmountOfFullTimeEmployee(String name) {
        for (Employee e : employees
        ) {
            if (e instanceof FullTimeEmployee) {
                FullTimeEmployee a = (FullTimeEmployee) e;
                if (a.getName().equals(name)) {
                    System.out.println(a.getAmountOfStaffs());
                }
            }
        }
    }

    public void getAmountOfPartTimeEmployee(String name) {
        for (Employee e : employees
        ) {
            if (e instanceof PartTimeEmployee) {
                PartTimeEmployee a = (PartTimeEmployee) e;
                System.out.println(a.getAmountOfStaffs());
            }
        }
    }

    public void showAllFullTimeEmployee() {
        for (Employee e : employees
        ) {
            if (e instanceof FullTimeEmployee) {
                FullTimeEmployee a = (FullTimeEmployee) e;
                System.out.println(a);
            }
        }
    }

    public void showAllPartTimeEmployee() {
        for (Employee e : employees
        ) {
            if (e instanceof PartTimeEmployee) {
                PartTimeEmployee a = (PartTimeEmployee) e;
                System.out.println(a);
            }
        }
    }

    public void checkStatusEmployee(boolean status) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getStatus() == status) {
                System.out.println(employees.get(i).getName());

            }
        }
    }
    public void getAVGOfEmployeeFullTime(){
        double avg = 0;
        for (Employee e:employees
             ) {
            if(e instanceof FullTimeEmployee){
                FullTimeEmployee a = (FullTimeEmployee) e;
                avg = a.getAmountOfStaffs()/employees.size();
                System.out.println(avg);
            }
        }
    }
    public void getAVGOfEmployeePartTime(){
        double avg = 0;
        for (Employee e:employees
        ) {
            if(e instanceof PartTimeEmployee){
                PartTimeEmployee a = (PartTimeEmployee) e;
                avg = a.getAmountOfStaffs()/employees.size();
                System.out.println(avg);
            }
        }
    }
}