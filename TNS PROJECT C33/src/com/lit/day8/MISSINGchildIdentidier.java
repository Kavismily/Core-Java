package com.lit.day8;

public class MISSINGchildIdentidier extends projects
{
	private float software, hardware;
	private  float good,bad;
	public MISSINGchildIdentidier() {
		this.software = 5680.0f;
		this.hardware = 4536f;
		this.good= 5f;
		this.bad= 1f;
	}
	
	void calcost()
	{
		cost = software + hardware;
		rating = good - bad;
	}

	@Override
	public String toString() {
		return "MISSINGchildIdentidier [software=" + software + ", hardware=" + hardware + ", good=" + good + ", bad="
				+ bad + ", cost=" + cost + ", rating=" + rating + "]";
	}
	
}
