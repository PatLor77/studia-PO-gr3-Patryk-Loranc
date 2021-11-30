package com.company;

import java.awt.*;

public class BetterRectangle extends Rectangle {
//    public BetterRectangle(int x, int y, int height, int width){
//        setLocation(x,y);
//        setSize(width, height);
//
//    }

    public BetterRectangle(int x, int y, int height, int width){
        super(x, y, width, height);
    }





    public int getPerimeter(){
        return 2*width+2*height;

    }

    public int getArea(){
        return width*height;
    }


}
