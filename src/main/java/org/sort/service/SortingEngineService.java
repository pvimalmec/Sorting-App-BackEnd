package org.sort.service;

import org.sort.bo.SortBO;
import org.sort.sorting.SortBuilder;
import org.sort.sorting.Sorting;

public class SortingEngineService {

	private Sorting sort;

	/**
	 * Choose the sorting type to verify the performance between the sorting
	 * 
	 * @param type
	 */
	public SortBO executeSort(String type, SortBO sortbo) {

		sort = SortBuilder.getInstance(type);

		sortbo.setUnOrdereditems(listToString(sortbo.getUnorderedList()));

		Integer[] list = sort.executeSort(sortbo.getUnorderedList());

		sortbo.setOrderedlist(list);

		sortbo.setPositionchanged(sort.totalpositionchanges());

		return sortbo;
	}

	public String listToString(Integer[] numbers) {

		StringBuilder builder = new StringBuilder();

		for (Integer number : numbers) {
			builder.append(number + ", ");
		}

		String finOutput = builder.toString().trim();
		return finOutput.substring(0, finOutput.length() - 1);

	}

}
