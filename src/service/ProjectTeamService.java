package service;

import java.util.List;

import domain.ProjectTeamBean;

public interface ProjectTeamService {
	public void createTeam(ProjectTeamBean projectTeamBean);
	public List<ProjectTeamBean> findByAll();
	public ProjectTeamBean findById(ProjectTeamBean projectTeamBean);
	public List<ProjectTeamBean> findBySome(String word);
	public int count();
	public void updateSome(ProjectTeamBean projectTeamBean);
	public void dropTeam(ProjectTeamBean projectTeamBean);
}
