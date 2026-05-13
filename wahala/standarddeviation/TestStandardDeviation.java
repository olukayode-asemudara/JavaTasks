import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestStandardDeviation{

    @Test
    public void testThatMethodCalculatesSumOfGivenNumbers(){
        // Arrange
        double[] scoresList = {22,15,10,44,10,20,12,10,22,22};
        double expectedResult = 187;
        
        // Act
        double actualResult = StandardDeviation.calculateMean(scoresList);
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testThatMethodCalculatesMeanOfGivenNumbers(){
        // Arrange
        double[] scoresList = {22,15,10,44,10,20,12,10,22,22};
        double expectedResult = 18.7;
        
        // Act
        double actualResult = StandardDeviation.calculateMean(scoresList);
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testThatMethodCalculatesVarianceOfGivenNumbers(){
        // Arrange
        double[] scoresList = {22,15,10,44,10,20,12,10,22,22};
        double expectedResult = 96.01;
        
        // Act
        double actualResult = StandardDeviation.calculateVariance(scoresList);
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testForSquaredNumbersOfGivenValue(){
        // Arrange
        double[] scoresList = {22,15,10,44,10,20,12,10,22,22};
        double expectedResult = 960.1;
        
        // Act
        double actualResult = StandardDeviation.getSquaredDifferences(scoresList);
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testForStandrdDeviationOfGivenValue(){
        // Arrange
        double[] scoresList = {22,15,10,44,10,20,12,10,22,22};
        double expectedResult = 10.33;
        
        // Act
        double actualResult = StandardDeviation.getSquaredDifferences(scoresList);
        
        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
