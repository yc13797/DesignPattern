package com.simplefactory.yc;

/**
 * 水果类的工厂
 * @author 47936
 *
 */
public class FruitFactory {
	
//	/*
//	 * 获得Apple实例
//	 */
//	public static Fruit getApple(){
//		return new Apple();
//	}
//	
//	/*
//	 * 获得Banana实例
//	 */
//	public static Fruit getBanana(){
//		return new Banana();
//	}
	
	public static Fruit getFruit(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		if(type.equalsIgnoreCase("apple")){
			return Apple.class.newInstance();
		}else if(type.equalsIgnoreCase("banana")){
			return Banana.class.newInstance();
		}else{
			System.out.println("找不到相应的类");
			return null;
		}//一般用这种比较好
		
//		Class fruit = Class.forName(type);
//		return (Fruit) fruit.newInstance();
	}
}
