package com.cts.dao;
import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.*;
public interface SectorRepository extends CrudRepository<Sector,Integer> {
Iterable<Sector> findAll();
}
