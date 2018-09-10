import java.util.Scanner;

class Time{
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        int minuteExtra = second / 60;
        second %= 60;

        minute += minuteExtra;
        int hourExtra = minute / 60;
        minute %= 60;

        hour += hourExtra;
        hour %= 24;

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal(){
        String h = format(hour);
        String m = format(minute);
        String s = format(second);

        return h + ":" + m + ":" + s;
    }

    public String toStandart(){
        String h = "";
        String m = format(minute);
        String s = format(second);

        if (hour / 12 == 0){
            h = format(hour);

            return h + ":" + m + ":" + s + " AM";
        }
        else{
            int hourNew = hour - 12;

            h = format(hourNew);

            return h + ":" + m + ":" + s + " PM";
        }
    }

    public void add(Time t){
        this.second += t.second;
        int minuteExtra = this.second / 60;
        this.second %= 60;

        this.minute += t.minute;
        this.minute += minuteExtra;
        int hourExtra = this.minute / 60;
        this.minute %= 60;

        this.hour += t.hour;
        this.hour += hourExtra;
        this.hour %= 24;
    }

    public static Time Sum(Time t1, Time t2){
        int s, m, h;

        s = t1.second + t2.second;
        int mExtra = s / 60;
        s %= 60;

        m = t1.minute + t2.minute + mExtra;
        int hExtra = m / 60;
        m %= 60;

        h = t1.hour + t2.hour + hExtra;
        h %= 24;

        return new Time(h, m, s);
    }

    private static String format(int num){
        if (num <= 9){
            return  "0" + Integer.toString(num);
        }
        else{
            return Integer.toString(num);
        }
    }
}

public class pr4{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Time t1 = new Time(15, 14,78);

        System.out.println(t1.toStandart());
        System.out.println(t1.toUniversal());

        Time t2 = new Time(2, 45, 1);
        Time t4 = new Time(15, 14, 78);

        t1.add(t2);

        System.out.println(t1.toStandart());
        System.out.println(t1.toUniversal());

        Time t3 = Time.Sum(t4, t2);

        System.out.println(t3.toStandart());
        System.out.println(t3.toUniversal());

    }
}