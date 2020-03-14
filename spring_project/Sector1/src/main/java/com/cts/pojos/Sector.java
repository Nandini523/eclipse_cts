package com.cts.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity

@Table(name = "sectors")
public class Sector {
	@Id
	private Integer sid;

	private String sectorname;

	private String brief;

	@Override

	public String toString() {

		return "Sectors [sid=" + sid + ", sectorname=" + sectorname + ", brief=" + brief + "]";

	}

	public int getSid() {

		return sid;

	}

	public void setSid(int sid) {

		this.sid = sid;

	}

	public String getSectorname() {

		return sectorname;

	}

	public void setSectorname(String sectorname) {

		this.sectorname = sectorname;

	}

	public String getBrief() {

		return brief;

	}

	public void setBrief(String brief) {

		this.brief = brief;

	}

}
