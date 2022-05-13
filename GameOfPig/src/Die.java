import java.util.*;
public class Die {
    Random random = new Random();
    private int numFaces;

    public Die()
    {
        numFaces = 6;
    }
    public Die(int faces)
    {
        numFaces = faces;
    }

    public int roll()
    {
        return random.nextInt(numFaces)+1;

    }

}
