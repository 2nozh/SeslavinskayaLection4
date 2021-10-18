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
    //function reverses and writes together all array numbers
    private Integer getValue(List<Integer> array){
        Integer value=0;
        //iterator with lists' size as initial position
        ListIterator<Integer> iterator = array.listIterator(array.size());
        //going through array backwards
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
        //going through lists' elements
        while (iterator.hasNext()){
            resultList.add((T)iterator.next());
            //construction, which allows skipping (without wrighting in result set) element after one written above
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
        //iterator with default start position
        Iterator startIterator = list.iterator();
        //if list is no empty, writing first element
        if (startIterator.hasNext()){
            resultList.add((T)startIterator.next());
            //if list contains more than one element
            if (startIterator.hasNext()){
                //iterator with initial position at the end of list
                ListIterator endIterator = list.listIterator(list.size());
                //writing last element
                resultList.add((T)endIterator.previous());
            }
        }
        return resultList;
    }
}
