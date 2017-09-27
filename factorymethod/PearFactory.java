package com.factorymethod.yc;

/**
 * 梨子工厂
 *  专门提供梨子实例
 * @author 47936
 *
 */
public class PearFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Pear();
	}

}
