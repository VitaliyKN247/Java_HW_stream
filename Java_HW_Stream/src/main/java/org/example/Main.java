package org.example;

import java.util.*;
import java.util.stream.Stream;
//Напишите программу, которая использует Stream API для обработки списка чисел.
// Программа должна вывести на экран среднее значение всех четных чисел в списке.
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(6);
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        Stream stream = numbers.stream();

        Double average = numbers.stream().filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Среднее число четных чисел : " + average);
        
    }

}