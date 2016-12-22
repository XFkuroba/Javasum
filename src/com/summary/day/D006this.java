package com.summary.day;
/*构造快 this static GC(垃圾回收机制) 包(package) 封装(encupsulation)
 * 
 * 	一、构造快
 * 作用：初始化对象信息
 * 先于构造器执行，每次创建执行一次(注意有this的情况)
 * 区别
	重复:  构造块 构造器执行前可以重复使用代码。 构造器 只能使用一次。
	传参:  构造块 不能动态传递值，构造器可以使用形参，动态传递值
	(理解还是有点偏差感觉)
	
	二、this
	this: 隐式存在与 对象中(成员方法、构造器)，谁操作代表谁  ”我” ，即通配概念。
	this.属性
	属性与局部变量同名，区分二者。
	this.方法
	this.方法([实参]): 阅读方便，显式使用this,区分静态方法还是成员方法
	this([实参])
	构造器重载时，避免代码重复，使用在构造器的首行(只能为首行)，显式的调用其他构造器。
	注意: 必须预留出口，否则出现递归构造的调用
	
	三、static
	凡是静态的，不推荐使用对象.调用，容易引起混淆。
	静态的，就是共享的就是类的，与对象无关; 凡是静态的先于对象存在。
	static +属性。成员间共享
	静态方法只能使用静态信息(静态方法、静态属性) （静态方法不能调用非静态属性）
	成员方法可以使用一切		
	静态块 	初始化类信息、加载类信息。在使用的第一次加载，仅加载一次。

	四、块
	普通块 静态块 构造块 同步块(synchronized多线程)
	
 * 	五、GC 垃圾回收机制
 * 
 	了解，垃圾回收(对象)机制。
	1、java程序猿无权调用GC
	2、可以通过 System.gc() 通知，但是不保证立即运行
	3、finalize(): 释放内存善后的方法。 
	
	释放引用
	强引用 ，不会回收
	软引用 ，内存不够才会释放
	弱引用 ，内存检查释放
	虚引用 ，随时回收

 * 六、包package
 * 位置：类的首行
 * 格式：域名倒着写+项目名+模块名
 * package com.shsxt.D6this
 * 编译 javac  -d . 源代码.java
 * 运行 java 包名 类名
 * 
 * 导包 通配符*
 * 
 * 
 * 七、封装 (encapsulation)
 * 	理解：保护内部数据
 * 	手段：
 * private 本类可见
 * default 本类+同包
 * protected 本类+同包+子类
 * public 全部
 * 
 * protected修饰成员方法时，只能在子类中且子类对象自己访问,	
 * 不是指父亲对象在子类中访问。
 * 
 * 
 * 访问权限修饰
1)、类: public|default
2)、信息: 方法与属性public| protected |default| private
  	方法: public| private
  	属性: private
  	
  	JAVABean|PO|BO|VO
  	封装数据用
	 1)、类public
	 2)、属性private
	 3)、方法public   setter|getter访问器
	 4)、加入无参构造


 * */
public class D006this {

}
