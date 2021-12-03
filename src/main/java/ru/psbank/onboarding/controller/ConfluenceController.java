package ru.psbank.onboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.psbank.onboarding.model.ConfluencePageEntity;
import ru.psbank.onboarding.service.ConfluenceService;

/**
 * Слой обработки заросов страниц Confluence от клиентской части
 */
@CrossOrigin
@RestController
public class ConfluenceController {

    private final ConfluenceService confluenceService;

    @Autowired
    public ConfluenceController(ConfluenceService confluenceService) {
        this.confluenceService = confluenceService;
    }

    @GetMapping("/api/pages")
    public Iterable<ConfluencePageEntity> pages() {
        return confluenceService.getAll();
    }
}
