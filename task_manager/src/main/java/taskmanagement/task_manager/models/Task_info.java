
package taskmanagement.task_manager.models;

public class Task_info {
    private String name;
    private String desc;
    private boolean status;
    public Task_info(){
        
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Task_info(String name, String desc) {
        this.name = name;
        this.desc = desc;
        this.status = false;

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

}
