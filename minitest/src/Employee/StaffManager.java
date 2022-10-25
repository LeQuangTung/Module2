package Employee;

import java.util.ArrayList;
import java.util.List;

public class StaffManager {

    public static List<Staff> staffList;

    static {
        staffList = new ArrayList<>();
    }

    public static void main(String[] args) {
        staffList.add(new StaffFullTime(1,"A",0123451111,"1aaa@gmail.com",5000000,1000000,200000));
        staffList.add(new StaffFullTime(2,"B",0123452222,"2bbb@gmail.com",5000000,500000,100000));
        staffList.add(new StaffFullTime(3,"C",0123453333,"3ccc@gmail.com",5000000,500000,0));
        staffList.add(new StaffPartTime(4, "D", 0123454444, "4ddd@gmail.com",4));
        staffList.add(new StaffPartTime(5, "E", 0123455555, "5eee@gmail.com",4));
        staffList.add(new StaffPartTime(6, "F", 0123456666, "6fff@gmail.com",4));
    }

    public double calculateMoneyFullTime() {
        StaffFullTime staffFullTime = new StaffFullTime();
        return staffFullTime.getSalary() + staffFullTime.getBonus() - staffFullTime.getFine();
    }

    public double calculateMoneyPartTime(){
        StaffPartTime staffPartTime = new StaffPartTime();
        return staffPartTime.getWorkingHours() * 100000;
    }

}
