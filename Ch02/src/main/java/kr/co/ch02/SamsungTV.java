package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stv")
public class SamsungTV implements TV{
	
	@Autowired
	private Speaker spk;
	
	public void powerON() {
		System.out.println("SamsumgTV powerOn...");
	}
	public void powerOff() {
		System.out.println("SamsumgTV powerOff...");
	}
	
	public void chUp() {
		System.out.println("SamsumgTV chUp...");
	}
	public void chDown() {
		System.out.println("SamsumgTV chDown...");
	}
	
	public void soundUp() {
		spk.soundUp();
	}
	public void soundDown() {
		spk.soundDown();
	}

}
