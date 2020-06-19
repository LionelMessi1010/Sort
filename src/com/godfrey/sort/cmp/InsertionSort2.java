package com.godfrey.sort.cmp;

import com.godfrey.sort.Sort;

/**
 * description : 插入排序--优化1，交换 -> 挪动
 *
 * @author godfrey
 * @since 2020-06-17
 */
public class InsertionSort2<T extends Comparable<T>> extends Sort<T> {
    @Override
    protected void sort() {
        for (int begin = 1; begin < array.length; begin++) {
            int cur = begin;
            T v = array[begin]; // 将待插入元素备份
            while (cur > 0 && cmp(v, array[cur - 1]) < 0) {
                // 头部有序数据中比待插入元素大的，都朝尾部方向挪动1个位置
                array[cur] = array[cur - 1];
                cur--;
            }
            array[cur] = v; // 将待插入元素放到最终的合适位置
        }
    }
}
