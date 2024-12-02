package org.example.entity;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {
    public Set<Task> annsTask;
    public Set<Task> bobsTask;
    public Set<Task> carolsTask;
    public Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTask, Set<Task> unassignedTasks, Set<Task> carolsTask, Set<Task> bobsTask) {
        this.annsTask = annsTask;
        this.unassignedTasks = unassignedTasks;
        this.carolsTask = carolsTask;
        this.bobsTask = bobsTask;
    }

    public Set<Task> getTasks(String name){
        switch (name){
            case "ann":
                return this.annsTask;
            case "bob":
                return this.bobsTask;

            case "carol":
                return this.carolsTask;

            case "all":
                return getUnion(bobsTask,annsTask,carolsTask);

        }
        return new HashSet<>();
    }

    public Set<Task> getUnion(Set<Task>... sets){
        HashSet<Task> allTasks = new LinkedHashSet<>();
        for(Set<Task> tasks:sets){
            allTasks.addAll(tasks);
        }
        return allTasks;
    }

    public Set<Task> getIntersection(Set<Task> first, Set<Task> second){
        Set<Task> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public Set<Task> getDifferences(Set<Task> first, Set<Task> second){
        Set<Task> differences = new HashSet<>(first);
        differences.removeAll(second);
        return differences;
    }

    public Set<Task> getAnnsTask() {
        return annsTask;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getCarolsTask() {
        return carolsTask;
    }

    public Set<Task> getBobsTask() {
        return bobsTask;
    }
}
