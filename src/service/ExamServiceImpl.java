package service;

import java.util.List;

import dao.ExamDAO;
import dao.ExamDAOImple;
import dao.RecordDAOImpl;
import dao.SubjectDAOImpl;
import domain.ExamBean;
import domain.RecordBean;
import domain.SubjectBean;

public class ExamServiceImpl implements ExamService{
	private static ExamService instance = new ExamServiceImpl();
	public static ExamService getInstance() {return instance;}
	private ExamServiceImpl() {}
	@Override
	public void createExam(ExamBean examBean) {
		System.out.println("examService가 받은 examBean : " + examBean);
		String[] subjectsScore = examBean.getScore().split("/");
		String[] subjects = {"JAVA","SQL","R","HTML5","PYTHON"};
		
		System.out.println("record table insert");
		RecordBean rb= new RecordBean();
		int sum = 0;
		for(int i=0;i<5;i++) {
			sum += Integer.parseInt(subjectsScore[i]);
		}
		int avg = sum/5;
		rb.setAvg(String.valueOf(avg));
		rb.setGrade("B");
		RecordDAOImpl.getInstance().insertRecord(rb);
		ExamBean[] exams = new ExamBean[5]; 
		for(int i=0;i<5;i++) {
			exams[i] = new ExamBean();
			exams[i].setMemId(examBean.getMemId());
			exams[i].setMonth(examBean.getMonth());
			exams[i].setScore(subjectsScore[i]);
			//exams[i].setExamSeq(score[i]); // 이건 여기서 안해도 된데
			exams[i].setSubSeq(SubjectDAOImpl.getInstance().selectSubjectsome(subjects[i]).get(0).getSubSeq());
			exams[i].setRecordSeq(RecordDAOImpl.getInstance().selectRecordOne(rb).getRecordSeq());
			ExamDAOImple.getInstance().insertExam(exams[i]);
		}
		System.out.println("service 완료");
		
		
		//RecordServiceImpl.getInstance().createRecord(rb); 
		//트랜잭션? dao객체를 통해 insert를 수행해도 실제로 바로 db로 들어가는것이 아님
		//그렇기에 디비에 넣었다고 생각하고 다시 seq값을 바로 불러오지 못함  commit이 완료되야 db에 반영된다.
		//그래서 RecordDAOImpl.getInstance().selectFirstRowNum() 메소드를 새로 만들어서
		//가장 최근의 rownum? 을 갖고오는 형식으로 로직을 짠 것.
		//.... 보류 된대 바로 db반영 
 		/*for(int i=0;i<5;i++) {
			exams[i].setRecordSeq(RecordDAOImpl.getInstance().selectFirstRowNum());
		}*/
	}
	@Override
	public List<ExamBean> findByAll() {
		// TODO Auto-generated method stub
		return ExamDAOImple.getInstance().selectExamList();
	};
	@Override
	public List<ExamBean> findBySome(String word) {
		// TODO Auto-generated method stub
		return ExamDAOImple.getInstance().selectExamSome(word);
	}
	@Override
	public void updateExam(ExamBean examBean) {
		ExamDAOImple.getInstance().updateExam(examBean);
		
	}
	@Override
	public void dropExam(ExamBean examBean) {
		ExamDAOImple.getInstance().deleteExam(examBean);
		
	}
	
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return ExamDAOImple.getInstance().countExam();
	}
	@Override
	public ExamBean findByOne(ExamBean examBean) {
		return ExamDAOImple.getInstance().selectExamOne(examBean);
	}
	
	
}
