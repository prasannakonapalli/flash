package com.Jam.Demo.Gun;

import javax.persistence.Embeddable;

@Embeddable
public class GuidewireName {
private String fname;
private String lname;
private String mname;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
@Override
public String toString() {
	return "GuidewireName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
}

}
