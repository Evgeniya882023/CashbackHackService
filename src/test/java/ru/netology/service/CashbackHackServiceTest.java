package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test // не хватает суммы для кешбека
    public void testRemainMinusAmount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test // кешбек начисляется при покупке в 1000 р.
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
