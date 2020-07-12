package model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Task {
     private int id;
    private String taskName;
    private String shortDescription;
    private Date date_event;
    private Time time_start_event;
    private Time start_for_car;
    private String venue;
    private List<User> employee;
    private String techTask;
    private boolean tmTask;

    public Task(int id, String taskName, String shortDescription, Date date_event, Time time_start_event, Time start_for_car, String venue, List<User> employee, String techTask, boolean tmTask) {
        this.id = id;
        this.taskName = taskName;
        this.shortDescription = shortDescription;
        this.date_event = date_event;
        this.time_start_event = time_start_event;
        this.start_for_car = start_for_car;
        this.venue = venue;
        this.employee = employee;
        this.techTask = techTask;
        this.tmTask = tmTask;
    }


    public Task(String taskName, String shortDescription, Date date_event, Time time_start_event) {
        this.taskName = taskName;
        this.shortDescription = shortDescription;
        this.date_event = date_event;
        this.time_start_event = time_start_event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Date getDate_event() {
        return date_event;
    }

    public void setDate_event(Date date_event) {
        this.date_event = date_event;
    }

    public Time getTime_start_event() {
        return time_start_event;
    }

    public void setTime_start_event(Time time_start_event) {
        this.time_start_event = time_start_event;
    }

    public Time getStart_for_car() {
        return start_for_car;
    }

    public void setStart_for_car(Time start_for_car) {
        this.start_for_car = start_for_car;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public List<User> getEmployee() {
        return employee;
    }

    public void setEmployee(List<User> employee) {
        this.employee = employee;
    }

    public String getTechTask() {
        return techTask;
    }

    public void setTechTask(String techTask) {
        this.techTask = techTask;
    }

    public boolean isTmTask() {
        return tmTask;
    }

    public void setTmTask(boolean tmTask) {
        this.tmTask = tmTask;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", date_event=" + date_event +
                ", time_start_event=" + time_start_event +
                ", start_for_car=" + start_for_car +
                ", venue='" + venue + '\'' +
                ", employee=" + employee +
                ", techTask='" + techTask + '\'' +
                ", tmTask=" + tmTask +
                '}';
    }
}
