package com.paul.demo.designpattern.strategy.duck;

import com.paul.demo.designpattern.strategy.fly.FlyWithWings;
import com.paul.demo.designpattern.strategy.quack.MuteQuack;

/**
 * 红头鸭
 * @author huangyun
 *
 */
public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new MuteQuack();
	}
}
