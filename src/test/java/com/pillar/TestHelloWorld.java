package com.pillar;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {

    private PillarWorld pillarWorld = new PillarWorld();


    @Test
    public void pillarWorldTest() {
        String pillarTest = pillarWorld.pillar("pillar");
        Assert.assertEquals("pillarTEST", pillarTest);
    }

}
