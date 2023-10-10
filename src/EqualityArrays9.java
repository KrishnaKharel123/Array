public class EqualityArrays9
{

    public static void main(String[] args)
    {
        int[] array1 = {3, 9, 12, 15};   //COMPARING BOTH ARRAYS
        int[] array2 = {3, 9, 12, 16};

     boolean equalOrnot = true;
     int i =0;

     while (i<array1.length) {
         if (array1[i] != array2[i]) {
             equalOrnot = false;
             break;
         }
         i++;
     }
         if (equalOrnot)
             System.out.println("Two Arrays Are Equal");
         else

             System.out.println("Two Arrays Are not Equal");
    }
}
