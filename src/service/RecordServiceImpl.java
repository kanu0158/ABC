package service;

import java.util.List;

import dao.RecordDAOImpl;
import domain.RecordBean;

public class RecordServiceImpl implements RecordService {
	private static RecordService instance = new RecordServiceImpl();
	public static RecordService getInstance() {return instance;}
	private RecordServiceImpl() {}
	@Override
	public void createRecord(RecordBean recordBean) {
		createGrade();
		RecordDAOImpl.getInstance().insertRecord(recordBean);
	}
	@Override
	public void createGrade() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void createAvg() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<RecordBean> findByAll() {
		// TODO Auto-generated method stub
		return RecordDAOImpl.getInstance().selectRecordList();
	}
	@Override
	public List<RecordBean> findBySome(String word) {
		// TODO Auto-generated method stub
		return RecordDAOImpl.getInstance().selectRecordsome(word);
	}
	@Override
	public RecordBean findByOne(RecordBean recordBean) {
		// TODO Auto-generated method stub
		return RecordDAOImpl.getInstance().selectRecordOne(recordBean);
	}
	@Override
	public void updateRecord(RecordBean recordBean) {
		RecordDAOImpl.getInstance().updateRecord(recordBean);
		
	}
	@Override
	public void dropRecord(RecordBean recordBean) {
		RecordDAOImpl.getInstance().deleteRecord(recordBean);
		
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return RecordDAOImpl.getInstance().countRecord();
	}

	
	
}
