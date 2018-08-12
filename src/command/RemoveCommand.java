package command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class RemoveCommand extends Command{
	public RemoveCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	
	@Override
	public void execute() {
		switch(Domain.valueOf(domain.toUpperCase())) {
		case MEMBER:
			System.out.println("RemoveCommand에 들어옴!!");
			Map<String, String> param = new HashMap<>();
			param.put("userId", ((MemberBean)request.getSession().getAttribute(Domain.USER.toString())).getUserId());
			param.put("userPass", request.getParameter("user_pass"));
			MemberServiceImpl.getInstance().remove(param);
			request.getSession().invalidate();//로그아웃
			System.out.println("Session in user :" +((MemberBean)request.getSession().getAttribute("user")));
			System.out.println("멤버제거 성공!!");
			break;
		}
		
		super.execute();
	}
}
