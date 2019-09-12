package com.qnga;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PickerTest {
    @Test
    public void shouldPass()
    {
        Data data = new Data(
                "GOODSTOCK",
                "NASDAQ",
                2000000001D,
                10D,
                5D);

        Picker picker = new Picker();
        assertTrue(picker.shouldPick(data));
    }

    @Test
    public void shouldFailIfMktCapLessThan2B()
    {
        Data data = new Data(
                "GOODSTOCK",
                "NASDAQ",
                100000D,
                10D,
                5D);

        Picker picker = new Picker();
        assertFalse(picker.shouldPick(data));
    }

    @Test
    public void shouldFailIfPeRatioMoreThan15()
    {
        Data data = new Data(
                "GOODSTOCK",
                "NASDAQ",
                2000000001D,
                20D,
                5D);

        Picker picker = new Picker();
        assertFalse(picker.shouldPick(data));
    }

    @Test
    public void shouldFailIfNoDivYield()
    {
        Data data = new Data(
                "GOODSTOCK",
                "NASDAQ",
                2000000001D,
                10D,
                0D);

        Picker picker = new Picker();
        assertFalse(picker.shouldPick(data));
    }
}
