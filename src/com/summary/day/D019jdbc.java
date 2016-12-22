package com.summary.day;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//没有关联oojdbc6.jar报错

/*	jdbc(java database Connectivivity)
 * 
 * 一、jdbc 使用
 * a.安装驱动，并自动像驱动管理注册
 * 
 * 1.Class.forName("oracle.jdbc.OracleDriver");
 * 2.Class.forName("oracle.jdbc.driver.OracleDriver")
 * 3.New oracle.jdbc.OracleDriver()
 * 4.New oracle.jdbc.driver.OracleDriver();
 * 前两种加载类，
 * 后两种创造实力，占内存，回收需要时间
 * ======================================
 * b.获取链接
 *	DriverManage.getConnection(url,username,pwd);
 * 		Url:数据库的连接地址+@ip地址+数据库的端口号+实例名称
 * 			OracleUrl:jdbc:oracle:thin@localhost:1521:orcl
 * 		username=scott;
 * 		pwd=tiger;
 * ======================================
 * c.准备变量接受链接
 * 	Java.sql.Connection 变量名 = DriverManage.getConnection(url,username,pwd);
 * ======================================
 * d.获取传送sql 的通道statement—静态块
 * 	Statement stmt = Conection变量名.createStatement();
 * ======================================
 * e.传递并执行sql
 * 	ResultSet rs = Stmt.executeQuery("sql语句");
 * 
 * 
 * 
 *
 * 
 * 
 * */
public class D019jdbc {
	public static void main(String[] args) throws Exception {
		/*
		 * 1.加载并且注册驱动
		 * 2.获取连接
		 * 3.创建静态块
		 * 4.执行
		 * 
		 * 5.关闭
		 * 	2：更新|3：查看
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		
		Statement stmt = conn.createStatement();
//		批量添加sql
		stmt.addBatch("insert into t_user(id,uname,pwd) values(2,'zs',123)");
		stmt.addBatch("insert into t_user(id,uname,pwd) values(3,'zs',123)");
		stmt.addBatch("insert into t_user(id,uname,pwd) values(4,'zs',123)");
		
//		-2:代表成功
		stmt.executeBatch();
		
//		6.关闭流
		/*
		 * 关闭流
		 * 	后打开的先关闭
		 */
		if(stmt!=null){
			stmt.close();
		}
		if(conn!=null){
			conn.close();
		}
	}
}
