package com.yellowbkpk.jaytracer.render;
import java.awt.image.BufferedImage;

import javax.vecmath.Vector3f;

import com.yellowbkpk.jaytracer.world.Camera;
import com.yellowbkpk.jaytracer.world.World;
import com.yellowbkpk.jaytracer.world.shape.Plane;


public class JayRenderer extends Renderer {

    private float dX = 0.0f;
    private float dY = 0.0f;

    public JayRenderer(World world) {
        super(world);
    }

    public BufferedImage render(int width, int height) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        
        Camera cam = world.getCamera();
        Plane viewPlane = world.getViewPlane();
        
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Ray viewRay = computeViewRay(x, y, width, height, cam.getLocation(), cam.getLookAt());
                System.err.println(viewRay);
            }
        }
        
        return image;
    }

    private Ray computeViewRay(int x, int y, int width, int height, Vector3f camLoc, Vector3f camLookAt) {
        // The through-point for the view ray starts at the center of the virtual screen that we are looking through
        Vector3f viewPt = new Vector3f(camLookAt);
        
        // We compute the dx and dy per pixel
        if(dX == 0.0f) {
            dX = width / x;
        }
        
        if(dY == 0.0f) {
            dY = height / y;
        }
        
        // "Translate" over to the x and y from the center
        float viewX = dX * x;
        float viewY = dY * y;
        viewPt.x += viewX;
        viewPt.y += viewY;
        
        return new Ray(camLoc, viewPt);
    }

}
