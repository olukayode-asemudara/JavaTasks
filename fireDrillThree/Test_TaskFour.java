import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_TaskFour{

    @Test
    public void testThatReturnedArrayIsInEvenIndexFunctionExists() {
        int[] result = TaskFour.getArrayEvenIndex(new int[]{1,2,3,4,5,6,7,8,9,0});
    }
    
    @Test
    public void testThatMethodReturnsElementsInEvenIndexes(){
        int[] result = TaskFour.getArrayEvenIndex(new int[] {1,2,3,4,5,6,7,8,9,0});
        int[] expected = {1,3,5,7,9};
        assertArrayEquals(expected, result);
    }
}
