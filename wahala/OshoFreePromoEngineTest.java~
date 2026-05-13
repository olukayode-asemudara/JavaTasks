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
            assertEquals(expectedResult, actualResult, "invalid promo code");
        }

        
        @Test
        public void testThatDiscountValueIsCalculatedWhenPromoCodeIsGiven(){
            // Arrange
            double cartTotal = 4000;
            double expectedResult = 4500;
            String promoCode = "STARTER10";
            
            // Act
            double actualResult = OshoFreePromoEngine.getPriceMinusDiscount(cartTotal, promoCode);
            
            // Assert
            assertEquals(expectedResult, actualResult);
        }
    
}
