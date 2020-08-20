package quinnox.sam.projectrequirementportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quinnox.sam.projectrequirementportal.entity.Applied;
import quinnox.sam.projectrequirementportal.entity.Project;
import quinnox.sam.projectrequirementportal.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository repo;
	
	public List<Project> listAll()

	{
		return repo.findAll();
		
	}
	public void save(Project project)
	{
		repo.save(project);
	}
	public Project get(Long id)
	{
		return repo.findById(id).get();
	}
	public void delete(Long id)
	{
		repo.deleteById(id);
	}
	public List<Project> findprojectByname(String name) {
		return repo.findByname(name);
	}
	


}
