package program5;

import java.util.Random;
import java.util.Scanner;
class MergeSort {
 private int a[];
 public MergeSort(int[] a) {
 this.a = a;
 }
 void merge(int low, int mid, int high) {
 int b[] = new int[high + 1];
 int h = low;
 int i = low;
 int j = mid + 1;
 int k;
 while ((h <= mid) && (j <= high)) {
 if (a[h] <= a[j]) 
 b[i++] = a[h++];
 else
 b[i++] = a[j++];
 }
 if (h > mid) {
 for (k = j; k <= high; ++k) 
 b[i++] = a[k];
 } else {
 for (k = h; k <= mid; ++k) 
 b[i++] = a[k];
 }
 for (k = low; k <= high; ++k) 
 a[k] = b[k];
 }
 void mergeSort(int low, int high) {
 int mid;
 if (low < high) {
 mid = (low + high) / 2;
 mergeSort(low, mid);
 mergeSort(mid + 1, high);
 merge(low, mid, high);
 }
 }
}
