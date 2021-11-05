package program4;

import java.util.Random;
import java.util.Scanner;
class QuickSort {
 private int a[];
 public QuickSort(int[] a) {
 this.a = a;
 }
 public int partition(int a[], int m, int p) {
 int v = a[m];
 int i = m;
 int j = p;
 do {
 while (a[++i] < v);
 while (a[--j] > v);
 if (i < j)
 interchange(a, i, j);
 } while (i <= j);
 a[m] = a[j];
 a[j] = v;
 return j;
 }
 public void qSort(int p, int q) {
 int j;
 if (p < q) {
 j = partition(a, p, q + 1);
 qSort(p, j - 1);
 qSort(j + 1, q);
 }
 }
 public void interchange(int a[], int i, int j) {
 int t;
 t = a[i];
 a[i] = a[j];
 a[j] = t;
 }
}
