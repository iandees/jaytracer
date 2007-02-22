package com.yellowbkpk.jaytracer.render;
import java.awt.image.BufferedImage;

import com.yellowbkpk.jaytracer.world.World;


public abstract class Renderer {

    protected World world;

    public Renderer(World theWorld) {
        world = theWorld;
    }

    public abstract BufferedImage render(int x, int y);

}
