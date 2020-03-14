package com.cts.dao;
import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.*;
public interface StockExchangeRepository extends CrudRepository<StockExchange,Integer> {
Iterable<StockExchange> findAll();
}
