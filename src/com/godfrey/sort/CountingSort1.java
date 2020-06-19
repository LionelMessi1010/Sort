package com.godfrey.sort;

/**
 * description : 计数排序-无优化，针对整数，不稳定
 *
 * @author godfrey
 * @since 2020-06-16
 */
public class CountingSort1 extends Sort<Integer> {

    @Override
    protected void sort() {
        // 找出最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // 开辟内存空间
        int[] counts = new int[max + 1];
        // 统计每个整数出现的次数
        for (Integer integer : array) {
            counts[integer]++;
        }

        // 根据整数出现的次数，对整数进行排序
        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i]-- > 0) {
                array[index++] = i;
            }
        }
    }
}