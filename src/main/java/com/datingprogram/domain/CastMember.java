package com.datingprogram.domain;

import java.time.LocalDateTime;
import java.util.Set;

public class CastMember {
    private Long id;
    private String name;
    private String job;
    private Season season;
    private Set<String> sns;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
