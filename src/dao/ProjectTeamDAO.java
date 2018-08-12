package dao;

import java.util.List;

import domain.ProjectTeamBean;

public interface ProjectTeamDAO {
	public void insertProjectTeam(ProjectTeamBean projectTeamBean);
	public List<ProjectTeamBean> selectProjectTeamList();
	public List<ProjectTeamBean> selectProjectTeamName(String word);
	public ProjectTeamBean selectProjectTeamOne(ProjectTeamBean projectTeamBean);
	public int countTeam();
	public void updateTeam(ProjectTeamBean projectTeamBean);
	public void deleteTeam(ProjectTeamBean projectTeamBean);
}
