package model;

public class FullTimeEmployee extends Employee {
    private double bonusMoney;
    private double fineMoney;
    private double hardSalary;

    public FullTimeEmployee(String name, int age, String phoneNumber, String email, String id, String adress, double bonusMoney, double fineMoney, double hardSalary) {
        super(name, age, phoneNumber, email, id, adress);
        this.bonusMoney = bonusMoney;
        this.fineMoney = fineMoney;
        this.hardSalary = hardSalary;
    }

    @Override
    public double getAmountOfStaffs() {
        return hardSalary+bonusMoney-fineMoney;
    }



    @Override
    public String toString() {
        return super.toString() + "FullTimeEmployee{" +
                "bonusMoney=" + bonusMoney +
                ", fineMoney=" + fineMoney +
                ", hardSalary=" + hardSalary +
                '}';
    }


    public FullTimeEmployee(String name, int age, String phoneNumber, String email, String id, String adress) {
        super(name, age, phoneNumber, email, id, adress);
    }

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double bonusMoney, double fineMoney, double hardSalary) {
        this.bonusMoney = bonusMoney;
        this.fineMoney = fineMoney;
        this.hardSalary = hardSalary;
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getFineMoney() {
        return fineMoney;
    }

    public void setFineMoney(double fineMoney) {
        this.fineMoney = fineMoney;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }
}
