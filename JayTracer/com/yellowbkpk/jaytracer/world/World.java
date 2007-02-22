package com.yellowbkpk.jaytracer.world;
import java.util.ArrayList;
import java.util.Collection;

import com.yellowbkpk.jaytracer.world.light.Light;
import com.yellowbkpk.jaytracer.world.shape.Primitive;
import com.yellowbkpk.jaytracer.world.shape.PrimitiveTypeEnum;
import com.yellowbkpk.jaytracer.world.shape.Shape;


public class World {

    private Collection<Primitive> objects = new ArrayList<Primitive>();
    private Camera worldCamera = null;
    private Collection<Light> worldLights = new ArrayList<Light>();
    private Collection<Shape> worldShapes = new ArrayList<Shape>();

    public void add(Primitive shape) {
        
        if(PrimitiveTypeEnum.CAMERA.equals(shape.getType())) {
            worldCamera = (Camera) shape;
        } else if(PrimitiveTypeEnum.LIGHT.equals(shape.getType())) {
            worldLights.add((Light) shape);
        } else if(PrimitiveTypeEnum.SHAPE.equals(shape.getType())) {
            worldShapes.add((Shape) shape);
        }
        
        objects.add(shape);
    }

    public Camera getCamera() {
        return worldCamera;
    }
    
    public Collection<Light> getLights() {
        return worldLights;
    }
    
    public Collection<Shape> getShapes() {
        return worldShapes;
    }

}
