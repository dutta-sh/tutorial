package org.home;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Shouvik on 5/7/2017.
 */
@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class Hello {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}