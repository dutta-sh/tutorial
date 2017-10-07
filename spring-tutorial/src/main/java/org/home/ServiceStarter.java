package org.home;

import javax.xml.ws.Endpoint;

/**
 * Created by Shouvik on 5/7/2017.
 */
public class ServiceStarter {

    public static void main(String[] args) {
        String url = "http://localhost:1212/hello";
        Endpoint.publish(url, new Hello());
        System.out.println("Service started @ " + url);
    }
}
