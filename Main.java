
public class Main
{
    public static void main(String[] args)
    {
        calculation(168260271);
        calculation(27364375);
        calculation(67294091);
    }

    public static int calculation(int totalTime)
    {
        int year = totalTime / (1440 * 365) + 1;
        int day = (totalTime / 1440) % 365 + 1;
        int hour = (totalTime / 60) % 24;
        int minute = totalTime % 60;
        int trammel = (totalTime / 1440) % 9;
        int felucca = (totalTime / 1440) % 14;

        System.out.println("worldTime = " + totalTime);
        System.out.printf("It is %d:%02d on day %d of the year %d.", hour, minute, day, year);
        System.out.println("\nTrammel is in day " + (trammel + 1) + " of its 9 day phase.");
        System.out.println("Felucca is in day " + (felucca + 1) + " of its 14 day phase.\n");

        return 0;
    }
}
