import org.junit.Assert;
import org.junit.Test;
public class TestedClassTest {
    @Test
    public void testIsNumber() {
        String str = "ghfhf55";
        boolean realthing;
        boolean expected = false;
        realthing = TestedTask.isNumber(str);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testIsNatural() {
        int x = 10;
        boolean realthing;
        boolean expected = true;
        realthing = TestedTask.isNatural(x);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testIsDivider() {
        int x = 0;
        boolean realthing;
        boolean expected = false;
        realthing = TestedTask.isDivider(x);
        Assert.assertEquals(expected, realthing);
    }
    @Test
    public void testDividingMethod() {
        int x = 25;
        int y = 5;
        int realthing;
        int expected = 25;
        realthing = TestedTask.dividingMethod(x, y);
        Assert.assertEquals(expected, realthing);
    }

}
