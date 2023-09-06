package org.example.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class DemoServer {
    @WebMethod
    public String sayHello(String name) {
        return "hello " + name;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8088/ws/test", new DemoServer());
    }
}
