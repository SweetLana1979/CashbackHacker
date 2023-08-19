package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemainNone() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

      
    @org.junit.Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
}
