package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import command.*;
import enums.Action;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/admin.do")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//service는 doget + dopost 인 이미 있는 메소드이다.
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1.AdminController ENTER!!!");
		Receiver.init(request);
		System.out.println("4.AdminController에서 액션조회: "+Receiver.cmd.getAction());
		switch (Action.valueOf(Receiver.cmd.getAction().toUpperCase())) {// 센트리가 말해줌 이친구 무브때문에 왔대요
		case SEARCH:
			System.out.println("6.Admin SEARCH안으로 진입");
			Carrier.forward(request, response);
			break;
		case RETRIEVE:
			System.out.println("6.Admin RETRIEVE안으로 진입");
			Carrier.forward(request, response);
			break;
		case MOVE:
			System.out.println("6.move안으로 진입");
			Carrier.forward(request, response); //이친구 단순히 페이지이동만 일어난데 캐리어병사 처리하게
			break;
		default:
			Carrier.redirect(request, response,"");
			break;
		}
	}

}
