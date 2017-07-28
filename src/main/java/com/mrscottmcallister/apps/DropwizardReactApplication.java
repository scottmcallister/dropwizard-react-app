package com.mrscottmcallister.apps;

import com.mrscottmcallister.apps.health.AppHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
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
        bootstrap.addBundle(new AssetsBundle("/assets", "/", "index.html"));
    }

    @Override
    public void run(final DropwizardReactConfiguration configuration,
                    final Environment environment) {
        final AppHealthCheck healthCheck = new AppHealthCheck();
        environment.healthChecks().register("app", healthCheck);
        environment.jersey().setUrlPattern("/api/*");
    }

}
