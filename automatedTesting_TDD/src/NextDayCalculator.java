public class NextDayCalculator {
    public static int findNextDay(int day,int month) {
        switch (month) {
            case 1:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12:
                checkDay1(day);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                checkDay(day);
                break;
            case 2:
                checkDay2(day);
                break;
        }
        return 0;
    }


    public static String checkDay(int day) {
        if (day == 30) {
            return "Day 1" ;
        } else if (day > 0 && day < 29) {
            return "Day " + day + 1;
        }
        return "Khong phai ngay trong thang";
    }
    public static String checkDay1(int day){
        if (day == 31){
            return "Day 1";
        } else if (day > 0 && day < 30) {
            return "Day " + day + 1;
        }
        return "Khong phai ngay trong thang";
    }
    public static String checkDay2(int day){
        if (day == 28 || day == 29){
            return "Day 1";
        } else if (day > 0 && day < 28) {
            return "Day " + day + 1;
        }
        return "Khong phai ngay trong thang";
    }
}
