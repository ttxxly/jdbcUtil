package com.ruanmou.vip.jdbc.util;

import com.ruanmou.vip.jdbc.util.enums.DriverInfoEnum;

/**
 * 封装DML操作思路： 
 * 	insert,update,delete 操作都是用executeUpdate方法，并且返回操作受影响下行数
 *  把DML操作的语句提取为一个方法来实现
 *  public static int executeUpdate(String sql, Object... parameters) {
 *  	// 获取连接
 *  	// 定义执行DML语句
 *  	// 创建预编译对象
 *  	// 设置参数
 *  	// 需要通过编译对象执行SQL语句
 *  	// 释放资源
 *  } 
 * @author Administrator
 * 1、获取连接数据不确定? (MySql, Oracle,.....)-> 把数据连接想过信息配置一个properties文件中
 *
 */
public class JDBCUtils {
	/*static { // 加载驱动操作
		try {
			Class.forName(DriverInfoEnum.DRIVER_CLASS.getInfo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	public static void main(String[] args) {
		System.out.println(DriverInfoEnum.DRIVER_CLASS.getInfo());
	}
}
