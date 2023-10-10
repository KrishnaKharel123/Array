public class IndexElementArray4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};  //variable as element
        int target = 8;
        int index = findIndexValue(numbers, target);
        System.out.println(index);


    }

    public static int findIndexValue(int[] numbers, int target)
    {
        for (int i = 0; i < numbers.length; i++) {  //lOOP
            if (numbers[i] == target) {
                return i;
            }
        }
              return -1;
    }

}


