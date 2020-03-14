package com.cts.dao;
import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.Company;


public interface CompanyRepository extends CrudRepository<Company, String> {

	
Iterable<Company> findAll();
}