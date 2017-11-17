package org.sort.service;

import java.util.List;

import org.sort.bo.SortBO;
import org.sort.persistence.entity.Sort;
import org.sort.persistence.repository.ModelJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService {

	@Autowired
	private ModelJpaRepository modelJpaRepository;

	public List<Sort> retrieveHistory() {

		List<Sort> sorteditems = modelJpaRepository.findAll();

		return sorteditems;
	}

	public Sort saveHistory(SortBO sortbo) {

		Sort sort = maptoEntity(sortbo);

		modelJpaRepository.save(sort);

		return sort;

	}

	private Sort maptoEntity(SortBO sortbo) {

		Sort sort = new Sort();

		// sort.setId(System.currentTimeMillis());

		sort.setOrderednumbers(listToString(sortbo.getOrderedlist()));

		sort.setUnorderednumbers(sortbo.getUnOrdereditems());

		// sort.setType(type);

		sort.setPositions(sortbo.getPositionchanged());

		return sort;
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
