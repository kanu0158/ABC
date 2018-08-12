package service;

import java.util.List;
import java.util.Map;

import domain.ExamBean;
import domain.MemberBean;

public interface MemberService {
	public void add(Map<?,?> param);
	public List<MemberBean> search(Map<?,?> param); // 페이지네이션 리스트
	public MemberBean retrieve(Map<?,?> param);
	public int count(Map<?,?> param);
	public void modify(Map<?,?> param);
	public void remove(Map<?,?> param);
	public boolean login(Map<?,?> param);
}
