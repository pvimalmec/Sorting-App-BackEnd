package org.sort.persistence.repository;

import org.sort.persistence.entity.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelJpaRepository extends JpaRepository<Sort, String> {

}
