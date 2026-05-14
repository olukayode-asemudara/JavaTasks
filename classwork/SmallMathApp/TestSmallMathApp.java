import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSmallMathApp{


    @Test 
    public void testThatMathOperationAdditionWorks(){

        // Arrange
        double expectedResult = 30;
        
        // Act
        double actualResult = SmallMathApp.operation("+");
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test 
    public void testThatMathOperationSubtractionWorks(){
    
        // Arrange
        double expectedResult = 10;
        
        // Act
        double actualResult = SmallMathApp.operation("-");
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test 
    public void testThatMathOperationDivisionWorks(){
    
        // Arrange
        double expectedResult = 2;
        
        // Act
        double actualResult = SmallMathApp.operation("/");
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test 
    public void testThatMathOperationMultiplyWorks(){
    
        // Arrange
        double expectedResult = 200;
        
        // Act
        double actualResult = SmallMathApp.operation("*");
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
}
