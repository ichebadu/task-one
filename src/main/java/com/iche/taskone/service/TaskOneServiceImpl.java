package com.iche.taskone.service;

import com.iche.taskone.dto.response.UserResponse;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Service
public class TaskOneServiceImpl implements TaskOneService{
    public UserResponse getUser(String slack_name, String track){
        return UserResponse.builder()
                .slack_name(slack_name)
                .current_day(currentDay())
                .utc_time(currentUtcTime())
                .github_file_url("https://github.com/ichebadu/taskone/blob/main/target/HNG-0.0.1-SNAPSHOT.jar")
                .github_repo_url("https://github.com/ichebadu/task-one")
                .build();
    }

    private static String currentUtcTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss 'Z");
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(formatter);
    }

    private static String currentDay() {
        DayOfWeek dayOfWeek = LocalDateTime.now(ZoneId.of("UTC")).getDayOfWeek();
        return dayOfWeek.toString();
    }
}
