package command;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import enums.Domain;
import service.MemberServiceImpl;

public class AddCommand extends Command {
	public AddCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
@Override
	public void execute() {
		switch(Domain.valueOf(domain.toUpperCase())) {
		case MEMBER:
			System.out.println("회원가입에 들어옴!!");
			Map<String, String> param = new HashMap<>();
			param.put("userId", request.getParameter("userId"));
			param.put("userPass", request.getParameter("userPass"));
			param.put("name", request.getParameter("name"));
			param.put("ssn", request.getParameter("ssn"));
			param.put("age", request.getParameter("age"));
			param.put("gender", request.getParameter("gender"));
			param.put("teamId", request.getParameter("teamId"));
			param.put("roll", request.getParameter("roll"));
			param.put("subject", ParamMap.getValues(request, "subject"));
			
			MemberServiceImpl.getInstance().add(param);
			if(MemberServiceImpl.getInstance().login(param)) {
				request.setAttribute("pageName", "login");
				request.setAttribute("result", "success");
				System.out.println("회원가입성공!!");
			}else {
				request.setAttribute("pageName", "add");
				request.setAttribute("result", "fail");
				System.out.println("회원가입실패!!");
			}
			break;
			default:
				break;
		}
		super.execute();
	}
}
