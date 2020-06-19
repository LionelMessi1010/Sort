package com.godfrey.sort;

import java.util.LinkedList;
import java.util.List;

/**
 * description : 桶排序
 *
 * @author godfrey
 * @since 2020-06-19
 */
public class BucketSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    protected void sort() {
        //桶数组
        List<T>[] buckets = new List[array.length];
        for (int i = 0, bucketIndex = 0; i < array.length; i++) {
            List<T> bucket = buckets[bucketIndex];
            if (bucket == null) {
                bucket = new LinkedList<>();
                buckets[bucketIndex] = bucket;
            }
            bucket.add(array[i]);
        }

        //对每个桶进行排序
        int index = 0;
        for (List<T> bucket : buckets) {
            if (bucket == null) {
                continue;
            }
            bucket.sort(null);
            for (T d : bucket) {
                array[index++] = d;
            }
        }
    }
}
