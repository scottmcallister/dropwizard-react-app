package com.mrscottmcallister.apps;

import com.mrscottmcallister.apps.resources.HomeResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class DropwizardReactApplication extends Application<DropwizardReactConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardReactApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardReact";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardReactConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<DropwizardReactConfiguration>());
    }

    @Override
    public void run(final DropwizardReactConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new HomeResource());
    }

}
