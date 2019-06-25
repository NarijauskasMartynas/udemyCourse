package io.udemy.ppmtool.services;

import io.udemy.ppmtool.domain.Project;
import io.udemy.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdate(Project project){

        //All the logic goes there

        return projectRepository.save(project);
    }
}
