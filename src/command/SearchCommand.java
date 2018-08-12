package command;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import enums.*;
import proxy.*;
import service.MemberServiceImpl;

public class SearchCommand extends Command {
	public SearchCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		System.out.println("SearchCommand in  action : "+ request.getParameter("action"));
		execute();
	}
	@Override
	public void execute() {
		System.out.println("=========== SearchCommand execute 내부 ==========");
		request.setAttribute("pageName", "search");
		Map<String,String> param = new HashMap<>();
		PageProxy pxy = new PageProxy();
		
		if(request.getParameter("searchOption")!=null) {
			System.out.println("========= searchCommand searchOption 있을때(조건검색) 체크 ==========");
				request.getSession().setAttribute("searchOption", request.getParameter("searchOption"));
				request.getSession().setAttribute("searchWord", request.getParameter("searchWord"));
				param.put("column", (String) request.getSession().getAttribute("searchOption"));
				param.put("columnValue", (String) request.getSession().getAttribute("searchWord"));
		}else if(request.getSession().getAttribute("searchOption") != null) {
			System.out.println("========= searchCommand 조건검색하고 페이지넘버누를때  ==========");
			param.put("column", (String) request.getSession().getAttribute("searchOption"));
			param.put("columnValue", (String) request.getSession().getAttribute("searchWord"));
		}
		
		param.put("pageNum", (request.getParameter("pageNum")==null)?"1":request.getParameter("pageNum"));
		pxy.carryOut(param);
		Pagination page = pxy.getPagination();
		String[] arr1 = {"domain","beginRow","endRow"};
		String[] arr2 = {
				request.getServletPath()
					.split("/")[1]
					.split("\\.")[0],
				String.valueOf(page.getBeginRow()),
				String.valueOf(page.getEndRow())
		};
		for(int i=0; i<arr1.length; i++) {
			param.put(arr1[i], arr2[i]);
		}
		
		request.setAttribute("page", page);
		request.setAttribute(Term.LIST.toString(), MemberServiceImpl.getInstance().search(param));
		System.out.println("=========== SearchCommand 끝 ========================");
		super.execute();
	}
}
