package com.company;

import java.util.Arrays;
import java.util.Scanner;

    public class SearchWord {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String[] wordList = {"Pizza", "Burger", "Pav Bhaji", "Cholle Bhature", "Dosa"};
            Arrays.sort(wordList);

            System.out.println("List of words before sorting : ");
            System.out.println(Arrays.toString(wordList) + "\n");

            System.out.println("Enter the word you want to search : ");
            String searchName = sc.nextLine();

            int result = binarySearch(wordList, searchName);

            if (result == -1)
                System.out.println("Word is not in the list");
            else
                System.out.println("Word you are searching for, is found at " + result + " index of the word list");

            sc.close();
        }

        //binary search method
        public static int binarySearch(String[] wordList, String searchName) {
            int start = 0;
            int length = wordList.length - 1;

            //loop execute till
            while (start <= length) {

                int middle = start + (length - start) / 2;
                //compare search name and list elements
                int result = searchName.compareTo(wordList[middle]);

                if (result == 0) {
                    return middle;
                }

                if (result > 0) {
                    start = middle + 1;
                }

                else {
                    length = middle - 1;
                }
            }
            return -1;
        }
}
