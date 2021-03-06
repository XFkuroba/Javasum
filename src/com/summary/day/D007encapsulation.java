package com.summary.day;
/*	封装encapsulation 
 * 	继承inheritance
 * 	super
 * 
 * 
 * 一、封装encapsulation
 * 1、单例
 * 	目标：一个类只有一个对象
 * 	设计模式：为到达一定的目的，设计类时采用的通用的套路，称为模式。 
 * 	单例模式：
 * 	饿汉式：
 *  a)、构造器私有化
  	b)、提供私有的静态属性创建对象
  	c)、对外提供公共的静态方法获取对象  
  	懒汉式
  	class Myencapsulation
	2、分层
	 在后期开发的工程|项目中，各司其职合理分工，
	 将代码放入到不同的包下的不同类中(界面 web service dao  db)。
	 每人按职责编写代码，最后整合到一起。
	 详见 Gthez
	 
	 二、继承inheritance
	1、目的
		子承父业，延续和扩增父类信息。
	2、类与类关系
		1)、依赖:偶然性，非持久；作为方法的形参和局部变量
		2)、关联: 持久性的联系；作为属性
		3)、聚合: 强关联(整体与部分，不具有生命周期的一致)，属性
		4)、组合: 强聚合(整体与部分，具有生命周期的一致)，属性
		5)、继承：is  父类-->父子概念
		6)、实现:  like 接口
	3、继承 extends
		类:对同种事物的抽象
   		继承: 对同一批类的抽象
   		JAVA单继承
   		继承链
   		作用：延续和扩增父类信息(包括私有信息，只是没有访问权限)
   		重写：多态
   			前提: 重写只发生在子类中的方法上
   			方法签名相同
   			返回类型 void 和基本 也必须相同，如果引用类型<=
   		不能重写：static final private 以及属性
	三、super
	1、概念：表示在子类及非静态信息中，指代父类的信息。
		类似this
	四、final
	1、final 属性 	常量，没有默认值
	2、final 方法	 	不能被重写
	3、final 类: 	不能被继承

	
	总结:
	1、	类与类关系: 依赖 关联  聚合 组合  继承 实现
	2、	继承
	1)、extends 2)、单继承 3)、延续和扩增 4)、重写
	3、super
	 子类中 子类成员信息中 ，指代父亲
	super.属性  super.方法([实参])  super([实参])
	4、实例化: 父类 子类  静态 成员
	5、final : 常量(默认值) 非重写方法  非继承类



	 
 * 
 * 
 * */
public class D007encapsulation {

}
