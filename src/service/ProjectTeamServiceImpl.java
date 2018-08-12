package service;

import java.util.List;

import dao.ProjectTeamDAOImpl;
import domain.ProjectTeamBean;

public class ProjectTeamServiceImpl implements ProjectTeamService{
	private static ProjectTeamService instance = new ProjectTeamServiceImpl();
	public static ProjectTeamService getInstance() {return instance;}
	private ProjectTeamServiceImpl() {}
	@Override
	public void createTeam(ProjectTeamBean projectTeamBean) {
		ProjectTeamDAOImpl.getInstance().insertProjectTeam(projectTeamBean);
		
	}
	@Override
	public List<ProjectTeamBean> findByAll() {
		return ProjectTeamDAOImpl.getInstance().selectProjectTeamList();
	}
	@Override
	public ProjectTeamBean findById(ProjectTeamBean projectTeamBean) {
		return ProjectTeamDAOImpl.getInstance().selectProjectTeamOne(projectTeamBean);
	}
	@Override
	public List<ProjectTeamBean> findBySome(String word) {
		return ProjectTeamDAOImpl.getInstance().selectProjectTeamName(word);
	}
	@Override
	public int count() {
		return ProjectTeamDAOImpl.getInstance().countTeam();
	}
	@Override
	public void updateSome(ProjectTeamBean projectTeamBean) {
		ProjectTeamDAOImpl.getInstance().updateTeam(projectTeamBean);
	}
	@Override
	public void dropTeam(ProjectTeamBean projectTeamBean) {
		ProjectTeamDAOImpl.getInstance().deleteTeam(projectTeamBean);
	}

}
