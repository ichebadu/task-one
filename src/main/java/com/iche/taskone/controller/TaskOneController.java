package com.iche.taskone.controller;

import com.iche.taskone.dto.response.UserResponse;
import com.iche.taskone.service.TaskOneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TaskOneController {
    private TaskOneService taskOneService;

    @GetMapping("/api")
    public UserResponse getUser(@RequestParam ("slack_name") String slack_name,
                                @RequestParam("track") String track){
        return taskOneService.getUser(slack_name,track);

    }
}
