package com.ubs.opsit.interviews;


import org.junit.Ignore;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Avadhoot on 8/13/2017.
 */
public class HourTest {

    private Hour testee = null;

    @Test
    public void testWhenHourZero(){
        testee = new Hour(0);
        assertEquals("OOOO",testee.representTopRow());
        assertEquals("OOOO",testee.representBottomRow());
    }

    @Test
    public void testWhenHourThirteen(){
        testee = new Hour(13);
        assertEquals("RROO",testee.representTopRow());
        assertEquals("RRRO",testee.representBottomRow());
    }

    @Test
    public void testWhenHourTwentyThree(){
        testee = new Hour(23);
        assertEquals("RRRR",testee.representTopRow());
        assertEquals("RRRO",testee.representBottomRow());
    }
}
