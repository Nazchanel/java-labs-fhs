//Name:
//Period:
import java.util.*;
import java.awt.*; //for graphics stuff

public class RandomGraphics
{
    public static void main(String[] args)
    {
        Random rng = new Random();

        int width  = 800;
        int height = 600;

        //set size / scale of drawing window
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        //Draw Grid
        StdDraw.line(width / 2, 0, width / 2, height);
        StdDraw.line(0, height / 2, width, height / 2);

        //Draws 100 random points in bottom-left quadrant
        for (int i = 1; i <= 100; i++)
        {
            //set to random color
            StdDraw.setPenColor(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));

            //generate a random <x, y> pair for a point
            int x = rng.nextInt(width / 2);
            int y = rng.nextInt(height / 2);

            StdDraw.setPenRadius(0.006); //set point to be drawn 3 pixels in size, only for points
            StdDraw.point(x, y);
        }

        //Draw 100 random lines in top-left quadrant


        //Draw 100 random squares in bottom-right quadrant


        //Draw 100 random circles in top-right quadrant

    }
}
