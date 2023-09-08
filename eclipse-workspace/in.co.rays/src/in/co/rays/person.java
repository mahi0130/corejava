package in.co.rays;

import java.util.Date;

public class person {
	private int id = 0;
	private String name = null;
	private Date dob = null;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDob() {
		return dob;
	}
	}
