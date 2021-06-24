package com.koreait.facebook.userprofile;

import com.koreait.facebook.user.model.UserProfileEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserProfileMapper {
    int insUserProfile(UserProfileEntity param);
}