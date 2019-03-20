package com.sharath.ServBeans;

import java.util.List;

public class TOV {
	private List<String> tov;
	private String v;

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public List<String> getTov() {
		return tov;
	}

	public void setTov(List<String> tov) {
		this.tov = tov;
	}

	@Override
	public String toString() {
		return "TOV [tov=" + tov + ", v=" + v + "]";
	}

	
	

}
