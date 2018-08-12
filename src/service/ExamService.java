package service;

import java.util.List;

import domain.ExamBean;

public interface ExamService {
	public void createExam(ExamBean examBean);
	public List<ExamBean> findByAll();
	public List<ExamBean> findBySome(String word);
	public ExamBean findByOne(ExamBean examBean);
	public int count();
	public void updateExam(ExamBean examBean);
	public void dropExam(ExamBean examBean);
}
