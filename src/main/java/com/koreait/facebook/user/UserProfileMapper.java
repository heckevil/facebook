package com.koreait.facebook.user;

import com.koreait.facebook.user.model.UserProfileEntity;
import org.apache.ibatis.annotations.Mapper;
import sun.plugin.util.UserProfile;

@Mapper
public interface UserProfileMapper {
    int insUserProfile(UserProfileEntity param);
}
