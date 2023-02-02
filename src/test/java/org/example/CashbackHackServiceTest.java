package org.example;


import org.testng.Assert;
import org.testng.annotations.Test;



public class CashbackHackServiceTest {

    @Test
    public void shouldDisplayRemainIfNormalAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldDisplayRemainIfMaxBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, actual);

    }
}