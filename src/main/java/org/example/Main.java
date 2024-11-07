package org.example;

import java.util.concurrent.CompletionException;

import static org.example.MaskString.vowelReplacement;

public class Main {
    public static void main(String[] args) {
        MaskString maskString = new MaskString();
        System.out.println(maskString.vowelReplacement("Hello, world!"));
        //System.out.println(maskString.vowelReplacement("Programming is fun!"));
        //System.out.println(maskString.vowelReplacement("I love AI!"));
    }
}