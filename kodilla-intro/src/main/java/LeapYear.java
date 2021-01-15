public class LeapYear {
    public static void main(String[] args) {

        int leapYear = 2020;

        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0)
            System.out.println("Rok jest przestepny");
        else  {
            System.out.println("Rok NIE jest przestepny");
        }

    }
}
