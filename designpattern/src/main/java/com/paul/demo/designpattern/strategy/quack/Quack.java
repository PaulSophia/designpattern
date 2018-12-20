package com.paul.demo.designpattern.strategy.quack;

/**
 * 呱呱叫部分业务实现
 * @author huangyun
 *
 */
public class Quack implements QuackBehavior {

	public void quack() {
		System.out.println("Quack Quack...");
	}

}
