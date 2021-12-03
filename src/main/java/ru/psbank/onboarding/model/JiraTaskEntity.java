package ru.psbank.onboarding.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "jira_task")
public class JiraTaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column(name = "url", nullable = false, unique = true)
    private String url;

    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;
}