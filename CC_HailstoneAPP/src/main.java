public class main {


    public static void main(String[] args) {

         int num = 0;
         int sum = 0;
         while (num < 500)
         {
             if (num % 3 == 0 || num % 5 == 0)
             {
                 sum+=num;
             }
             num++;

         }
         System.out.println(sum);



    }
}
