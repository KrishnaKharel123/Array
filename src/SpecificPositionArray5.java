import java.util.Arrays;

public class SpecificPositionArray5
{
    public static void main(String[] args)
    {

   int[] numbers ={20,25,30,35,40,45}; //VARIABLES
   int index= 2;
   int value =27;

   for (int i =numbers.length -1; i > index; i-- )
   {
       numbers[i] = numbers[i-1];
   }
        numbers[index] = value;


        System.out.println(Arrays.toString(numbers));

    }


}
