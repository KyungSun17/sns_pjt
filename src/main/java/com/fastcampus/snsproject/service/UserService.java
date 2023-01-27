package com.fastcampus.snsproject.service;

import com.fastcampus.snsproject.Exception.SnsApplicationException;
import com.fastcampus.snsproject.model.User;
import com.fastcampus.snsproject.model.entity.UserEntity;
import com.fastcampus.snsproject.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserEntityRepository userEntityRepository;

    public User join(String userName, String password){
        //회원가입하려는 userName으로 중복체크
        Optional<UserEntity> userEntity = userEntityRepository.findByUserName(userName);

        //회원가입진행
        userEntityRepository.save(new UserEntity());

        return new User();
    }

    public String login(String userName, String password){
        //가입여부체크
        UserEntity userEntity = userEntityRepository.findByUserName(userName).orElseThrow(() -> new SnsApplicationException());

        //비밀번호 등록
        if(!userEntity.getPassword().equals(password)){
            throw new SnsApplicationException();
        }

        //토큰생성

        return "JWT TOKEN";
    }

}
