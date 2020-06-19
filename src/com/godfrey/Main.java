package com.godfrey;

import com.godfrey.sort.*;
import com.godfrey.sort.cmp.*;
import com.godfrey.tools.Asserts;
import com.godfrey.tools.Integers;

import java.util.Arrays;

/**
 * description : 测试类
 *
 * @author godfrey
 * @since 2020-06-16
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class Main {
    public static void main(String[] args) {
        Integer[] array = Integers.random(20000, 1, 5000);
        testSorts(array,
                new BubbleSort1(),
                new BubbleSort2(),
                new BubbleSort3(),
                new SelectionSort(),
                new HeapSort(),
                new InsertionSort1(),
                new InsertionSort2(),
                new InsertionSort3(),
                new MergeSort(),
                new QuickSort(),
                new ShellSort(),
                new CountingSort1(),
                new CountingSort2(),
                new RadixSort1(),
                new RadixSort2(),
                new BucketSort());
    }

    static void testSorts(Integer[] array, Sort... sorts) {
        for (Sort sort : sorts) {
            Integer[] newArray = Integers.copy(array);
            sort.sort(newArray);
            Asserts.test(Integers.isAscOrder(newArray));
        }
        Arrays.sort(sorts);
        for (Sort sort : sorts) {
            System.out.println(sort);
        }
    }
}
