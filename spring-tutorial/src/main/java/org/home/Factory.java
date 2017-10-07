package org.home;

/**
 * Created by Shouvik on 5/7/2017.
 */
public class Factory {

    public static int age = 10;

    public Writer getWriter() {
        if(age > 12)
            return new Pen();
        else
            return new Pencil();
    }

    public static Writer getStaticWriter() {
        if(age*2 > 12)
            return new Pen();
        else
            return new Pencil();
    }
}