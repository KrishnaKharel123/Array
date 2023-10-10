public class DupicateValuesArray7
{
    public static void main(String[] args)
    {

   int[] value={10,20,20,30,40,40,50,60,70}; //VARIABLES


   for(int i=0; i< value.length-1;i++)
   {
       for (int j= i+1; j< value.length; j++)
       {
           if(( value[i]==value[j] ) && (i!=j))
           {
               System.out.println(value[j]);
           }
       }
   }



    }





}
