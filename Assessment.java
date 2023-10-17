package com.sample.training.corejava;

public class Assessment {
    public static void main(String[] args) {
        String str = "Hello world & good morning. The date is 18/05/2016";
        String words[] = str.split(" ");
        System.out.println("word count = " + words.length);
        int totalLength = 0;
        int smallestWordLength = words[0].length(), largestWordLength = 0;
        for (int i = 0; i < words.length; i++) {
            totalLength = totalLength + words[i].length();
            largestWordLength = words[i].length();

            if (largestWordLength < smallestWordLength) {
                largestWordLength = smallestWordLength;
                smallestWordLength = words[i].length();
            }
        }

        System.out.println("Average word length = " + ((float) totalLength / words.length));
        int highestWordCountLength = 0;
        for (int i = smallestWordLength; i <= largestWordLength; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() == i) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Number of words of length " + i + " is " + count);
            }
            if (count > highestWordCountLength) {
                highestWordCountLength = count;
            }
        }

        System.out.print("The most frequently occurring word length is "+highestWordCountLength+" , for words length of");

        for (int i=0;i<words.length;i++){
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() == i) {
                    count++;
                }
            }
            if (count == highestWordCountLength){
                System.out.print(" "+i);
            }

        }
    }
}
