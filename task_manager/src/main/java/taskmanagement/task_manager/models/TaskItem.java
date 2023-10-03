package taskmanagement.task_manager.models;
import java.time.LocalDateTime;
public class TaskItem {
    private String name;
    private String desc;
    private boolean status;
    private LocalDateTime deadline;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public TaskItem(String name, String desc, boolean status, LocalDateTime deadline) {
        this.name = name;
        this.desc = desc;
        this.status = status;
        this.deadline = deadline;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return boolean return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return String return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @return LocalDateTime return the deadline
     */
    public LocalDateTime getDeadline() {
        return deadline;
    }

}
