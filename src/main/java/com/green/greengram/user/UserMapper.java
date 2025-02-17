package com.green.greengram.user;

import com.green.greengram.user.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserSignUpReq p);
    UserSignInRes selUserByUid(String uid); //전달하는 파라미터가 primitive type라면 xml파일에서 #{아무거나} 적어도 됨.

    UserInfoGetRes selUserInfo(UserInfoGetReq p);

    int updUserPic(UserPicPatchReq p);
}
