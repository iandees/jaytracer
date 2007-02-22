package com.yellowbkpk.jaytracer.render;
import javax.vecmath.Vector3f;


public class Ray {

    private Vector3f throughPoint;
    private Vector3f startPoint;

    public Ray(Vector3f start, Vector3f through) {
        startPoint = start;
        throughPoint = through;
    }

    public String toString() {
        return "Ray [" + startPoint + "] through [" + throughPoint + "]";
    }
    
}
