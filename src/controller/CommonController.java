package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enums.Term;
@WebServlet("/common.do")
public class CommonController extends HttpServlet { // 메인페이지로 보내는 역할
	private static final long serialVersionUID = 1L;
	enum Resources{
		CONTEXT,CSS,JS,IMG
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("common 컨트롤러 안입니다");
		int i=0;
		for(Resources r: Resources.values()) {
			request.getSession()
				.setAttribute(r.toString().toLowerCase(),
						(i==0)?
								request.getContextPath() :
								request.getContextPath()
									+"/resources/"+r.toString().toLowerCase());
			//코딩 스타일(철학)  같은레벨끼리 두고 연산(+) and . 을 앞에 둬
			i++;
		}
		request.getSession()
			.setAttribute("adminPass", "1");
		String servletPath = request.getServletPath();
		System.out.println("common 컨트롤러 내부 servletPath : "+servletPath);
		System.out.println("common 컨트롤러 내부 servletPath.substring : "+request.getServletPath().substring(0, request.getServletPath().indexOf(".")));
		System.out.println("common 컨트롤러 내부 request.getServletPath().split('\\.')[0] : "+request.getServletPath().split("\\.")[0]);
		System.out.println("common 컨트롤러 끝입니다");
		request.getRequestDispatcher(Term.WEBPATH.toString()+request.getServletPath().split("\\.")[0]+"/"+Term.MAIN.toString()).forward(request, response);
		//request.getRequestDispatcher(Term.WEBPATH.toString()+request.getServletPath().substring(0, request.getServletPath().indexOf("."))+Term.MAIN.toString()).forward(request,response);
		//request.getRequestDispatcher(Term.WEBPATH.toString()+"/"+request.getServletPath().split("/")[1].split("\\.")[0]+"/"+Term.MAIN.toString()).forward(request, response);
	}
}
