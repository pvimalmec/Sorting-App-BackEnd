package org.sort.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SORT")
public class Sort {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "ORDERED_NUMBERS")
	private String orderednumbers;

	@Column(name = "UNORDERED_NUMBERS")
	private String unorderednumbers;

	@Column(name = "TYPE")
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderednumbers() {
		return orderednumbers;
	}

	public void setOrderednumbers(String orderednumbers) {
		this.orderednumbers = orderednumbers;
	}

	public String getUnorderednumbers() {
		return unorderednumbers;
	}

	public void setUnorderednumbers(String unorderednumbers) {
		this.unorderednumbers = unorderednumbers;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPositions() {
		return positions;
	}

	public void setPositions(Integer positions) {
		this.positions = positions;
	}

	@Column(name = "position")
	private Integer positions;

}
