package org.sort.sorting;

import org.sort.util.SortUtils;

/**
 * This class sort the array using merge sort.
 * 
 * @author Vimal
 *
 */
public class MergeSorting implements Sorting {

	Integer source[];

	Integer swapcount = 0;

	Integer linearswapcount = 0;

	public Integer[] executeSort(Integer numbers[]) {

		source = numbers;

		splitNumbers(0, numbers.length);

		return source;

	}

	public Integer[] mergesort(int head, int tail) {

		for (int i = head; i < tail; i++) {

			for (int j = i; j < tail; j++) {

				if (i != j && (source[i] > source[j])) {
					swapcount = swapcount + 1;
					source = SortUtils.swapNumbers(source, i, j);
				} else {
					continue;
				}
			}
		}

		return source;

	}

	public void splitNumbers(int head, int tail) {

		int diff = tail - head;

		if (diff > 1) {
			int subtail = diff / 2;
			splitNumbers(head, (head + subtail) - 1);
			splitNumbers((head + subtail), tail);
		}

		if (head != tail) {
			mergesort(head, tail);
		}
		;

	}

	@Override
	public Integer totalpositionchanges() {
		return swapcount;
	}
}
