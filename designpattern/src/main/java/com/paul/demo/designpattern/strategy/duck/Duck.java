package com.paul.demo.designpattern.strategy.duck;

import com.paul.demo.designpattern.strategy.fly.FlyBehavior;
import com.paul.demo.designpattern.strategy.quack.QuackBehavior;

/**
 * 抽象基类，封装公共部分
 * @author huangyun
 *
 */
public abstract class Duck {

	FlyBehavior flyBehavior;
	
	QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println(this.getClass().getSimpleName() + " swim~");
	}
	
	public void display() {
		System.out.println("I'm a " + this.getClass().getSimpleName());
	}
	
	public void performQuack() {
		this.quackBehavior.quack();
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
