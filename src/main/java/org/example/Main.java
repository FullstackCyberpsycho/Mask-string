package org.example;

import java.util.concurrent.CompletionException;

public class Main {
    public static void main(String[] args) {
        MaskString maskString = new MaskString();

        System.out.println(maskString.vowelReplacement("Hello, world!"));
    }
}