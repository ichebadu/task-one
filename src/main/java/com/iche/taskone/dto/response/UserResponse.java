package com.iche.taskone.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String slack_name;
    private String current_day;
    private String utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;

}
