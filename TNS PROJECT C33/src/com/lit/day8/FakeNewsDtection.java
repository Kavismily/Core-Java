package com.lit.day8;

public class FakeNewsDtection extends projects
{
	private float software,hardware;
	private float good,bad;
	public FakeNewsDtection() {

		this.software=34563f;
				this.hardware=3432f;
				this.good = 4f;
				this.bad = 1f;
				
	}
   void calcost()
   {
	   cost = software + hardware;
	   rating = good - bad ;
   }
@Override
public String toString() {
	return "FakeNewsDtection [software=" + software + ", hardware=" + hardware + ", good=" + good + ", bad=" + bad
			+ ", cost=" + cost + ", rating=" + rating + "]";
}

   
}
