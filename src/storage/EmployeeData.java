package storage;

import model.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeData {
    List<Employee> getData() throws IOException, ClassNotFoundException;
    void setData(List<Employee> employees);
}
