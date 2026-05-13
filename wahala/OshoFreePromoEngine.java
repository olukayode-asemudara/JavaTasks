// collect the cartTotal from the user using the terminal andthe promoCode for each customer using the terminal
// return the final price after applying the discount
// check for invalid promo code then return original cart total unchanged
// check for cart total of exactly #5,000___#15,000___#30,000


public class OshoFreePromoEngine{
    public static double getDiscountValue(String promoCode){
        double Discount = 00;
        if(promoCode.toUpperCase().equals("STARTER10")){
            Discount = 0.1;
        } else if(promoCode.toUpperCase().equals("BIGBOY20")){
            Discount = 0.2;        
        } else if(promoCode.toUpperCase().equals("OSHOFREE35")){
            Discount = 0.35;
        }
        return Discount;
    }

    public static boolean isValidPromoCode(String promoCode) {
        switch(promoCode.toUpperCase()) {

            case "STARTER10":
            case "BIGBOY20":
            case "OSHOFREE35":
                return true;
            default:
                return false;
        }
    }
}
