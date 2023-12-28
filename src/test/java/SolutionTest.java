import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test3() {
        int n = 3;
        int[] rollMax = {1, 1, 1, 2, 2, 3};
        int expected = 181;
        int actual = new Solution().dieSimulator(n, rollMax);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4() {
        int n = 4;
        int[] rollMax = {2,3,1,1,1,2};
        int expected = 991;
        int actual = new Solution().dieSimulator(n, rollMax);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5() {
        int n = 10;
        int[] rollMax = {2,7,1,2,6,5};
        int expected = 45008937;
        int actual = new Solution().dieSimulator(n, rollMax);
        Assert.assertEquals(expected, actual);
    }
}
