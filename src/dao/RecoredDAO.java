package dao;

import java.util.List;

import domain.ExamBean;
import domain.RecordBean;

public interface RecoredDAO {
	public void insertRecord(RecordBean recordBean);
	public List<RecordBean> selectRecordList();
	public List<RecordBean> selectRecordsome(String word);
	public RecordBean selectRecordOne(RecordBean recordBean);
	public int countRecord();
	public void updateRecord(RecordBean recordBean);
	public void deleteRecord(RecordBean recordBean);
	public String selectFirstRowNum();//AES순 1번이 최근
}
