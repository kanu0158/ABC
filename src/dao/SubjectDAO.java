package dao;

import java.util.List;

import domain.RecordBean;
import domain.SubjectBean;

public interface SubjectDAO {
	public void insertSubject(SubjectBean subjectBean);
	public List<SubjectBean> selectSubjectList();
	public List<SubjectBean> selectSubjectsome(String word);
	public SubjectBean selectSubjectOne(SubjectBean subjectBean);
	public int countSubject();
	public void updateSubject(SubjectBean subjectBean);
	public void deleteSubject(SubjectBean subjectBean);
}
