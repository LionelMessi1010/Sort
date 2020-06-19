package com.godfrey.sort.cmp;

import com.godfrey.sort.Sort;

/**
 * description : 冒泡排序-无优化
 *
 * @author godfrey
 * @since 2020-06-16
 */
public class BubbleSort1<T extends Comparable<T>> extends Sort<T> {
    @Override
    protected void sort() {
        for (int end = array.length - 1; end > 0; end--) {
            for (int begin = 0; begin < end; begin++) {
                if (cmp(begin, begin + 1) > 0) {
                    swap(begin, begin + 1);
                }
            }
        }
    }
}
