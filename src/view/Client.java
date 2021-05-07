package view;

import cotroller.EmployeeFactory;
import cotroller.EmployeeManager;
import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;
import model.TypeOfEmployee;
import storage.FileManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Employee> employeesList = new ArrayList<>();
        EmployeeManager khanh = new EmployeeManager(employeesList);
        FileManager khanh1 = FileManager.getINSTANCE();

        Employee e1 = EmployeeFactory.getEmployee(TypeOfEmployee.FullTime, "Nguyen Van A", 25, 0123123123, "nguyenvana@gmail.com", "111222", "HaNoi");
        Employee e2 = EmployeeFactory.getEmployee(TypeOfEmployee.PartTime, "Nguyen Van B", 25, 0123123124, "nguyenvanb@gmail.com", "111223", "HaiPhong");
        khanh.addNewEmployee(e1);
        khanh.addNewEmployee(e2);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập lựa chọn: ");
            System.out.println("Bấm 1 để lấy thông tin nhân viên từ file");
            System.out.println("Bấm 2 để ghi thông tin nhân viên từ file");
            System.out.println("Bấm 3 để hiển thị thông tin nhân viên");
            System.out.println("Bấm 4 để tìm kiếm nhân viên");
            System.out.println("Bấm 5 để cập nhật nhân viên");
            System.out.println("Bấm 6 để xóa nhân viên");
            System.out.println("Bấm 7 để tính lương nhân viên theo từng loại");
            System.out.println("Bấm 8 để phân loại nhân viên");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    employeesList = khanh1.getData();
                    break;
                case 2:
                    System.out.println("Nhập a để thêm nhân viên FullTime");
                    System.out.println("Nhập b để thêm nhân viên PartTime");
                    Scanner s = new Scanner(System.in);
                    String type = s.nextLine();
                    switch (type) {
                        case "a":
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập tên: ");
                            String name = sc1.nextLine();
                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập tuổi: ");
                            int age = sc2.nextInt();
                            Scanner sc3 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập số điện thoại: ");
                            int phoneNumber = sc3.nextInt();
                            Scanner sc4 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập số email: ");
                            String email = sc4.nextLine();
                            Scanner sc5 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập số chứng minh nhân dân: ");
                            String id = sc5.nextLine();
                            Scanner sc6 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập số địa chỉ: ");
                            String adress = sc6.nextLine();
                            Scanner sc13 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập Tiền thưởng: ");
                            double bonusMoney = sc13.nextDouble();
                            Scanner sc14 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập Tiền phạt: ");
                            double fineMoney = sc14.nextDouble();
                            Scanner sc15 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập Lương cứng: ");
                            double hardSalary = sc15.nextDouble();
                            Employee e = EmployeeFactory.getEmployee(TypeOfEmployee.FullTime, name, age, phoneNumber, email, id, adress);
                            ((FullTimeEmployee) e).setBonusMoney(bonusMoney);
                            ((FullTimeEmployee) e).setFineMoney(fineMoney);
                            ((FullTimeEmployee) e).setHardSalary(hardSalary);
                            khanh.addNewEmployee(e);
                            break;
                        case "b":
                            Scanner sc7 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập tên: ");
                            String name1 = sc7.nextLine();
                            Scanner sc8 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập tuổi: ");
                            int age1 = sc8.nextInt();
                            Scanner sc9 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập số điện thoại: ");
                            int phoneNumber1 = sc9.nextInt();
                            Scanner sc10 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập số email: ");
                            String email1 = sc10.nextLine();
                            Scanner sc11 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập số chứng minh nhân dân: ");
                            String id1 = sc11.nextLine();
                            Scanner sc12 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập số địa chỉ: ");
                            String adress1 = sc12.nextLine();
                            Scanner sc16 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập giờ làm: ");
                            double timeWork = sc16.nextDouble();
                            Scanner sc17 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập lương theo giờ: ");
                            double wage = sc17.nextDouble();
                            Employee e3 = EmployeeFactory.getEmployee(TypeOfEmployee.PartTime, name1, age1, phoneNumber1, email1, id1, adress1);
                            ((PartTimeEmployee) e3).setTimeWork(timeWork);
                            ((PartTimeEmployee) e3).setWage(wage);
                            khanh.addNewEmployee(e3);
                            break;
                    }
                    break;
                case 3:
                    khanh.showAllEmployee();
                    break;
                case 4:

                case 5:



            }

        }
    }
}

