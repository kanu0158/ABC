package command;

import javax.servlet.http.HttpServletRequest;

import enums.Action;

//invoker 명령처리해주는 명령처리자
public class Commander {
	public static Command order(HttpServletRequest request) {
		Command cmd = null;
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE:
			System.out.println("3.커맨더 무브진입");
			cmd = new MoveCommand(request);
			break;
		case ADD:
			System.out.println("3.커맨더 조인진입");
			cmd = new AddCommand(request);
			break;
		case SEARCH:
			System.out.println("3.커맨더 리스트진입");
			cmd = new SearchCommand(request);
			break;
		case RETRIEVE:
			System.out.println("3.커맨더 리트리브진입");
			cmd = new RetrieveCommand(request);
			break;
		case MODIFY:
			System.out.println("3.커맨더 UPDATE진입");
			cmd = new ModifyCommand(request);
			break;
		case REMOVE:
			System.out.println("3.커맨더 DELETE진입");
			cmd = new RemoveCommand(request);
			break;	
		case LOGIN:
			System.out.println("3.커맨더 LOGIN진입");
			cmd = new LoginCommand(request);
			break;		
		}
		return cmd;
	}
}
