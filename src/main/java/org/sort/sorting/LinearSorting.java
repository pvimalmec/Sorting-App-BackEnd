package org.sort.sorting;

import org.sort.util.SortUtils;

public class LinearSorting implements Sorting {

	Integer swapnumbers = 0;

	@Override
	public Integer[] executeSort(Integer[] numbs) {

		for (int i = 0; i < numbs.length; i++) {

			for (int j = 0; j < numbs.length; j++) {

				if (numbs[i] < numbs[j]) {
					swapnumbers = swapnumbers + 1;
					numbs = SortUtils.swapNumbers(numbs, i, j);
				} else {
					continue;
				}
			}
		}

		return numbs;
	}

	@Override
	public Integer totalpositionchanges() {
		return swapnumbers;
	}

}
