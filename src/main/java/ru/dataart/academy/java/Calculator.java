package ru.dataart.academy.java;

import java.util.*;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        //Task implementation
        return getValue(firstNumber)+getValue(secondNumber);
    }
    private Integer getValue(List<Integer> array){
        Integer value=0;
        ListIterator<Integer> iterator = array.listIterator(array.size());
        while (iterator.hasPrevious()) {
            value=value*10+iterator.previous();
        }
        return  value;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        // Task implementation
        List<T> resultList =new ArrayList<>();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            resultList.add((T)iterator.next());
            if(iterator.hasNext()){
                iterator.next();
            }
        }
        return resultList;
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
        // Task implementation
        List<T> resultList =new ArrayList<>();
        Iterator iterator = list.listIterator();
        if (iterator.hasNext()){
            resultList.add((T)iterator.next());
            if (iterator.hasNext()){
                ListIterator iterator1 = list.listIterator(list.size());
                if (iterator1.hasPrevious()){
                    resultList.add((T)iterator1.previous());
                }
            }
        }


        return resultList;
    }
}
