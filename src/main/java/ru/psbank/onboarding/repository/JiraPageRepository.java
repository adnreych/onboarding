package ru.psbank.onboarding.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.psbank.onboarding.model.JiraTaskEntity;

@Repository
public interface JiraPageRepository extends CrudRepository<JiraTaskEntity, Long> {
    Iterable<JiraTaskEntity> findAllByUserId(Long userId);
}
