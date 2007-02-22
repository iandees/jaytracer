package com.yellowbkpk.jaytracer.render;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.vecmath.Vector3f;

import com.yellowbkpk.jaytracer.world.Camera;
import com.yellowbkpk.jaytracer.world.JayWorld;
import com.yellowbkpk.jaytracer.world.World;
import com.yellowbkpk.jaytracer.world.light.PointLight;
import com.yellowbkpk.jaytracer.world.shape.Cube;
import com.yellowbkpk.jaytracer.world.shape.Sphere;


public class JayTracer {

    private static final int WIDTH = 128;
    private static final int HEIGHT = 128;

    /**
     * @param args
     */
    public static void main(String[] args) {
        World world = new JayWorld();
        
        Vector3f sphereLoc = new Vector3f(0, 0, 0);
        float sphereRadius = 1.0f;
        world.add(new Sphere(sphereLoc, sphereRadius));
        
        Vector3f cubeLoc = new Vector3f(1, 0, 0);
        float cubeWidth = 1.0f;
        world.add(new Cube(cubeLoc, cubeWidth));
        
        Vector3f lightLoc = new Vector3f(0.5f, 0.5f, 0.5f);
        world.add(new PointLight(lightLoc, Color.blue, 1.0f));
        
        Vector3f camLoc = new Vector3f(0.1f, 0.1f, 0.2f);
        Vector3f camLookAt = new Vector3f(0f, 0f, 0f);
        world.add(new Camera(camLoc, camLookAt));
        
        Renderer render = new JayRenderer(world);
        BufferedImage img = render.render(WIDTH, HEIGHT);
        
        JFrame imageFrame = new JFrame("Rendered image");
        
        JLabel imageLabel = new JLabel(new ImageIcon(img));
        
        imageFrame.add(imageLabel);
        
        imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imageFrame.setSize(WIDTH, HEIGHT);
        imageFrame.setVisible(true);
    }

}
