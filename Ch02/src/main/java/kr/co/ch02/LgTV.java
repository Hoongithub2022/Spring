package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ltv")
public class LgTV implements TV {

	@Autowired
	private Speaker spk;
	
	public void powerON() {
		System.out.println("LgTv powerOn...");
	}
	public void powerOff() {
		System.out.println("LgTv powerOff...");
	}
	
	public void chUp() {
		System.out.println("LgTv chup...");
	}
	public void chDown() {
		System.out.println("LgTv chdown...");
	}
	
	public void soundUp() {
		spk.soundUp();
	}
	public void soundDown() {
		spk.soundDown();
	}
}
