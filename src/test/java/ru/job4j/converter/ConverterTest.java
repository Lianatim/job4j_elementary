package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        Assert.assertEquals(2, Converter.rubleToEuro(140), 0.0001f);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        Assert.assertEquals(3, Converter.rubleToDollar(180), 0.0001f);
    }
}