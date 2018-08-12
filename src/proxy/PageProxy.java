package proxy;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import enums.Term;
import lombok.Data;
import service.MemberServiceImpl;
@Data
public class PageProxy implements Proxy {//request에 셋하는 걸 시킬거야
	Pagination pagination;
	@Override
	public void carryOut(Map<?,?> param) {
		this.pagination = new Pagination();
		pagination.carryOut(param);
	}

	
}
