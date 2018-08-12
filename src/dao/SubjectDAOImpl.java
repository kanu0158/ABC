package dao;

import java.util.List;

import domain.SubjectBean;

public class SubjectDAOImpl implements SubjectDAO {
	public static SubjectDAO instance = new SubjectDAOImpl();
	public static SubjectDAO getInstance() {return instance;}
	private SubjectDAOImpl() {}
	@Override
	public void insertSubject(SubjectBean subjectBean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<SubjectBean> selectSubjectList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<SubjectBean> selectSubjectsome(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SubjectBean selectSubjectOne(SubjectBean subjectBean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countSubject() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void updateSubject(SubjectBean subjectBean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteSubject(SubjectBean subjectBean) {
		// TODO Auto-generated method stub
		
	}
	
}
