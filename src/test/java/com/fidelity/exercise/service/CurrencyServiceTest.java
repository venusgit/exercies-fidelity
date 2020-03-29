package com.fidelity.exercise.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CurrencyServiceTest {

    private CurrencyService service;

    @Before
    public void setup() {
        service = new CurrencyServiceImpl();
    }

    @Test
    public void getChangesSuccessTest() throws Exception {
        String result = service.getChanges("usd", 287);
        Assert.assertEquals("2 Dollar 3 Quarter 1 Dime 2 Penny  coins.", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getChangesInvalidCurrencyTest() throws Exception {
        String result = service.getChanges("wrong", 287);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getChangesInvalidAmountTest() throws Exception {
        String result = service.getChanges("usd", 0);
    }


}
