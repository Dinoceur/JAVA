package com.austin.dojosandninjas.repo;

import java.util.List;

import com.austin.dojosandninjas.models.Dojo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
