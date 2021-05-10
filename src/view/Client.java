package view;

import cotroller.EmployeeFactory;
import cotroller.EmployeeManager;
import cotroller.LoginManager;
import model.*;
import storage.FileManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Employee> employeesList = new ArrayList<>();
        LoginManager khanh2 = new LoginManager();
        khanh2.addAccount("admin", "admin");
        khanh2.accountLogin();
        FileManager khanh1 = FileManager.getINSTANCE();
        employeesList = khanh1.getData();
        EmployeeManager khanh = new EmployeeManager(employeesList);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn nhập lựa chọn: ");
            System.out.println("======================");
            System.out.println("Bấm 1 để lấy thông tin nhân viên từ file");
            System.out.println("Bấm 2 để thêm nhân viên ");
            System.out.println("Bấm 3 để hiển thị thông tin nhân viên");
            System.out.println("Bấm 4 để tìm kiếm nhân viên");
            System.out.println("Bấm 5 để cập nhật lương nhân viên");
            System.out.println("Bấm 6 để xóa nhân viên");
            System.out.println("Bấm 7 để hiển thị lương nhân viên theo tên");
            System.out.println("Bấm 8 để phân loại nhân viên");
            System.out.println("Bấm 9 để kiểm tra trạng thái nhân viên");
            System.out.println("Bấm 10 để hiển thị lương trung bình các nhân viên trong công ty");
            System.out.println("Bấm 11 để thoát");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    employeesList = khanh1.getData();
                    System.out.println(employeesList);
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
                            String phoneNumber = sc3.nextLine();
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
                            Scanner sc18 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập trạng thái: ");
                            Boolean status = sc18.nextBoolean();
                            Employee e = EmployeeFactory.getEmployee(TypeOfEmployee.FullTime, name, age, phoneNumber, email, id, adress);
                            ((FullTimeEmployee) e).setBonusMoney(bonusMoney);
                            ((FullTimeEmployee) e).setFineMoney(fineMoney);
                            ((FullTimeEmployee) e).setHardSalary(hardSalary);
                            ((FullTimeEmployee) e).setStatus(status);
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
                            String phoneNumber1 = sc9.nextLine();
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
                            Scanner sc19 = new Scanner(System.in);
                            System.out.println("Mời bạn nhập trạng thái: ");
                            boolean status1 = sc19.nextBoolean();
                            Employee e3 = EmployeeFactory.getEmployee(TypeOfEmployee.PartTime, name1, age1, phoneNumber1, email1, id1, adress1);
                            ((PartTimeEmployee) e3).setTimeWork(timeWork);
                            ((PartTimeEmployee) e3).setWage(wage);
                            ((PartTimeEmployee) e3).setStatus(status1);
                            khanh.addNewEmployee(e3);
                            break;
                    }
                    break;
                case 3:
                    khanh.showAllEmployee();
                    break;
                case 4:
                    String name3;
                    Scanner sc18 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập tên cần tìm: ");
                    name3 = sc18.nextLine();
                    khanh.searchByName(name3);
                    break;
                case 5:
                    System.out.println("Nhập a để sửa lương nhân viên FullTime");
                    System.out.println("Nhập b để sửa lương nhân viên PartTime");
                    Scanner u = new Scanner(System.in);
                    String type1 = u.nextLine();
                    switch (type1) {
                        case "a":
                            System.out.println("Nhập tên nhân viên FullTime cần sửa");
                            Scanner n = new Scanner(System.in);
                            String name = n.nextLine();
                            System.out.println("Nhập tiền thưởng cần sửa");
                            Scanner n1 = new Scanner(System.in);
                            double bonusMoney = n1.nextDouble();
                            System.out.println("Nhập tiền phạt cần sửa");
                            Scanner n2 = new Scanner(System.in);
                            double fineMoney = n2.nextDouble();
                            System.out.println("Nhập lương cứng cần sửa");
                            Scanner n3 = new Scanner(System.in);
                            double hardSalary = n3.nextDouble();
                            khanh.updateEmployeeFullTime(name, bonusMoney, fineMoney, hardSalary);
                            break;
                        case "b":
                            System.out.println("Nhập tên nhân viên PartTime cần sửa");
                            Scanner n4 = new Scanner(System.in);
                            String name1 = n4.nextLine();
                            System.out.println("Nhập số giờ làm cần sửa");
                            Scanner n5 = new Scanner(System.in);
                            double timeWork = n5.nextDouble();
                            System.out.println("Nhập lương theo giờ cần sửa");
                            Scanner n6 = new Scanner(System.in);
                            double wage = n6.nextDouble();
                            khanh.updateEmployeePartTme(name1, timeWork, wage);
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Nhập tên nhân viên cần xóa");
                    Scanner n = new Scanner(System.in);
                    String name = n.nextLine();
                    khanh.deleteEmployee(name);
                    break;
                case 7:
                    System.out.println("Mời bạn chọn nhân viên cần hiển thị lương: ");
                    System.out.println("Nhấn a để chọn nhân viên FullTime");
                    System.out.println("Nhấn b để chọn nhân viên PartTime");
                    Scanner u1 = new Scanner(System.in);
                    String type2 = u1.nextLine();

                    switch (type2) {
                        case "a":
                            System.out.println("Tên nhân viên FullTime cần hiển thị lương:");
                            Scanner n1 = new Scanner(System.in);
                            String name1 = n1.nextLine();
                            khanh.getAmountOfFullTimeEmployee(name1);
                            break;
                        case "b":
                            System.out.println("Tên nhân viên PartTime cần hiển thị lương:");
                            Scanner n2 = new Scanner(System.in);
                            String name2 = n2.nextLine();
                            khanh.getAmountOfPartTimeEmployee(name2);
                            break;
                    }
                    break;
                case 8:
                    System.out.println("Danh sách nhân viên trong công ty");
                    System.out.println("Nhấn a để hiển thị danh sách nhân viên FullTime");
                    System.out.println("Nhấn b để hiển thị danh sách nhân viên PartTime");
                    Scanner u2 = new Scanner(System.in);
                    String type3 = u2.nextLine();
                    switch (type3) {
                        case "a":
                            khanh.showAllFullTimeEmployee();
                            break;
                        case "b":
                            khanh.showAllPartTimeEmployee();
                            break;
                    }
                    break;
                case 9:
                    System.out.println("------ Chọn trạng thái hiển thị ------");
                    System.out.println("1. True(Đang làm việc)");
                    System.out.println("2. False(Đã nghỉ)");
                    int selection = new Scanner(System.in).nextInt();
                    switch (selection) {
                        case 1:
                            khanh.checkStatusEmployee(true);
                            break;
                        case 2:
                            khanh.checkStatusEmployee(false);
                            break;
                    }
                    break;
                case 10:
                    System.out.println("Lương trung bình các nhân viên trong công ty:");
                    System.out.println("Nhấn a để hiển thị lương trung bình nhân viên FullTime");
                    System.out.println("Nhấn b để hiển thị lương trung bình nhân viên PartTime");
                    Scanner avg = new Scanner(System.in);
                    String avg1 = avg.nextLine();
                    switch (avg1){
                        case "a":
                            System.out.println("Lương trung bình nhân viên FullTime:");
                            khanh.getAVGOfEmployeeFullTime();
                            break;
                        case "b":
                            System.out.println("Lương trung bình nhân viên PartTime:");
                            khanh.getAVGOfEmployeePartTime();
                            break;
                    }
                    break;
                case 11:
                    System.err.println("Cảm ơn!");
                    System.exit(0);
                    break;

            }
        }
    }
}

