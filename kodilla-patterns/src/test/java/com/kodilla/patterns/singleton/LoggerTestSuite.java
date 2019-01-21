package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("pierwszy zapis");

        //When
        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("pierwszy zapis", log);
    }

    @Test
    public void testGetLastLogEmpty() {
        //Given
        Logger.getInstance().log("");

        //When
        String log = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("", log);
    }
}
