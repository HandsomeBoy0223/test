package test;

import java.awt.image.BufferedImage;
import java.io.File;

public class Test {
	public static SqlSrvDBConn sqlSrvDBConn;
	public static void main(String[] args) {
		
		//�������ݿ�
		sqlSrvDBConn = new SqlSrvDBConn();
		System.out.println("�������ݿ�ɹ�");
		//��ѯ����
		String sql = "insert into emp(empno,ename) values(1000,'test')";
		sqlSrvDBConn.executeInsert(sql);
		System.out.println("���    " + "����    ");
		try {
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("emp����ӳɹ�");
	}
}
