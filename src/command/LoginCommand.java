package command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import enums.Term;
import service.MemberServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	
	@Override
	public void execute() {
			super.execute();
			System.out.println("로그인에 들어옴!!");
			Map<String, String> param = new HashMap<>();
			param.put("userId", request.getParameter("userId"));
			param.put("userPass", request.getParameter("userPass"));
			if(MemberServiceImpl.getInstance().login(param)) {
				request.getSession().setAttribute(Domain.USER.toString(), MemberServiceImpl.getInstance().retrieve(param));
				request.setAttribute("pageName", "retrieve");
				System.out.println("로그인성공!!");
			}else {
				request.setAttribute("pageName", "login");
				System.out.println("로그인실패!!");
			}
		
	}
}
