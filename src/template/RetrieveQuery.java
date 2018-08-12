package template;

import java.sql.*;

import domain.MemberBean;
import enums.*;

public class RetrieveQuery extends QueryTemplate{
	@Override
	void initialize() {
		System.out.println("=======RetrieveQuery init =========");	
		map.put("sql", MemberQuery.RETRIEVE.toString());
		System.out.println("sql :" + map.get("sql"));
	}
	@Override
	void startPlay() {
		System.out.println("RetrieveQuery startPlay 내부 ");
				try {
					pstmt.setString(1,   // 얘는 1부터 간다. ?에 집어넣는 것임
							String.valueOf(map.get("userId")));
				} catch (Exception e) {e.printStackTrace();}
		System.out.println("RetrieveQuery startPlay 완료 ");
	}
	@Override
	void endPlay() {
		System.out.println("RetrieveQuery endPlay 내부 ");
			try {
				ResultSet rs = pstmt.executeQuery();
				MemberBean mem = null;
				while(rs.next()) {
					mem = new MemberBean();
					mem.setUserId(rs.getString("USERID"));
					mem.setTeamId(rs.getString("TEAMID"));
					mem.setName(rs.getString("NAME"));
					mem.setAge(rs.getString("AGE"));
					mem.setGender(rs.getString("GENDER"));
					mem.setRoll(rs.getString("ROLL"));
					mem.setPassword(rs.getString("PASSWORD"));
					mem.setSsn(rs.getString("SSN"));
					list.add(mem);
				}
				System.out.println("RetrieveQuery endPlay 내부 list : " + list);
			} catch (Exception e) {e.printStackTrace();}
		System.out.println("RetrieveQuery endPlay 완료 ");
	}
}
