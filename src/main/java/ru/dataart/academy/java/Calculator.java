package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();

        for(int i = firstNumber.size() - 1; i > 0; i--) {
            first.append(firstNumber.get(i));
        }

        for(int i = secondNumber.size() - 1; i > 0; i--) {
            second.append(secondNumber.get(i));
        }

        int firstNum = Integer.parseInt(first.toString());
        int secondNum = Integer.parseInt(second.toString());

        return firstNum + secondNum;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> arr = new ArrayList<>(list.size() / 2 + 1);

        for(int i = 0; i < list.size(); i++) {
            if(i % 2 != 0){
                arr.add(list.get(i));
            }
        }

        return arr;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {

        List<T> arr = new ArrayList<>();
        int size = list.size();

        if(size >= 2) {
            arr.add(list.get(0));
            arr.add(list.get(size - 1));
        }else if(size == 1) {
            arr.add(list.get(0));
        }

        return arr;
    }
}
