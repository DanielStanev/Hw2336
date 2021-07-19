public class MyDate {
    private int year;
    private int month;
    private int day;
    private final String months[] = {"January", "February", "March", "April", "May", "June", "July", "August",
                                        "September", "October", "November", "December"};

    // constructors
    MyDate() {
        java.util.GregorianCalendar calander = new java.util.GregorianCalendar();
        year = calander.get(java.util.GregorianCalendar.YEAR);
        month = calander.get(java.util.GregorianCalendar.MONTH);
        day = calander.get(java.util.GregorianCalendar.DAY_OF_MONTH);
    }
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // accessors
    public int getDay()      { return day; }
    public String getMonth() { return months[month]; }
    public int getYear()     { return year; }

    // sets date based on milliseconds since beginning of Unix Epoch
    public void setDate(long elapsedTime) {
        java.util.GregorianCalendar calander = new java.util.GregorianCalendar();
        calander.setTimeInMillis(elapsedTime);
        year = calander.get(java.util.GregorianCalendar.YEAR);
        month = calander.get(java.util.GregorianCalendar.MONTH);
        day = calander.get(java.util.GregorianCalendar.DAY_OF_MONTH);
    }
}