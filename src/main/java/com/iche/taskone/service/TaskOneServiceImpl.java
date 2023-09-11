package com.iche.taskone.service;

import com.iche.taskone.dto.response.UserResponse;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Service
public class TaskOneServiceImpl implements TaskOneService{
    public UserResponse getUser(String slack_name, String track){
        return UserResponse.builder()
                .slack_name(slack_name)
                .current_day(currentDay())
                .utc_time(currentUtcTime())
                .track(track)
                .github_file_url("https://github.com/ichebadu/task-one/blob/main/target/task-one-0.0.1-SNAPSHOT.jar")
                .github_repo_url("https://github.com/ichebadu/task-one")
                .status_code(200)
                .build();
    }

    private static String currentUtcTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.format(formatter);
    }

    private static String currentDay() {
        DayOfWeek dayOfWeek = LocalDateTime.now(ZoneId.of("UTC")).getDayOfWeek();
        return dayOfWeek.toString().substring(0, 1) + dayOfWeek.toString().substring(1).toLowerCase(Locale.ROOT);
    }
}
