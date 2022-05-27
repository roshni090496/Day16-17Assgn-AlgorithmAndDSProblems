package com.company;

public class BinarySearch {
    public <T extends Comparable<T>> Integer binarySearch(String[] array, String data) {
        Integer first = 0;
        Integer last = array.length;

        Integer mid = (first + last) / 2;

        if (data.compareTo(array[mid]) == 0) {
            return mid;
        } else if (data.compareTo(array[mid]) > 0) {
            first = mid + 1;
            return binarySearch(array, data);
        } else if (data.compareTo(array[mid]) < 0) {
            last = mid - 1;
            return binarySearch(array, data);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        BinarySearch binary = new BinarySearch();
        String[] array = {"hii","bye","good","bad","my"};
        Integer result = binary.binarySearch(array,"good");
        if(result == -1) {
            System.out.println("Element Found Is Not Found");
        }else {
            System.out.println("Element Found At Position "+result);
        }
    }
} 