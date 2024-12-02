package org.example.entity;

import java.util.Objects;

public class Task {
    private Priority project;
    private String description;
    private Status assignee;
    private String status;
    private String priority;

    public Task(String priority, String status, String description, Status assignee, Priority project) {
        this.priority = priority;
        this.status = status;
        this.description = description;
        this.assignee = assignee;
        this.project = project;
    }

    public Priority getProject() {
        return project;
    }

    public String getPriority() {
        return priority;
    }

    public Status getStatus() {
        return Status.valueOf(status);
    }

    public Status getAssignee() {
        return assignee;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

}
