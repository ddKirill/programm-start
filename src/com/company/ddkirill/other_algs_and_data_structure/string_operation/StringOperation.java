package com.company.ddkirill.other_algs_and_data_structure.string_operation;


public class StringOperation {

    public static void main(String[] args) {
        String string = "lkenvqqb";


        String result = StringOperation.getEndAndFirstElement(string);
        System.out.println(result);
    }

    public static String getEndAndFirstElement(String string) {

        char[] charArray = string.toCharArray();
        char firstChar = charArray[0];
        int endIndex = string.length() - 1;
        char endChar = charArray[endIndex];

        String firstElement = String.valueOf(firstChar);
        String endElement = String.valueOf(endChar);

        String result = endElement.concat(firstElement);

        return result;
    }

}
