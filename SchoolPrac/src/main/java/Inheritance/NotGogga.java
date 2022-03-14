package Inheritance;

import it.Gogga;
import java.awt.Color;

public class NotGogga extends Gogga
{

    public void move(int num)
    {
        for (int i = 0; i < num; i++)
        {
            move();
        }
    }

    public void drawSquare(int x1, int y1, int x2, int y2)
    {

    }

    public NotGogga()
    {
        super();
        setColor(Color.tangerine);

    }
}
