package com.godfrey.sort;

/**
 * description : 基数排序-另一个思路，借助桶
 *
 * @author godfrey
 * @since 2020-06-19
 */
public class RadixSort2 extends Sort<Integer> {

    @Override
    protected void sort() {
        // 找出最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        //捅数组
        int[][] buckets = new int[10][array.length];
        //每个桶的元素数量
        int[] bucketSizes = new int[buckets.length];
        for (int divider = 1; divider <= max; divider *= 10) {
            for (Integer integer : array) {
                int no = integer / divider % 10;
                buckets[no][bucketSizes[no]++] = integer;
            }
            int index = 0;
            for (int i = 0; i < buckets.length; i++) {
                for (int j = 0; j < bucketSizes[i]; j++) {
                    array[index++] = buckets[i][j];
                }
                bucketSizes[i] = 0;
            }
        }
    }
}
