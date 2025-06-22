package org.example;

import java.util.Map;

public class WordsToNumConvertor {

    private static final Map<String ,Integer> baseNumber =
            Map.ofEntries(
                    Map.entry("zero",0),
                    Map.entry("one",1),
                    Map.entry("two",2),
                    Map.entry("three",3),
                    Map.entry("four",4),
                    Map.entry("five",5),
                    Map.entry("six",6),
                    Map.entry("seven",7),
                    Map.entry("eight",8),
                    Map.entry("nine",9),
                    Map.entry("ten",10),
                    Map.entry("eleven",11),
                    Map.entry("twelve",12),
                    Map.entry("thirteen",13),
                    Map.entry("fourteen",14),
                    Map.entry("fifteen",15),
                    Map.entry("sixteen",16),
                    Map.entry("seventeen",17),
                    Map.entry("eighteen",18),
                    Map.entry("nineteen",19),
                    Map.entry("twenty",20),
                    Map.entry("thirty",30),
                    Map.entry("forty",40),
                    Map.entry("fifty",50),
                    Map.entry("sixty",60),
                    Map.entry("seventy",70),
                    Map.entry("eighty",80),
                    Map.entry("ninety",90)
            );
    private static final Map<String,Integer> multifliers=
            Map.ofEntries(
                    Map.entry("hundred",100),
                    Map.entry("thousand",1000)
            );
    public int wordsToNumConvert(String input){
        input= input.toLowerCase().replaceAll("-"," ");
        String[] words=input.split("\\s+");
        Integer total=0;
        Integer current=0;
        for (String word:words){
            if(baseNumber.containsKey(word)){
                current +=baseNumber.get(word);
            }else if(multifliers.containsKey(word)){
                current *= multifliers.get(word);
                if(word.equals("thousand")){
                    total += current;
                    current=0;
                }
            }
        }
        return total+current;

    }
}
