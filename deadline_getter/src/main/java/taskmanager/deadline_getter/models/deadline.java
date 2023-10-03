
package taskmanager.deadline_getter.models;
import java.time.LocalDateTime;

public class deadline{
    private int taskid;
    private LocalDateTime DeadLine;

    public deadline(int taskid, LocalDateTime DeadLine) {
        this.taskid = taskid;
        this.DeadLine = DeadLine;
    }
    
   

    /**
     * @return int return the taskid
     */
    public int getTaskid() {
        return taskid;
    }

    /**
     * @param taskid the taskid to set
     */
    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    /**
     * @return LocalDateTime return the DeadLine
     */
    public LocalDateTime getDeadLine() {
        return DeadLine;
    }

    /**
     * @param DeadLine the DeadLine to set
     */
    public void setDeadLine(LocalDateTime DeadLine) {
        this.DeadLine = DeadLine;
    }

}