package com.kodilla.stream.beautifier;

import com.kodilla.stream.lambda.Executor;

public class PoemBeautifier {
    public void beautify (String stringToDecorate, PoemDecorator poemDecorator) {
         System.out.println(poemDecorator.decorate(stringToDecorate));
    }
}
