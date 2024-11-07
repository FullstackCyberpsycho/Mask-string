package org.example;

public class MaskString {
    private final String VOWELS = "aeiouAEIOU";

    public String vowelReplacement(String text) {
        StringBuilder replacement = new StringBuilder(text);
        /*for (int i = 0; i < text.length(); i++) {
            if (VOWELS.indexOf(text.charAt(i)) != -1) {
                stringBuilder.setCharAt(i, '*');
            }
        }*/

        text.chars().forEach(c -> {
            if(VOWELS.indexOf(c) != -1) {
                replacement.append('*');
            } else {
                replacement.append((char) c);
            }
        });

        return replacement.toString();
    }

    public static String vowelReplacement(int text) {
        return "Error!";
    }
}