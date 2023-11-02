package com.example.demo.siteuser.controller;

import com.example.demo.siteuser.dto.SiteUserInfoDto;
import com.example.demo.siteuser.service.SiteUserInfoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users/profile")
public class SiteUserInfoController {
    private final SiteUserInfoServiceImpl siteUserInfoService;

    @GetMapping("/{siteuser-id}")
    public ResponseEntity<SiteUserInfoDto> getUser(@PathVariable("siteuser-id") Long userId, SiteUserInfoDto siteUserInfoDto) {
        return new ResponseEntity<>(siteUserInfoDto, HttpStatus.OK);
    }
}