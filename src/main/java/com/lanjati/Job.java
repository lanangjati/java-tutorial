package com.lanjati;

/**
 * @author Lanang Jati
 */
public class Job {
    private String name;
    private int salary;
    private String tools;

    public Job(String name, int salary, String tools) {
        this.name = name;
        this.salary = salary;
        this.tools = tools;
    }

    public void doingJob() {
        System.out.println("Job.doingJob() called");
    }

    public void usingTools() {
        System.out.println("Job.usingTools() called  : " + name + " using " + tools);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }
}
