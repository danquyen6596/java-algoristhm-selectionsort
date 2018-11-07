package vn.codegym.QuyenLeSy;

import static vn.codegym.QuyenLeSy.SelectionSort.selectionSort;
import static vn.codegym.QuyenLeSy.SelectionSort.list;

public class Main {
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
