package com.iche.taskone.service;

import com.iche.taskone.dto.response.UserResponse;

public interface TaskOneService {

    UserResponse getUser(String slack_name, String track);
}
