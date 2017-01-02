package org.home;

/**
 * Created by Shouvik on 1/2/2017.
 */
public class MainClass {
    private static Integer hit = 0;

    public static void main(String[] args) {
        hit++;
        System.out.println("Hello " + hit);
    }

    public String testEndPoint(String name) {
        hit++;
        return "Hello " + name + " : " + hit;
    }
}
