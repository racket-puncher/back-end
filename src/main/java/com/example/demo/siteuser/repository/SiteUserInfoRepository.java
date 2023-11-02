package com.example.demo.siteuser.repository;

import com.example.demo.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteUserInfoRepository extends JpaRepository<SiteUser, Long> {
}
