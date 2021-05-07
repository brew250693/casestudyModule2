package cotroller;

import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;
import model.TypeOfEmployee;

public class EmployeeFactory {
    private EmployeeFactory() {
    }
    public static Employee getEmployee(TypeOfEmployee typeOfEmployee, String name, int age, int phoneNumber, String email, String id, String adress){
        Employee e = null;
        switch (typeOfEmployee){
            case FullTime:
                e = new FullTimeEmployee(name,age,phoneNumber,email,id,adress);
                break;
            case PartTime:
                e = new PartTimeEmployee(name,age,phoneNumber,email,id,adress);
                break;
        }
        return e;
    }
}
