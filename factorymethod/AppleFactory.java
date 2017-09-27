package com.factorymethod.yc;

/**
 * 苹果工厂
 *  专门提供苹果实例
 * @author 47936
 *
 */
public class AppleFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Apple();
	}

}
