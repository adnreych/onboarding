package ru.psbank.onboarding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.psbank.onboarding.model.ConfluencePageEntity;
import ru.psbank.onboarding.repository.ConfluencePageRepository;

/**
 * Слой бизнес-логики для страниц Confluence
 */
@Service
public class ConfluenceService {

    private final ConfluencePageRepository confluencePageRepository;

    @Autowired
    public ConfluenceService(ConfluencePageRepository confluencePageRepository) {
        this.confluencePageRepository = confluencePageRepository;
    }

    public Iterable<ConfluencePageEntity> getAll() {
        return confluencePageRepository.findAll();
    }
}
