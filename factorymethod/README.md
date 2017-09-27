# 工厂方法模式
  属于类的创建型模式，
 * 	它的意义是  定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类中
 * 	核心工厂类不在负责产品的创建，核心类成为一个抽象工厂角色，仅负责具体子类必须实现的接口
 * 	它的好处是  使系统可以在不修改具体工厂角色的情况下引进新的产品。