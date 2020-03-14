package com.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.StockExchangeRepository;



import com.cts.pojos.StockExchange;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
@RequestMapping("/StockEx")

public class StockExchangeController {

	@Autowired

	private StockExchangeRepository stockexchangeRepository;

	@RequestMapping("/getStockEx")

	public Iterable<StockExchange> getStockEx() {

		return stockexchangeRepository.findAll();

	}

	@PostMapping("/saveStockEx")

	public StockExchange saveStockEx(@RequestBody StockExchange stockexchange) {

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}

	@PutMapping("/updateStockEx/{seid}")

	public StockExchange updateStockEx(@RequestBody StockExchange stockexchange,

			@PathVariable("seid") Integer seid) {

		stockexchange.setSeid(seid);

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}

	@DeleteMapping("/deleteStockEx/{seid}")

	public Boolean deleteStockEx(@PathVariable("seid") Integer seid) {

		System.out.println(seid);

		Optional<StockExchange> stockexchange = stockexchangeRepository.findById(seid);

		stockexchangeRepository.delete(stockexchange.get());

		return true;

	}

	@GetMapping("/findOneInAll4/{seid}")

	public StockExchange findOneInAll4(@PathVariable("seid") Integer seid)

	{

		Optional<StockExchange> stockexchange = stockexchangeRepository.findById(seid);

		return stockexchange.get();

	}

}