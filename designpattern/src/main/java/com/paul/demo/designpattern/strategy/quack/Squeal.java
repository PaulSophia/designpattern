package com.paul.demo.designpattern.strategy.quack;

/**
 * 尖声叫部分业务实现
 * @author huangyun
 *
 */
public class Squeal implements QuackBehavior {

	public void quack() {
		System.out.println("Squeal Squeal...");
	}

}
