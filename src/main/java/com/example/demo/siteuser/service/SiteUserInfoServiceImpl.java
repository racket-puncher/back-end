package com.example.demo.siteuser.service;

import com.example.demo.repository.SiteUserRepository;
import com.example.demo.siteuser.dto.SiteUserInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class SiteUserInfoServiceImpl implements SiteUserInfoService{
    private final SiteUserRepository siteUserRepository;

    @Override
    public SiteUserInfoDto getUser(Long userId, SiteUserInfoDto siteUserInfoDto) {
        return SiteUserInfoDto.fromEntity(siteUserRepository.findById(userId).get());
    }

}
