package com.example.definitivo.cicd.components;

import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {

    // the port where the application is running
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public void onApplicationEvent(final ServletWebServerInitializedEvent event) {
        this.port = event.getWebServer().getPort();

        System.out.println("************************************");
        System.out.printf("The web server is running on port %d\n", port);
        System.out.println("************************************");
    }
}
