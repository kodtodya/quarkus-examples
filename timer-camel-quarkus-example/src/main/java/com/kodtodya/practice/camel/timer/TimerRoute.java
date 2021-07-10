package com.kodtodya.practice.camel.timer;

import org.apache.camel.builder.RouteBuilder;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TimerRoute extends RouteBuilder {

    @ConfigProperty(name = "timer.period", defaultValue = "10s")
    String period;

    @Override
    public void configure() throws Exception {

        errorHandler(deadLetterChannel("log:error"));

        fromF("timer:foo?period=%s&repeatCount=%s", period, 10)
            .setBody(constant("Incremented the counter: " + System.currentTimeMillis()))
            .to("log:timer-logger?showExchangePattern=false&showBodyType=false");
    }

}