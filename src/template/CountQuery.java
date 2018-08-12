package template;

import java.sql.*;

import enums.MemberQuery;

public class CountQuery extends QueryTemplate{
	@Override
	void initialize() {
		System.out.println("=======CountQuery init =========");
		map.put("sql", (!map.containsKey("column")) ?
				MemberQuery.COUNT.toString()
				:String.format(MemberQuery.COUNT_SOME.toString(),map.get("column"))
			);
		System.out.println("sql :" + map.get("sql"));
	}
	@Override
	void startPlay() {
		System.out.println("CountQuery startPlay 내부 ");
		try {
			System.out.println("map.get('column') : "+ map.get("column"));
			
			if(map.containsKey("column")){
				System.out.println("if column 내부");
				pstmt.setString(1,"%"
				+map.get("columnValue").toString()+"%");
			}
			System.out.println("CountQuery startPlay 완료");
			
		} catch (Exception e) {e.printStackTrace();}
		
	}
	@Override
	void endPlay() {
		System.out.println("CountQuery endPlay 내부 ");
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("rs.getInt(count) : "+ rs.getInt("count"));
				map.put("count", rs.getInt("count"));
			}
		} catch (Exception e) {e.printStackTrace();}
		System.out.println("CountQuery endPlay 완료 ");
	}
}
