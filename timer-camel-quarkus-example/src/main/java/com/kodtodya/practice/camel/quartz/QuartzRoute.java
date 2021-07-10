package com.kodtodya.practice.camel.quartz;

import org.apache.camel.builder.RouteBuilder;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class QuartzRoute extends RouteBuilder {

    // Every 1 minutes starting at minute :00, at 00am, of every day
    @ConfigProperty(name = "quartz.cron", defaultValue = "0+0/1+*+*+*+?")
    String cron;

    @Override
    public void configure() throws Exception {

        errorHandler(deadLetterChannel("log:error"));

        fromF("quartz:my-quartz?cron=%s", cron)
                .setBody(simple("Quartz runner -> current time is : ${date:now:yyyy-MM-dd'T'HH:mm:ss.SSS}"))
                .to("log:quartz-logger?showExchangePattern=false&showBodyType=false");
    }
}
