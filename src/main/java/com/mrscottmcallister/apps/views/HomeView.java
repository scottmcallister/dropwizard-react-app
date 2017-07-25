package com.mrscottmcallister.apps.views;

import io.dropwizard.views.View;

/**
 * Created by scottmcallister on 2017-07-24.
 */
public class HomeView extends View {
    public HomeView() {
        super("home.mustache");
    }
}
