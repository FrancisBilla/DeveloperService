package io.turnatabl.DevelopersService.dao;

import io.turnatabl.DevelopersService.models.Develop;
import io.turnatabl.DevelopersService.models.ProjectLogging;

import java.util.List;

public interface ProjectLoggingDAO {


    void addHours(ProjectLogging projectLogging);
    List<ProjectLogging> getAllProjectLogging();
    void addVacation(ProjectLogging projectLogging);
    void addSick(ProjectLogging projectLogging);
//     getTaskByID(Integer emp_id);
}
