package com.factorymethod.yc;

/**
 * 工厂方法模式属于类的创建型模式，
 * 	它的意义是  定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类中
 * 	核心工厂类不在负责产品的创建，核心类成为一个抽象工厂角色，仅负责具体子类必须实现的接口
 * 	它的好处是  使系统可以在不修改具体工厂角色的情况下引进新的产品。
 * 
 * 	
 * @author 47936
 *
 */
public class Test {
	public static void main(String[] args) {
		//获得AppleFactory
		FruitFactory ff = new AppleFactory();
		//通过 AppleFactory来获得Apple实例对象
		Fruit apple = ff.getFruit();
		apple.get();
		
		FruitFactory ff1 = new BananaFactory();
		Fruit banaba = ff1.getFruit();
		banaba.get();
		
	/*
	 * 	这样有新的产品时，只要加一个新的Pear类和PearFactory类
	 * 	就可以添加产品
	 */
		FruitFactory ff2 = new PearFactory();
		Fruit pear = ff2.getFruit();
		pear.get();
		
		FruitFactory ff3 = new OrangeFactory();
		Fruit orange = ff3.getFruit();
		orange.get();
	}
}
