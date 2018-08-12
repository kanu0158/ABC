package template;

import java.sql.ResultSet;
import domain.MemberBean;
import enums.MemberQuery;

public class LoginQuery extends QueryTemplate{
	@Override
	void initialize() {
		System.out.println("=======LoginQuery init =========");
		map.put("sql", MemberQuery.LOGIN.toString());
		System.out.println("sql :" + map.get("sql"));
	}
		
	@Override
	void startPlay() {
		System.out.println("LoginQuery startPlay 내부 ");
		try {
			int j = 1;
			System.out.println("map.get(userId) : "+ map.get("userId").toString());
			pstmt.setString(j++,map.get("userId").toString());
			System.out.println("userId set 완료 j:"+j);
			System.out.println("map.get(userPass) : "+ map.get("userPass").toString());
			pstmt.setString(j++,map.get("userPass").toString());
			System.out.println("userPass set 완료");
		} catch (Exception e) {e.printStackTrace();}
		System.out.println("LoginQuery startPlay 완료 ");
	}
	@Override
	void endPlay() {
		System.out.println("LoginQuery endPlay 내부 ");
			try {
				ResultSet rs = pstmt.executeQuery();
				MemberBean mem = null;
				System.out.println("rs.next전");
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
					System.out.println(mem);
					list.add(mem);
				}
			} catch (Exception e) {e.printStackTrace();}
		System.out.println("LoginQuery endPlay 완료 ");
	}
}
