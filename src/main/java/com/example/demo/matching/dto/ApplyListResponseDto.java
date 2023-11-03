package com.example.demo.matching.dto;

import com.example.demo.type.ApplyStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ApplyListResponseDto {
    private long applyId;
    private long siteUserId;
    private String nickname;
    private ApplyStatus applyStatus;
}
