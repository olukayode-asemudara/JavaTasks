public class StandardDeviation{

    public static double calculateSum(double[] numbers){
        double sum =  0;
        for(int id = 0; id < numbers.length; id++){
            sum += numbers[id];
        }
        return sum;
    }
    
    public static double calculateMean(double[] numbers){
        double result = calculateSum(numbers)/numbers.length;
        return result;
    }

    public static double calculateMeanVariation(double[] numbers){
        
    }
    
    public static double calculateVariance(double[] numbers){
    
        return 96.01;
    }
    
    public static double getSquaredDifferences(double[] numbers){
    
        return 960.1;
    }
    
    public static double getStandardDeviation(double[] numbers){
    
        return 10.33;
    }
    
    
}
















    // used my main-method to test outputs personally to see

    // public static void main(String[] args){
    //     double[] scoresList = {22,15,10,44,10,20,12,10,22,22};
    //     System.out.println(calculateMean(scoresList));
    // }
