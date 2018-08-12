package factory;

import java.util.Map;

import enums.*;

/*ShapeFactory 클래스*/
public class DatabaseFactory {
	public static Database createDatabase(Vendor v,String id,String pass) {//static을 붙여 공장은 이미 존재하게해
		Database db = null;
		String driver = "",url="";
		switch (v) {
		case ORACLE://ENUM은 여기서 사용후 없어지는 느낌, 상수는 계속 남아있는...?
			driver = DBConstant.ORACLE_DRIVER.toString();
			url = DBConstant.CONNECTION_URL.toString();
			db = new Oracle(driver,url,id,pass);
			break;
		default:
			break;
		}
		return db;
	}
	//템플릿 패턴에 사용하기 위한 것
	public static Database createDatabase2(Map<String,Object> map) {//static을 붙여 공장은 이미 존재하게해
		Database db = null;
		String driver = "",url="";
		switch ((Vendor)map.get("vendor")) {
		case ORACLE://ENUM은 여기서 사용후 없어지는 느낌, 상수는 계속 남아있는...?
			driver = DBConstant.ORACLE_DRIVER.toString();
			url = DBConstant.CONNECTION_URL.toString();
			db = new Oracle(driver,url,(String)map.get("id"),(String)map.get("password"));
			break;
		default:
			break;
		}
		return db;
	}
}
