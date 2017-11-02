const path = require('path');
const webpack = require('webpack');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const CleanWebpackPlugin = require('clean-webpack-plugin');

module.exports = {
    entry: {
        main: './src/index.js',
        vendor: [
            './src/print.js'
        ]
    },

    devServer: {
        contentBase: './dist'
    },
    plugins: [
        new HtmlWebpackPlugin({
            title: 'Caching'
        }),
        new webpack.HashedModuleIdsPlugin(),
        new CleanWebpackPlugin(['dist']),
        new webpack.optimize.CommonsChunkPlugin({
            name: 'vendor'
        }),
        new webpack.optimize.CommonsChunkPlugin({
            name: 'runtime'
        })
    ],
    output: {
        // filename: 'bundle.js',
        filename: '[name].[chunkhash].js',
        path: path.resolve(__dirname, 'dist'),
    }
};