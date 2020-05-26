import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }
    
    @Test
    public void SortOddTest() {
        int[] actual = {5, 3, 2, 8, 1, 4};
        int[] expected = {1, 3, 2, 8, 5, 4};
        assertEquals(expected, solution.sortOdd(actual));
    }
}