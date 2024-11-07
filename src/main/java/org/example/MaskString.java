package org.example;

public class MaskString {
    private final String VOWELS = "aeiouAEIOU";

    public String vowelReplacement(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);

        for (int i = 0; i < text.length(); i++) {
            if (VOWELS.indexOf(text.charAt(i)) != -1) {
                stringBuilder.setCharAt(i, '*');
            }
        }

        return stringBuilder.toString();
    }

    public static String vowelReplacement(int text) {
        return "Error!";
    }
}