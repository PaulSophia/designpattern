package com.paul.demo.designpattern.strategy.duck;

import com.paul.demo.designpattern.strategy.fly.FlyNoWay;
import com.paul.demo.designpattern.strategy.quack.Quack;

/**
 * 野鸭
 * @author huangyun
 *
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
}
