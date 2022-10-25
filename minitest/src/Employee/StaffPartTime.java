package Employee;

public class StaffPartTime extends Staff{
    public double workingHours;

    public StaffPartTime() {
    }

    public StaffPartTime(int id, String name, int phone, String email, double workingHours) {
        super(id, name, phone, email);
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "StaffPartTime{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", workingHours=" + workingHours +
                '}';
    }
}
