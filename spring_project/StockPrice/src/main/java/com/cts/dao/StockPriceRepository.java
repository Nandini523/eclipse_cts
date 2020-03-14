package com.cts.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.*;
public interface StockPriceRepository extends CrudRepository<StockPrice,String> {
Iterable<StockPrice> findAll();

List<StockPrice> findByCompanyname(String companyname);
}
