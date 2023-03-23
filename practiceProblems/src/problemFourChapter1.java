public class problemFourChapter1 {
    public static void main(String[] args) {

        int x = 0;
        for(int y =1; y<=12;y++)
        {
            while(x<=y)
            {
                if(x%2 == 0)
                {
                    x+=2;
                }
                else
                {
                    y-=2;
                }

            }
        }
        System.out.println(x);
    }
}