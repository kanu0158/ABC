package service;

import java.util.List;

import domain.SubjectBean;

public interface SubjectService {
	public void createSubject(SubjectBean subjectBean);
	public List<SubjectBean> findByAll();
	public List<SubjectBean> findBySome(String word);
	public SubjectBean findByOne(SubjectBean subjectBean);
	public int count();
	public void updateSome(SubjectBean subjectBean);
	public void dropSubject(SubjectBean subjectBean);
	

}
