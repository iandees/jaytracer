package com.yellowbkpk.jaytracer.world.shape;
import javax.vecmath.Vector3f;


public abstract class Shape extends Primitive {

    public Shape(Vector3f loc, float size) {
        super(loc, size);
    }

    public PrimitiveTypeEnum getType() {
        return PrimitiveTypeEnum.SHAPE;
    }

}
