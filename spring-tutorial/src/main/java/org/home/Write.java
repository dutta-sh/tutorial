package org.home;

/**
 * Created by Shouvik on 5/7/2017.
 */
public class Write {

    private Writer writer;

    public Write(Writer writer) {
        this.writer = writer;
        writer.getMedium();
    }
}
