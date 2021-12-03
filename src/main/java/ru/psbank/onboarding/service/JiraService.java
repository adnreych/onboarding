package ru.psbank.onboarding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.psbank.onboarding.model.JiraTaskEntity;
import ru.psbank.onboarding.repository.JiraPageRepository;


/**
 * Слой бизнес-логики для задач Jira
 */
@Service
public class JiraService {

    private final JiraPageRepository jiraPageRepository;

    @Autowired
    public JiraService(JiraPageRepository jiraPageRepository) {
        this.jiraPageRepository = jiraPageRepository;
    }

    public Iterable<JiraTaskEntity> getAll(Long userId) {
        return jiraPageRepository.findAllByUserId(userId);
    }

}
