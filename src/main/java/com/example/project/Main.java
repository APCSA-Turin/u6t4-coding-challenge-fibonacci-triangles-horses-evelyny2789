package com.example.project;

public class Main{
    public static void main(String[] args) {
        TriangleCollection collection1 = new TriangleCollection(6,4,7);
        for(Triangle tri : collection1.getCollection()){
            System.out.println(tri.getVertices());
        }
    }
}