public class TryingMethods {
    public static void main(String[] args) {
        // Object to test monthOfTheYear method
        TryingMethods checkForMonth = new TryingMethods();
        System.out.println(checkForMonth.monthOfTheYear(1));
    }

    String monthOfTheYear(int month) {
        String monthOfTheYear = "";
        switch (month) {
            case 1:
                monthOfTheYear = "Jan";
                break;
            case 2:
                monthOfTheYear = "Feb";
                break;
            case 3:
                monthOfTheYear = "Mar";
                break;
            case 4:
                monthOfTheYear = "Apr";
                break;
            case 5:
                monthOfTheYear = "May";
                break;
            case 6:
                monthOfTheYear = "Jun";
                break;
            case 7:
                monthOfTheYear = "Jul";
                break;
            case 8:
                monthOfTheYear = "Aug";
                break;
            case 9:
                monthOfTheYear = "Sep";
                break;
            case 10:
                monthOfTheYear = "Oct";
                break;
            case 11:
                monthOfTheYear = "Nov";
                break;
            case 12:
                monthOfTheYear = "Dec";
                break;
            default:
                break;
        }
        return monthOfTheYear;
    }

}
