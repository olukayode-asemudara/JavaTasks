// collect the cartTotal from the user using the terminal andthe promoCode for each customer using the terminal
// return the final price after applying the discount
// check for invalid promo code then return original cart total unchanged


public class OshoFreePromoEngine{

    public static double getDiscountValue(String promoCode) {
        
        promoCode = promoCode.toUpperCase();
        double discount = 0;
        
        if(promoCode == ""){
            return 0;
        }
        
        if (promoCode.equals("STARTER10")) {
            discount = 0.1;

        } else if (promoCode.equals("BIGBOY20")) {
            discount = 0.2;

        } else if (promoCode.equals("OSHOFREE35")) {
            discount = 0.35;
        }

        return discount;
    }

    
    public static double getFinalPrice(double cartTotal, String promoCode){
        double discount = getDiscountValue(promoCode);
        double finalPrice = 0;
        if(cartTotal < 5000){            
            finalPrice = cartTotal;
        } else{ 
            finalPrice = cartTotal - (cartTotal * discount);
        }
        return finalPrice;
    }
    
    
    // public static void main(String[] args){
    //     System.out.println(getPriceMinusDiscount(3000, ""));
    // }
}
