public class SumValuesArray2
{
    public static void main(String[] args)
    {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};; ////integer array
        {

            int sum = 0;
            int i;


            for (i = 0; i < numbers.length; i++) ////loop through array

            {
                sum += numbers[i];
            }



            System.out.println("sum of the 1+2+3+4+5+6+7+8+9+10: " + sum);
        }
    }

}












