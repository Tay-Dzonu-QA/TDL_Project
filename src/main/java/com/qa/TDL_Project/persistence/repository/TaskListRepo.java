package com.qa.TDL_Project.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.TDL_Project.persistence.domain.TaskList;

@Repository
public interface TaskListRepo extends JpaRepository<TaskList,Long> {
	
	@Query(value ="SELECT * FROM Task_List ORDER BY priority DESC", nativeQuery = true)
    List<TaskList> orderByPriorityJPQL();
	
	@Query(value ="SELECT * FROM Task_List ORDER BY task_list_name", nativeQuery = true)
    List<TaskList> orderByNameJPQL();
	
	@Query(value ="SELECT id FROM Task_List ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Long LastID();


}
