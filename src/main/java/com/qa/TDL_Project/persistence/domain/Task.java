package com.qa.TDL_Project.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
//@ToString
//@EqualsAndHashCode
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "task_name")
	@NotNull
	@Size(min = 1, max = 120)
	private String name;

	@Column(name = "priority")
	private Integer priority;
	
	@ManyToOne//(targetEntity = Channel.class)
	private TaskList taskList;

}
