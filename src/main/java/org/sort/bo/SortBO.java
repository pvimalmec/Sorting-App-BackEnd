package org.sort.bo;

public class SortBO {

	Integer[] unorderedList = {};

	public Integer[] getOrderedlist() {
		return orderedlist;
	}

	String unOrdereditems = "";

	public String getUnOrdereditems() {
		return unOrdereditems;
	}

	public void setUnOrdereditems(String unOrdereditems) {
		this.unOrdereditems = unOrdereditems;
	}

	public void setOrderedlist(Integer[] orderedlist) {
		this.orderedlist = orderedlist;
	}

	Integer positionchanged = 0;

	public Integer getPositionchanged() {
		return positionchanged;
	}

	public void setPositionchanged(Integer positionchanged) {
		this.positionchanged = positionchanged;
	}

	Integer[] orderedlist = {};

	public Integer[] getUnorderedList() {
		return unorderedList;
	}

	public void setUnorderedList(Integer[] unorderedList) {
		this.unorderedList = unorderedList;
	}

}
