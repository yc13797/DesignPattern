package com.factorymethod.yc;

/**
 * 橘子工厂
 *  专门提供橘子实例
 */
public class OrangeFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Orange();
	}

}
