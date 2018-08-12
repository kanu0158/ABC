package dao;

import java.util.List;

import domain.ExamBean;
import domain.MemberBean;

public interface ExamDAO {
	public void insertExam(ExamBean examBean);
	public List<ExamBean> selectExamList();
	public List<ExamBean> selectExamSome(String word);
	public ExamBean selectExamOne(ExamBean examBean);
	public int countExam();
	public void updateExam(ExamBean examBean);
	public void deleteExam(ExamBean examBean);
}



