var path = require('path');
var webpack = require('webpack');

module.exports = {
    entry: "./src/main/js/index.js",
    output: {
        path: __dirname + '/src/main/resources/assets/dist',
        filename: "bundle.js"
    },
    module: {
        loaders: [
            {
                test: /.jsx?$/,
                loader: 'babel-loader',
                exclude: /node_modules/,
                query: {
                    presets: ['es2015', 'react']
                }
            }
        ]
    }
};