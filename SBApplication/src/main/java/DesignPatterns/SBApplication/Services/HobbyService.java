package DesignPatterns.SBApplication.Services;

import javax.transaction.Transactional;

import DesignPatterns.SBApplication.Repos.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DesignPatterns.SBApplication.Beans.Hobby;

@Service
public class HobbyService {

	@Autowired
    private HobbyRepository hobbyRepository;

    @Transactional
    public Hobby saveHobby(Hobby hobby) {
        return hobbyRepository.save(hobby);
    }
}
