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

import com.cts.dao.SectorRepository;



import com.cts.pojos.Sector;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*")
@RequestMapping("/Sector")

public class SectorController {

	@Autowired

	private SectorRepository sectorRepository;

	@RequestMapping("/getSectors")

	public Iterable<Sector> getSectors() {

		return sectorRepository.findAll();

	}

	@PostMapping("/saveSectors")

	public Sector saveSectors(@RequestBody Sector sector) {

		System.out.println(sector);

		sectorRepository.save(sector);

		return sector;

	}

	@PutMapping("/updateSector/{sid}")

	public Sector updateSector(@RequestBody Sector sector, @PathVariable("sid") Integer sid) {

		sector.setSid(sid);

		System.out.println(sector);

		sectorRepository.save(sector);

		return sector;

	}

	@DeleteMapping("/deleteSector/{sid}")

	public Boolean deleteSector(@PathVariable("sid") Integer sid) {

		System.out.println(sid);

		Optional<Sector> sector = sectorRepository.findById(sid);

		sectorRepository.delete(sector.get());

		return true;

	}

	@GetMapping("/findOneInAll3/{sid}")

	public Sector findOneInAll3(@PathVariable("sid") Integer sid)

	{

		Optional<Sector> sector = sectorRepository.findById(sid);

		return sector.get();

	}

}