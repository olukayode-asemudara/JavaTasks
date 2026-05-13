import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{

        @Test
        public void testThatMethodGetsPromoCodeAndReturnsDiscount(){
            // Arrange
            String promoCode = "BIGBOY20";
            double expectedResult = 0.2;
            
            // Act
            double actualResult = OshoFreePromoEngine.getDiscountValue(promoCode);
            
            // Assert
            assertEquals(expectedResult, actualResult);
        }
        
        
        @Test
        public void testThatPromoCodeIsValid(){
            // Arrange
            String promoCode = "STARTER10";
            
            // Act
            boolean actualResult = OshoFreePromoEngine.isValidPromoCode(promoCode);
            
            // Assert
            assertTrue(actualResult, "Invalid promo code!");
        }

        
        @Test
        public void testThatDiscountValueIsCalculatedWhenPromoCodeIsGiven(){
            // Arrange
            
            // Act
            
            // Assert
        }
    
}
