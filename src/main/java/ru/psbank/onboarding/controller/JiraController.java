package ru.psbank.onboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.psbank.onboarding.model.JiraTaskEntity;
import ru.psbank.onboarding.service.JiraService;

/**
 * Слой обработки заросов задач Jira от клиентской части
 */
@CrossOrigin
@RestController
public class JiraController {


	private final JiraService jiraService;

	@Autowired
	public JiraController(JiraService jiraService) {
		this.jiraService = jiraService;
	}

	@GetMapping("/api/tasks")
	public Iterable<JiraTaskEntity> tasks(Long userId) {
		return jiraService.getAll(userId);
	}

}
