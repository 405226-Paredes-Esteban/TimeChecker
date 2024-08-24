package com.scaffold.template.repositories;

import com.scaffold.template.entities.TimeCheckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeCheckRepository extends JpaRepository<TimeCheckEntity,Long> {

}
