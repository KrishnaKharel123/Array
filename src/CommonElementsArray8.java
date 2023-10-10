public class CommonElementsArray8
{

    public static void main(String[] args)
    {

        String[]arr1={"Apple","Mango","Pumkin","Sugarcane",}; //Variables
        String[]arr2={"Apple","Sugarcane","Kiwi","Orange"};

        System.out.println("The Common Elements are :");

        int i=0;
        while (i< arr1.length)    //CONDITION
        {

            int j=0;
            while (j < arr2.length)
            {
                if(arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]); //BASED ON CONDITION
                }
                j++;
            }
            i++;
        }







    }


}
