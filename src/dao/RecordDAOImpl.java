package dao;

import java.util.List;

import domain.RecordBean;

public class RecordDAOImpl implements RecoredDAO{
	public static RecoredDAO instance = new RecordDAOImpl();
	public static RecoredDAO getInstance() {return instance;}
	private RecordDAOImpl() {}
	@Override
	public void insertRecord(RecordBean recordBean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<RecordBean> selectRecordList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<RecordBean> selectRecordsome(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public RecordBean selectRecordOne(RecordBean recordBean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countRecord() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void updateRecord(RecordBean recordBean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteRecord(RecordBean recordBean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String selectFirstRowNum() {
		// TODO Auto-generated method stub
		return null;
	}


}
