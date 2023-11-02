package com.example.demo.siteuser.service;


import com.example.demo.siteuser.dto.SiteUserInfoDto;

public interface SiteUserInfoService {
    SiteUserInfoDto getUser(Long userId, SiteUserInfoDto siteUserInfoDto);
}
