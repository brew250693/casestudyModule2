package model;

public class PartTimeEmployee extends Employee {
    private double timeWork;
    private double wage;




    public PartTimeEmployee(String name, int age, int phoneNumber, String email, String id, String adress) {
        super(name, age, phoneNumber, email, id, adress);
    }

    public PartTimeEmployee() {

    }
    @Override
    public String toString() {
        return super.toString() + "PartTimeEmployee{" +
                "timeWork=" + timeWork +
                ", wage=" + wage +
                '}';
    }

    public PartTimeEmployee(double timeWork, double wage) {
        this.timeWork = timeWork;
        this.wage = wage;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
