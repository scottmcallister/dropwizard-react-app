package com.mrscottmcallister.apps.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by scottmcallister on 2017-07-24.
 */
public class AppHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
