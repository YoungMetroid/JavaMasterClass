package section4;

public class secondsMinuteChallenge {
    public static void main(String args[])
    {
        System.out.println(getDurationString(195,45));
        System.out.println(getDurationString(4500));
    }

    public static String getDurationString(int minutes, int seconds)
    {
        if(minutes >= 0 && seconds >=0 && seconds <=60)
        {
            int hours = Math.round(minutes/60);
            int mins = minutes%60;

            String hoursString = hours + "h ";
            String minsString = mins + "m ";
            String secondsString = seconds + "s ";
            if(hours < 10)
                hoursString = "0" + hoursString;
            if(mins < 10)
            {
                minsString = "0" + minsString;
            }
            if(seconds < 10)
                secondsString = "0" + secondsString;

            return hoursString + minsString + secondsString;
        }
        return "Invalid Value";
    }
    public static String getDurationString(int seconds)
    {
        if(seconds >= 0)
        {
            int minutes = seconds/60;
            int remainingSeconds = seconds%60;
            return getDurationString(minutes,remainingSeconds);
        }
        return "Invalid Value";
    }
}
