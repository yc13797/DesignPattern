package com.simplefactory.yc;

/**
 * 简单工厂模式，属于类的创建型模式
 * 通过定义一个类来负责创建其他类的实例，被创建的实例具有相同的父类/接口
 * 优点：工厂类是关键。有利于软件体系结构的优化
 * 缺点：工厂类集中了所有类的实例创建，拓展性不是很好
 * @param args
 * @throws IllegalAccessException 
 * @throws InstantiationException 
 * @throws ClassNotFoundException 
 */
public class Test {	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*
		 * 普通方式
		 */
//		Fruit apple = new Apple();
//		Fruit banana = new Banana();
//		
//		apple.get();
//		banana.get();
		
		/*
		 * 工厂方式
		 */
//		Fruit apple = FruitFactory.getApple();
//		Fruit banana =FruitFactory.getBanana();
//		apple.get();
//		banana.get();
		
		//改进
		Fruit apple = FruitFactory.getFruit("Apple");
		Fruit banana = FruitFactory.getFruit("Banana");
		apple.get();
		banana.get();
	}
}
