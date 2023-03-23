public class Main {
    public static void main(String[] args) {
        int[][] twoDArray = new int[5][5];

        int g = 0;
        for (int[] i: twoDArray)
        {

            for (int x = 0; x < i.length; x++)
            {
                twoDArray[g][x] = 1;

            }
            g++;
        }

        for (int[] i: twoDArray)
        {

            for (int j : i)
            {
                System.out.print(j + " ");

            }
            g++;
        }
    }

}