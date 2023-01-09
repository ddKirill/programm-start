package com.company.ddkirill.code_wars.lvl8;

public class BreakCamelCase {

    public static String camelCase(String input) {
        String result = new String();
        String lowerCase = input.toLowerCase();

        if(input.equals(lowerCase)) {
            System.out.println(input);
            return input;
        } else {
            String[] words = input.split("(?=\\p{Lu})");

            return String.join(" ", words);
        }
    }
}
