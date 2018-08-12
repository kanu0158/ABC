package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Carrier {
	public static void forward(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("7.캐리어FORWARD내부에서 뷰조회:"+Receiver.cmd.getView());
		try {
			request.getRequestDispatcher(Receiver.cmd.getView()).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void redirect(HttpServletRequest request,
			HttpServletResponse response,String url){
			System.out.println("7.캐리어redirect 내부");
			System.out.println("7-1.request.getContextPath()" + request.getContextPath());
			try {
				response.sendRedirect(request.getContextPath()+url);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
