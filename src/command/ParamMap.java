package command;

import javax.servlet.http.HttpServletRequest;

public class ParamMap {//체크박스를 가져오는 유틸
	public static String getValues(HttpServletRequest request, String name) {
	String[] values = request.getParameterMap().get(name);//name == subject로 들어감
	StringBuffer buff = new StringBuffer(); // 카톡메시지, 스트링 모아두었다가 보내는 것
	for(String s : values) {
		buff.append(s+",");
	}
	return buff.toString().substring(0,buff.toString().length()-1);//맨마지막 , 빼려고 -1 한 것
	}
}
