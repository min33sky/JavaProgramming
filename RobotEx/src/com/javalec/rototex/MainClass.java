package com.javalec.rototex;

import com.javalec.rototex.inter.FlyYes;
import com.javalec.rototex.inter.KnifeYes;
import com.javalec.rototex.inter.MisailYes;
/*
 * 전략 패턴 (Strategy Pattern)
 */
public class MainClass {
	public static void main(String[] args) {
		System.out.println("SuperRobot을 만들어 주세요.");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		
		superRobot.setFly(new FlyYes());
		superRobot.setMisail(new MisailYes());
		superRobot.setKnife(new KnifeYes());
		
		superRobot.actionFly();
		superRobot.actionMisail();
		superRobot.actionKnife();
	}
}
