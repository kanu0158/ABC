package enums;

public enum DBConstant {
	ORACLE_DRIVER,CONNECTION_URL,ID,PASSWORD;
	@Override
	public String toString() {
		String dbc = "";
		switch(this) {
		case ORACLE_DRIVER:
			dbc = "oracle.jdbc.driver.OracleDriver";
			break;
		case CONNECTION_URL:
			dbc = "jdbc:oracle:thin:@localhost:1521:xe";
			break;
		case ID:
			dbc = "seein";
			break;
		case PASSWORD:
			dbc = "0158";
			break;	
		}
		return dbc;
	}
}
