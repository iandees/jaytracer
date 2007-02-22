package com.yellowbkpk.jaytracer.world;
import javax.vecmath.Vector3f;

import com.yellowbkpk.jaytracer.world.shape.Plane;
import com.yellowbkpk.jaytracer.world.shape.Primitive;
import com.yellowbkpk.jaytracer.world.shape.PrimitiveTypeEnum;


public class Camera extends Primitive {

    private Vector3f lookAt;
    private Plane viewPane;
    

    private Camera(Vector3f loc) {
        super(loc, 0.0f);
    }

    public Camera(Vector3f camLoc, Vector3f camLookAt) {
        this(camLoc);
        lookAt = camLookAt;
        viewPane = new Plane(camLookAt, 1.0f);
    }

    public PrimitiveTypeEnum getType() {
        return PrimitiveTypeEnum.CAMERA;
    }

    public Vector3f getLookAt() {
        return lookAt;
    }

    public Plane getViewPlane() {
        return viewPane;
    }

}
