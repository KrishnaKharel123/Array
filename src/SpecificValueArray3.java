import java.util.Scanner;

public class SpecificValueArray3
{
    public static void main(String[] args)
    {




        char[] specific = {'A', 'B', 'C', 'D', 'E'}; //VARIABLES
        char desiredValue ='A';

        boolean a =false;
        for (int i: specific)        //CONDITION
            if (i == desiredValue) {
                a = true;

                break;
            }
        if (a)
            System.out.println("There is 'a' present ");
        else
            System.out.println("There is no 'a' present ");



    }











}
