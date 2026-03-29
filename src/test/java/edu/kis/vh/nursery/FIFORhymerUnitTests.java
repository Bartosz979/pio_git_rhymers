package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;
public class FIFORhymerUnitTests {
    @Test
    public void returnElementsInOrder() {
        FIFORhymer rhymer = new FIFORhymer();

        rhymer.countIn(1);
        rhymer.countIn(2);
        rhymer.countIn(3);

        Assert.assertEquals(1, rhymer.countOut());
        Assert.assertEquals(2, rhymer.countOut());
        Assert.assertEquals(3, rhymer.countOut());
    }

    @Test
    public void preserveElements() {
        FIFORhymer rhymer = new FIFORhymer();
        rhymer.countIn(10);
        rhymer.countIn(20);
        rhymer.countIn(30);

        int first = rhymer.countOut();

        Assert.assertEquals(10, first);
        Assert.assertEquals(20, rhymer.countOut());
        Assert.assertEquals(30, rhymer.countOut());
    }
}
