package com.SBApplication.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SBApplication.Beans.Hobby;
import com.SBApplication.Repos.HobbyRepository;

@Service
public class HobbyService {

	@Autowired
    private HobbyRepository hobbyRepository;

    @Transactional
    public Hobby saveHobby(Hobby hobby) {
        return hobbyRepository.save(hobby);
    }
}
