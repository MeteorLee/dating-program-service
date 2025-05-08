package com.datingprogram.domain;

import java.time.LocalDateTime;
import java.util.Set;

public class Programs {
    private Integer id;
    private String title;
    private String platform;
    private String description;
    private Set<CastMember> MC;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
