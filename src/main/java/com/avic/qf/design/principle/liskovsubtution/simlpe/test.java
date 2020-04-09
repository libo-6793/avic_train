package com.avic.qf.design.principle.liskovsubtution.simlpe;

/**
 * Created by LB on 2020/4/6
 */
public class test {

    public static void reSize(Rectangle rectangle){
        while(rectangle.getWidth()>= rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight()+1);
            System.out.println("width:"+rectangle.getWidth()+",height="+rectangle.getHeight());
        }
        System.out.println("resize end , width:"+rectangle.getWidth()+",height="+rectangle.getHeight());
    }
    /*public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        reSize(rectangle);
    }*/
    public static void main(String[] args) {
        Square square = new Square();
        square.setLength(20);
        reSize(square);
    }
}
