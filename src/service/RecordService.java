package service;

import java.util.List;

import domain.RecordBean;

public interface RecordService {
	public void createRecord(RecordBean recordBean);
	public void createGrade();
	public void createAvg();
	public List<RecordBean> findByAll();
	public List<RecordBean> findBySome(String word);
	public RecordBean findByOne(RecordBean recordBean);
	public int count();
	public void updateRecord(RecordBean recordBean);
	public void dropRecord(RecordBean recordBean);
}
