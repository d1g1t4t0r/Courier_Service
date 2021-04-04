package Libs;

public class Int_To_Time {
    public static String getTime(int mins) {
        int h = mins / 60;
        String hour = String.format("%02d",mins /60);
        String minutes = String.format("%02d",(mins - (mins/60)*60)%60);
        return hour + ":" + minutes;
    }
}
