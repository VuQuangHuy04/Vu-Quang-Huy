package trenlop.bai3.bai1;

public class Manager extends Employee{
    private double salary_allowance;

    public Manager(double salary, double salary_allowance) {
        super(salary);
        this.salary_allowance = salary_allowance;
    }
    @Override
    public double getSalary(){
        return salary_allowance + super.getSalary();
    }
    public double getSalary_allowance() {
        return salary_allowance;
    }

    public void setSalary_allowance(double salary_allowance) {
        this.salary_allowance = salary_allowance;
    }
}
