package com.paul.demo.designpattern.strategy.fly;

/**
 * 会飞部分实现
 * @author huangyun
 *
 */
public class FlyWithWings implements FlyBehavior {

	public void fly() {
		System.out.println("Fly in the sky!!");
	}

}
