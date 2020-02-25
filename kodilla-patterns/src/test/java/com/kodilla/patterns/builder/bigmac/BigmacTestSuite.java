package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("WITH SESAME")
                .sauce("STANDARD")
                .burgers(3)
                .ingredient("ONIONS")
                .ingredient("BACON")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals(3, howManyBurgers);
    }
}
