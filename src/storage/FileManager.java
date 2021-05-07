package storage;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager implements EmployeeData {
    private FileManager() {
    }
    private static FileManager INSTANCE;
    public static FileManager getINSTANCE(){
        if (INSTANCE == null) INSTANCE = new FileManager();
        return INSTANCE;
    }

    @Override
    public List<Employee> getData() throws IOException, ClassNotFoundException {
        File file = new File("List.txt");
        if(!file.exists()) file.createNewFile();
        if(file.length()>0){
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object o = objectInputStream.readObject();
            List<Employee> employees = (List<Employee>) o;
            objectInputStream.close();
            fileInputStream.close();
            return employees;
        }
        return new ArrayList<>();
    }

    @Override
    public void setData(List<Employee> employees) {
        File file = new File("List.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = null;
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                objectOutputStream.writeObject(employees);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            objectOutputStream.close();
//            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
