package dao;

import java.util.*;
import domain.*;
import template.*;

public class MemberDAOImpl implements MemberDAO {
	private static MemberDAO instance = new MemberDAOImpl();
	public static MemberDAO getInstance() {return instance;}
	private MemberDAOImpl() {}
	private QueryTemplate q;
	@Override
	public void insert(Map<?,?> param) {
		System.out.println("dao insert메소드 내부");
		q = new AddQuery();
		q.play(param);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<MemberBean> selectSome(Map<?, ?> param) {
		System.out.println("dao selectSome메소드 내부 beginRow, endRow :" + param.get("beginRow") + " ," + param.get("endRow"));
		q = new SearchQuery();
		q.play(param);
		return (List<MemberBean>)(Object)q.getList();
	}
	@Override
	public MemberBean selectOne(Map<?,?> param) {
		System.out.println("dao selectOne메소드 내부");
		q = new RetrieveQuery();
		q.play(param);
		return (MemberBean) q.getList().get(0);
	}
	@Override
	public int count(Map<?,?> param) {
		System.out.println("dao count메소드 내부");
		q = new CountQuery();
		q.play(param);
		return (int) q.getMap().get("count");
	}
	@Override
	public void update(Map<?, ?> param) {
		System.out.println("dao update메소드 내부");
		q = new ModifyQuery();
		q.play(param);
	}
	@Override
	public void delete(Map<?,?> param) {
		System.out.println("dao delete메소드 내부");
		q = new RemoveQuery();
		q.play(param);
	}
	@Override
	public MemberBean login(Map<?,?> param) {
		System.out.println("dao login메소드 내부");
		q = new LoginQuery();
		q.play(param);
		return (q.getList().isEmpty()?null:(MemberBean) q.getList().get(0));
	}
}
