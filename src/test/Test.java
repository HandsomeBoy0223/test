package test;

import java.awt.image.BufferedImage;
import java.io.File;

public class Test {
	public static SqlSrvDBConn sqlSrvDBConn;
	public static void main(String[] args) {
		
		//链接数据库
		sqlSrvDBConn = new SqlSrvDBConn();
		System.out.println("连接数据库成功");
		//查询操作
		String sql = "insert into emp(empno,ename) values(1000,'test')";
		sqlSrvDBConn.executeInsert(sql);
		System.out.println("序号    " + "名字    ");
		try {
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("emp表添加成功");
	}
}
