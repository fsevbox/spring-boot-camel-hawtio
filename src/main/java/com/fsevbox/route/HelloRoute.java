package com.fsevbox.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:message")
                .routeId("message")
                .to("direct:greetings");

        from("direct:greetings")
                .routeId("greetings")
                .to("log:greetings");
    }
}
