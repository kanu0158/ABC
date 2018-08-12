package factory; /*팩토리패턴을 따로 모은 패키지*/

import java.sql.Connection;
/*Shape인터페이스*/
public interface Database {
	public Connection getConnection();

}
