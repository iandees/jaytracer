package com.yellowbkpk.jaytracer.world.shape;
import javax.vecmath.Vector3f;


public abstract class Primitive {

    private Vector3f location;
    private float width;

    public Primitive(Vector3f loc, float size) {
        location = loc;
        width = size;
    }
    
    public Vector3f getLocation() {
        return location;
    }

    public abstract PrimitiveTypeEnum getType();

}
