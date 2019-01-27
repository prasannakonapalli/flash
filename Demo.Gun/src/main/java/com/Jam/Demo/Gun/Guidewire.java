package com.Jam.Demo.Gun;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="guidewire_table")

public class Guidewire {
@Id
	private int gid;
   // @Transient
	private GuidewireName gname;
	//@Column(name="guidewire_color")
	private String color;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	
	public GuidewireName getGname() {
		return gname;
	}
	public void setGname(GuidewireName gname) {
		this.gname = gname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Guidewire [gid=" + gid + ", gname=" + gname + ", color=" + color + "]";
	}
	

}
