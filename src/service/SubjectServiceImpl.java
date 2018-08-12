package service;

import java.util.List;

import dao.SubjectDAOImpl;
import domain.SubjectBean;

public class SubjectServiceImpl implements SubjectService {
	private static SubjectService instance = new SubjectServiceImpl();
	public static SubjectService getInstance() {return instance;}
	private SubjectServiceImpl() {}
	
	
	@Override
	public void createSubject(SubjectBean subjectBean) {
		SubjectDAOImpl.getInstance().insertSubject(subjectBean);
	}
	@Override
	public List<SubjectBean> findByAll() {
		return SubjectDAOImpl.getInstance().selectSubjectList();
	}
	@Override
	public List<SubjectBean> findBySome(String word) {
		return SubjectDAOImpl.getInstance().selectSubjectsome(word);
	}
	@Override
	public SubjectBean findByOne(SubjectBean subjectBean) {
		return SubjectDAOImpl.getInstance().selectSubjectOne(subjectBean);
	}
	@Override
	public int count() {
		return SubjectDAOImpl.getInstance().countSubject();
	}
	@Override
	public void updateSome(SubjectBean subjectBean) {
		SubjectDAOImpl.getInstance().updateSubject(subjectBean);
	}
	@Override
	public void dropSubject(SubjectBean subjectBean) {
		SubjectDAOImpl.getInstance().deleteSubject(subjectBean);
	}
	
}
