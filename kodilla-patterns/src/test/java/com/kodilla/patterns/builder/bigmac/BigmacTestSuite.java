package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Buns.ZSEZAMEM.getDescription())
                .roll(false)
                .burgers(2)
                .sauce(Souces.TYSIACWYSP.getDescription())
                .ingredient(Ingredients.SALATA.getDescription())
                .ingredient(Ingredients.CEBULA.getDescription())
                .build();

        //When
        String bun = bigmac.getBun();
        boolean roll = bigmac.isRoll();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        int ingriedients = bigmac.getIngredients().size();

        //Then
        System.out.println(bigmac);
        Assert.assertEquals("z sezamem", bun);
        Assert.assertFalse(roll);
        Assert.assertEquals(2, burgers);
        Assert.assertEquals("1000 wysp", sauce);
        Assert.assertEquals(2, ingriedients);
    }
}
