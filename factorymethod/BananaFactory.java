package com.factorymethod.yc;

/**
 * 香蕉工厂
 *  专门提供香蕉实例
 * @author 47936
 *
 */
public class BananaFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Banana();
	}

}
