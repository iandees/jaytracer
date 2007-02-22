package com.yellowbkpk.jaytracer.world.shape;
import javax.vecmath.Vector3f;


public class Plane extends Primitive {

    public Plane(Vector3f loc, float size) {
        super(loc, size);
    }

    public PrimitiveTypeEnum getType() {
        return PrimitiveTypeEnum.SHAPE;
    }

}
