package org.sort.sorting;

import org.sort.constants.CommonConstants;

/**
 * This class creates instances based on the sort type
 * 
 * @author Vimal
 *
 */
public class SortBuilder {

	public static Sorting getInstance(String type) {

		switch (type) {
		case CommonConstants.MERGE:
			return new MergeSorting();
		case CommonConstants.QUICK:
			return new QuickSorting();
		case CommonConstants.LINEAR:
			return new LinearSorting();
		}

		return null;
	}

}
