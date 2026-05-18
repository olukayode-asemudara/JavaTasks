public class TaskFive{
    public static int[] getArrayOddIndex(int[] number){
        int newSize = (number.length + 1) / 2;
        int[] result = new int[newSize];

        int resultIndex = 0;
        for(int index = 0; index < number.length; index += 3){
            result[resultIndex] = number[index];
            resultIndex++;
        }
        return result;
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int[] oddElements = getArrayOddIndex(array);

        for(int num : oddElements){
            System.out.print(num + " ");
        }
    }
}
