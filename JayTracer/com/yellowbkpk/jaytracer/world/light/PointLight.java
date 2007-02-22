package com.yellowbkpk.jaytracer.world.light;
import java.awt.Color;

import javax.vecmath.Vector3f;

import com.yellowbkpk.jaytracer.world.shape.PrimitiveTypeEnum;


public class PointLight extends Light {

    public PointLight(Vector3f lightLoc, Color color, float brightness) {
        super(lightLoc, 0.0f, brightness);
    }

    public PrimitiveTypeEnum getType() {
        return PrimitiveTypeEnum.LIGHT;
    }

}
