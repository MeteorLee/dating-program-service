package com.datingprogram.domain;

import java.time.LocalDateTime;

public class UserAccount {
    private Long id;
    private String username;
    private String password;
    private String email;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
