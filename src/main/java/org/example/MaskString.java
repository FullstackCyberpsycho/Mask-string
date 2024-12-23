package org.example;

public class MaskString {
    private final String VOWELS = "aeiouAEIOU";

    public String vowelReplacement(String text) {
        StringBuilder replacement = new StringBuilder();

        if (text == null) {
            return "";
        } else {
            text.chars().forEach(c -> {
                if(VOWELS.indexOf(c) != -1) {
                    replacement.append('*');
                } else {
                    replacement.append((char) c);
                }
            });

            return replacement.toString();
        }
    }
}
