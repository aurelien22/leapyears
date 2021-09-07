public class LeapYearDetector {
    public Boolean isALeapYear(int year) {
        if (year == 2100 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else if (year % 4 != 0) {
            return false;
        }
        else return year % 400 == 0;
    }
}