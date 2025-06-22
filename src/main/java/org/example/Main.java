package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String input ="three thousand twenty three rupees";
        WordsToNumConvertor convertor = new WordsToNumConvertor();
        int result = convertor.wordsToNumConvert(input);
        System.out.println(result);

    }


}

