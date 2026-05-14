public class SmallMathApp{
    static double numOne = 20;
    static double numTwo = 10;

    public static double calcSum(double numOne, double numTwo){
        return numOne + numTwo;
    }
    
    public static double calcMinus(double numOne, double numTwo){
        return numOne - numTwo;

    }
    
    public static double calcMultiply(double numOne, double numTwo){
        return numOne * numTwo;

    }
    
    public static double calcDivide(double numOne, double numTwo){
        return numOne / numTwo;
    }
    
    public static double operation(String operand){
        if(operand.equals("+")){
            return calcSum(numOne, numTwo);
        } else if(operand.equals("*")){
            return calcMultiply(numOne, numTwo);
        } else if(operand.equals("-")){
            return calcMinus(numOne, numTwo);
        } else if(operand.equals("/")){
            return calcDivide(numOne, numTwo);
        } else return 0;
    }
}
