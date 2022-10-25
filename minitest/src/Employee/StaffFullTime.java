package Employee;

public class StaffFullTime extends Staff{
    public double salary;
    public double bonus;
    public double fine;

    public StaffFullTime() {
    }

    public StaffFullTime(int id, String name, int phone, String email, double salary, double bonus, double fine) {
        super(id, name, phone, email);
        this.salary = salary;
        this.bonus = bonus;
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "StaffFullTime{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", fine=" + fine +
                '}';
    }
}
