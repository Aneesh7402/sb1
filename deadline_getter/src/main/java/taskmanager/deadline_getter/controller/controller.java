package taskmanager.deadline_getter.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import taskmanager.deadline_getter.models.deadline;

import java.util.List;
import java.time.LocalDateTime;
import java.util.Arrays;

@RestController
@RequestMapping("/home")
public class controller {
    
    

    @RequestMapping("/{userID}")
    public List<deadline> getItems(@PathVariable("userID") String taskID){
        return Arrays.asList((new deadline(1,LocalDateTime.now())),(new deadline(2,LocalDateTime.now().plusDays(1))),new deadline(2,LocalDateTime.now().plusDays(2)));
    } 
}
