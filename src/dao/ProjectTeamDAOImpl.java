package dao;

import java.util.List;

import domain.ProjectTeamBean;

public class ProjectTeamDAOImpl implements ProjectTeamDAO{
	public static ProjectTeamDAO instance = new ProjectTeamDAOImpl();
	public static ProjectTeamDAO getInstance() {return instance;}
	private ProjectTeamDAOImpl() {}
	@Override
	public void insertProjectTeam(ProjectTeamBean projectTeamBean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<ProjectTeamBean> selectProjectTeamList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProjectTeamBean> selectProjectTeamName(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProjectTeamBean selectProjectTeamOne(ProjectTeamBean projectTeamBean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countTeam() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void updateTeam(ProjectTeamBean projectTeamBean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteTeam(ProjectTeamBean projectTeamBean) {
		// TODO Auto-generated method stub
		
	}

}
