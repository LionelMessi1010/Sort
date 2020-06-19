package com.godfrey.sort.cmp;

import com.godfrey.sort.Sort;

/**
 * description : 插入排序-无优化
 *
 * @author godfrey
 * @since 2020-06-17
 */
public class InsertionSort1<T extends Comparable<T>> extends Sort<T> {
    @Override
    protected void sort() {
        for (int begin = 1; begin < array.length; begin++) {
            int cur = begin;
            while (cur > 0 && cmp(cur, cur - 1) < 0) {
                swap(cur, cur - 1);
                cur--;
            }
        }
    }
}
