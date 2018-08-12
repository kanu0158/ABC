package template;

import java.lang.reflect.Field;
import domain.MemberBean;
import enums.Domain;

public class ColumnFinder {
	public static String find(Domain dom) {
		String s = "";
		Class<MemberBean> clazz = null; //자바 리플렉션, 클래스.forname과 비슷
										// 그 클래스의 진짜 리얼 스펙을 알고싶을때 사용하는 기법 == 리플렉션 기법
		switch (dom) {
		case MEMBER:
			/*MemberBean m = new MemberBean(); 가상의 객체 , 생성자는 가상의 세상, 리얼이 아닌 주소값일 뿐
			 * clazz = m;*/
 			clazz=MemberBean.class; // 하드에 존재하는 .class 파일  == 얘도 객체(리얼 객체), 리플렉션
			break;
		default:
			break;
		}
		Field[] f = clazz.getDeclaredFields();
		System.out.println("ColumnFinder in f = "+f);
		for(int i=0;i<f.length;i++) {
			s+=(i!=(f.length-1))?
					f[i].getName()+",":
						f[i].getName();
			//System.out.println("ColumnFinder for in f[i].getName = "+f[i].getName());
		}
		return s;
	}

}
