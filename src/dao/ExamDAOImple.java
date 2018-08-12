package dao;

import java.util.List;

import domain.ExamBean;

public class ExamDAOImple implements ExamDAO {
	public static ExamDAO instance = new ExamDAOImple();
	public static ExamDAO getInstance() {return instance;}
	private ExamDAOImple() {}
	@Override
	public void insertExam(ExamBean examBean) {
		System.out.println("examDAO : " + examBean);
	}
	@Override
	public List<ExamBean> selectExamList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ExamBean> selectExamSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ExamBean selectExamOne(ExamBean examBean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countExam() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void updateExam(ExamBean examBean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteExam(ExamBean examBean) {
		// TODO Auto-generated method stub
		
	}
	
}
