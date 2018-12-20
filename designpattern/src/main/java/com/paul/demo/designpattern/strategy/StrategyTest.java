package com.paul.demo.designpattern.strategy;

import com.paul.demo.designpattern.strategy.duck.MallardDuck;
import com.paul.demo.designpattern.strategy.duck.RedHeadDuck;
import com.paul.demo.designpattern.strategy.fly.FlyNoWay;
import com.paul.demo.designpattern.strategy.fly.FlyWithWings;
import com.paul.demo.designpattern.strategy.quack.MuteQuack;
import com.paul.demo.designpattern.strategy.quack.Quack;
import com.paul.demo.designpattern.strategy.quack.Squeal;

public class StrategyTest {

	public static void main(String[] args) {
		FlyNoWay flyNoWay = new FlyNoWay();
		FlyWithWings flyWithWings = new FlyWithWings();
		
		Quack quack = new Quack();
		MuteQuack muteQuack = new MuteQuack();
		Squeal squeal = new Squeal();
		
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.setFlyBehavior(flyWithWings);
		mallardDuck.setQuackBehavior(muteQuack);
		
		mallardDuck.swim();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		RedHeadDuck redHeadDuck = new RedHeadDuck();
		redHeadDuck.setFlyBehavior(flyNoWay);
		redHeadDuck.setQuackBehavior(squeal);
		
		redHeadDuck.swim();
		redHeadDuck.display();
		redHeadDuck.performFly();
		redHeadDuck.performQuack();
	}
}
