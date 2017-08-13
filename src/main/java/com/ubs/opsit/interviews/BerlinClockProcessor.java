package com.ubs.opsit.interviews;

/**
 * Created by Avadhoot on 8/13/2017.
 */
public class BerlinClockProcessor implements TimeConverter{
    @Override
    public String convertTime(String aTime) {
        String[] timeReader = aTime.split(":");
        int hours = Integer.parseInt(timeReader[0]);
        int minutes = Integer.parseInt(timeReader[1]);
        int seconds = Integer.parseInt(timeReader[2]);
        BerlinClock berlinClock = new BerlinClock(hours, minutes, seconds);
        return berlinClock.printCurrentTime();
    }
}
