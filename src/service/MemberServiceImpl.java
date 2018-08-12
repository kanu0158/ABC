package service;

import java.util.*;
import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}
	@Override
	public void add(Map<?,?> param) {
		MemberDAOImpl.getInstance().insert(param);
	}
	@Override
	public List<MemberBean> search(Map<?, ?> param) {
		//토스만 하는데 사용하는 이유는 보안때문이다. 속도는 좀 저하 될지라도. ex/ 택배기사
		return MemberDAOImpl.getInstance().selectSome(param);
	}
	@Override
	public MemberBean retrieve(Map<?,?> param) {
		return MemberDAOImpl.getInstance().selectOne(param);
	}
	@Override
	public int count(Map<?,?> param) {
		return MemberDAOImpl.getInstance().count(param);
	}
	@Override
	public void modify(Map<?, ?> param) {
		MemberDAOImpl.getInstance().update(param);
	}
	@Override
	public void remove(Map<?,?> param) {
		MemberDAOImpl.getInstance().delete(param);
	}
	@Override
	public boolean login(Map<?,?> param) {
		return (MemberDAOImpl.getInstance().login(param)!=null);
	};
	
}
