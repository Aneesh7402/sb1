package taskmanager.task_info_getter.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import taskmanager.task_info_getter.models.Task_info;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/home")
public class controller {
    @Autowired
    private WebClient.Builder web_client_builder;
    

    @RequestMapping("/{taskID}")
    public Task_info getItems(@PathVariable("taskID") String taskID){
        return new Task_info("Important","Finish this");
    } 
}
