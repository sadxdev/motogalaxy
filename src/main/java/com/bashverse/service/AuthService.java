package com.bashverse.service;

import com.bashverse.response.SignupRequest;

public interface AuthService {

    String createUser(SignupRequest req);
}
