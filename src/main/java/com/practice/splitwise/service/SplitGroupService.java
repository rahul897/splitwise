package com.practice.splitwise.service;

import com.practice.splitwise.dto.AddfrienDTO;
import com.practice.splitwise.model.Person;
import com.practice.splitwise.model.SplitGroup;
import com.practice.splitwise.repo.PersonRepository;
import com.practice.splitwise.repo.SplitGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SplitGroupService {

    @Autowired
    private SplitGroupRepository groupRepository;

    @Autowired
    private PersonRepository personRepository;


    public SplitGroup createGroup(String name) {
        SplitGroup splitGroup = new SplitGroup();
        splitGroup.setName(name);
        return groupRepository.save(splitGroup);
    }


    public String addFriend(AddfrienDTO addfrienDTO) {
        SplitGroup splitGroup = groupRepository.findById(addfrienDTO.getGroupId()).get();
        return "ho";
    }
}
