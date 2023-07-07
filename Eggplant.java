package com.example.graphicsanddrawing;

import java.awt.Graphics;

public class Eggplant {
    int x, y, w, h;

    public Eggplant(int xx, int yy, int ww, int hh)
    {
        x = xx;
        y = yy;
        w =ww;
        h = hh;
    }

    public void draw(Graphics g)
    {
        g.fillOval(x, y, w, h);
    }
}
