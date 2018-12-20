package com.paul.demo.designpattern.strategy.quack;

/**
 * 不公叫部分实现
 * @author huangyun
 *
 */
public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("I can't quack!");
	}

}
