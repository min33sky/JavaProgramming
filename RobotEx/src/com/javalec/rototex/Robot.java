package com.javalec.rototex;

import com.javalec.rototex.inter.Fly;
import com.javalec.rototex.inter.Knife;
import com.javalec.rototex.inter.Misail;

public abstract class Robot {
	
	Fly fly;
	Misail misail;
	Knife knife;
	
	public Robot(){
		
	}
	
	public void actionWalk(){
		System.out.println("걸을 수 있습니다.");
	}
	
	public void actionRun(){
		System.out.println("달릴 수 있습니다.");
	}
	
	public abstract void shape();
	
	public void setFly(Fly fly) {
		this.fly = fly;
	}

	public void setMisail(Misail misail) {
		this.misail = misail;
	}

	public void setKnife(Knife knife) {
		this.knife = knife;
	}
	
	public void actionKnife(){
		knife.knife();
	}
	
	public void actionMisail(){
		misail.misail();
	}
	
	public void actionFly(){
		fly.fly();
	}
}
