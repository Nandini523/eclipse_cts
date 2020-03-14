package com.cts.pojos;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Transient;

@Entity

@Table(name = "company")

public class Company {
	@Id
	
	private String companyname;

	private String ceo;

	private String boardofdirectors;

	private String sector;

	private String briefwriteup;

	private int turnover;

	private int listedinstock;

	private String stockcode;
	@Transient
	List<StockPrice> StockPriceList;
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", ceo=" + ceo + ", boardofdirectors=" + boardofdirectors
				+ ", sector=" + sector + ", briefwriteup=" + briefwriteup + ", turnover=" + turnover
				+ ", listedinstock=" + listedinstock + ", stockcode=" + stockcode + "]";
	}

	public List<StockPrice> getStockPriceList() {
		return StockPriceList;
	}

	public void setStockPriceList(List<StockPrice> stockPriceList) {
		StockPriceList = stockPriceList;
	}

	
	public String getCompanyname() {

		return companyname;

	}

	public void setCompanyname(String companyname) {

		this.companyname = companyname;

	}

	public String getCeo() {

		return ceo;

	}

	public void setCeo(String ceo) {

		this.ceo = ceo;

	}

	public String getBoardofdirectors() {

		return boardofdirectors;

	}

	public void setBoardofdirectors(String boardofdirectors) {

		this.boardofdirectors = boardofdirectors;

	}

	public String getSector() {

		return sector;

	}

	public void setSector(String sector) {

		this.sector = sector;

	}

	public String getBriefwriteup() {

		return briefwriteup;

	}

	public void setBriefwriteup(String briefwriteup) {

		this.briefwriteup = briefwriteup;

	}

	public Integer getTurnover() {

		return turnover;

	}

	public void setTurnover(Integer turnover) {

		this.turnover = turnover;

	}

	public Integer getListedinstock() {

		return listedinstock;

	}

	public void setListedinstock(Integer listedinstock) {

		this.listedinstock = listedinstock;

	}

	public String getStockcode() {

		return stockcode;

	}

	public void setStockcode(String stockcode) {

		this.stockcode = stockcode;

	}

}
