public class GivenElement11
{
    public static void main(String[] args)
    {
        int[]numbers ={1,2,3,4,5,6};
        int target =7;

        boolean isPresent =false;

        for (int i:numbers)
        {
            if(i==target)
            {
                isPresent=true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("The element " + target + " is present");
        }
        else{
            System.out.println("The element " + target + " is not present");
        }

    }

}
