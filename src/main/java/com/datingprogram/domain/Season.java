package com.datingprogram.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Season {
    private Long id;
    private Programs programs;
    private Integer seasonNumber;
    private String title;

    private LocalDate startEpisodeDate;
    private LocalDate endEpisodeDate;
    private Integer startEpisodeNumber;
    private Integer endEpisodeNumber;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
