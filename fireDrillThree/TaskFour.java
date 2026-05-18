public class TaskFour{
    public static int[] getArrayEvenIndex(int[] number){
        int newSize = (number.length + 1) / 2;
        int[] result = new int[newSize];

        int resultIndex = 0;
        for(int index = 0; index < number.length; index += 2){
            result[resultIndex] = number[index];
            resultIndex++;
        }
        return result;
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int[] evenElements = getArrayEvenIndex(array);

        for(int num : evenElements){
            System.out.print(num + " ");
        }
    }
}
