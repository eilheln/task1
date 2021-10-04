package com.epam.lessn2.task;
import org.junit.Assert;
import org.junit.Test;
public class TestedClassTest {
    @Test
    public void testIsNumber1() {
        String str = "ghfhf55";
        boolean realthing;
        boolean expected = false;
        realthing = TestedTask.isNumber(str);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testIsNumber2() {
        String str = "55";
        boolean realthing;
        boolean expected = true;
        realthing = TestedTask.isNumber(str);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testIsNatural1() {
        int x = 10;
        boolean realthing;
        boolean expected = true;
        realthing = TestedTask.isNatural(x);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testIsNatural2() {
        int x = -20;
        boolean realthing;
        boolean expected = false;
        realthing = TestedTask.isNatural(x);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testIsDivider1() {
        int x = 0;
        boolean realthing;
        boolean expected = false;
        realthing = TestedTask.isDivider(x);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testIsDivider2() {
        int x = 10;
        boolean realthing;
        boolean expected = true;
        realthing = TestedTask.isDivider(x);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testDividingMethod1() {
        int x = 25;
        int y = 5;
        int realthing;
        int expected = 25;
        realthing = TestedTask.dividingMethod(x, y);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testDividingMethod2() {
        int x = 25;
        int y = 4;
        int realthing;
        int expected = 0;
        realthing = TestedTask.dividingMethod(x, y);
        Assert.assertEquals(expected, realthing);
    }
}
