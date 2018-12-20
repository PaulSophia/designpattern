package com.paul.demo.designpattern.strategy.fly;

/**
 * 不会飞部分业务实现
 * @author huangyun
 *
 */
public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly...");
	}

}
