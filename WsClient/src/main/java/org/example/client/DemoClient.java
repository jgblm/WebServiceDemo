package org.example.client;

import org.example.server.DemoServer;
import org.example.server.DemoServerService;


public class DemoClient {
    public static void main(String[] args) {
        DemoServer demo = new DemoServerService().getDemoServerPort();
        String result = demo.sayHello("jack");
        System.out.println(result);
    }
}
