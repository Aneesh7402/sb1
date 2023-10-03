package taskmanagement.task_manager.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import taskmanagement.task_manager.models.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/home")
public class controller {
    @Autowired
    private WebClient.Builder web_client_builder;
    

    @RequestMapping("/{userID}")
    public List<TaskItem> getItems(@PathVariable("userID") String userID){
        List<deadline> deadlines=web_client_builder.build().get().uri("http://deadline-deployment.default.svc.cluster.local:8083/home/"+userID).retrieve().bodyToFlux(deadline.class).collectList().block();
        return deadlines.stream().map(dl->{
            Task_info item=web_client_builder.build().get().uri("http://task-info-deployment.default.svc.cluster.local:8083/home/"+dl.getTaskid()).retrieve().bodyToMono(Task_info.class).block();
            return new TaskItem(item.getName(),item.getDesc(),item.isStatus(),dl.getDeadLine());
        }).collect(Collectors.toList());
    } 
}
