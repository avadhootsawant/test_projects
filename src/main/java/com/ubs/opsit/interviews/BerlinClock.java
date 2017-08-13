package com.ubs.opsit.interviews;

/**
 * Created by Avadhoot on 8/13/2017.
 */
public class BerlinClock {

    private Hour hour;

    private Minute minute;

    private Second second;

    public BerlinClock(int hours, int minutes, int seconds) {

        this.hour = new Hour(hours);
        this.minute = new Minute(minutes);
        this.second = new Second(seconds);

    }

    public String printCurrentTime() {

        String output = second.representSecondsInBerlinFormat() +
                hour.representTopRow() +
                hour.representBottomRow() +
                minute.representTopRow() +
                minute.representBottomRow() ;
        System.out.println("Output generated :"+output);
        return output;
    }
}
