package cotroller;

import model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginManager {
    ArrayList<Account> accounts = new ArrayList<>();

   public void addAccount(String user, String password){
       accounts.add(new Account(user,password));
   }
   public Account writeAccount(){
       Scanner lg = new Scanner(System.in);
       Scanner lg1 = new Scanner(System.in);
       Account newAccount = new Account();
       System.out.println("Mời bạn nhập tên đăng nhập tài khoản:");
       String user = lg.nextLine();
       newAccount.setUser(user);
       System.out.println("Mời bạn nhập mật khẩu tài khoản:");
       String passWork = lg1.nextLine();
       newAccount.setPassWork(passWork);
       return newAccount;
   }

    public void accountLogin() {
        Scanner lg = new Scanner(System.in);
        Scanner lg1 = new Scanner(System.in);
        String user;
        String passWork;
        boolean check = false;
        do {
            check = checkAcount(writeAccount());
        } while (!check);
    }
    public boolean checkAcount(Account account) {
        boolean check = false;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUser().equals(account.getUser()) && accounts.get(i).getPassWork().equals(account.getPassWork())){
                check = true;
            }
            break;
        }
        if(check){
            System.out.println("Đăng nhập thành công: ");
            return true;
        }
        else System.out.println("Sai tài khoản hoặc mật khẩu: ");
        return false;
    }
}

