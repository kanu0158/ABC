package enums;
 /* 팩토리패턴
  * 이 시스템은 다음 4가지의 데이터베이스가 서로 호환이 가능합니다.*/ 
/*이넘은 객체이므로 상황지나가면 가비지컬렉터에 의해 제거되므로 메모리 점유하지 않게됨 반면 상수는 남아있으니 메모리점유함*/
public enum Vendor {
	ORACLE,MYSQL,MARIADB,MSSQL
}
