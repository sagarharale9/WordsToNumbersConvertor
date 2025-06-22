package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started Main");
        wordsToNumConvertor("three thousand twenty four rupees");
        System.out.println("End Main");

    }

    public static void wordsToNumConvertor(String input){
        System.out.println("Main :: wordsToNumConvertor");
        WordsToNumConvertor convertor = new WordsToNumConvertor();
        int result = convertor.wordsToNumConvert(input);
        System.out.println("Input: "+input+ " \nOutput: "+result);

    }


}

