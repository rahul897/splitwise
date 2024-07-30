package com.practice.splitwise.controller;

import com.practice.splitwise.dto.AddfrienDTO;
import com.practice.splitwise.model.SplitGroup;
import com.practice.splitwise.repo.SplitGroupRepository;
import com.practice.splitwise.service.SplitGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private SplitGroupService groupService;



    @PostMapping("/group")
    public SplitGroup createGroup(@Validated @RequestBody String name){
        return groupService.createGroup(name);

    }

    @PostMapping("/addfriend")
    public String addFriend(@Validated @RequestBody AddfrienDTO addfrienDTO){
        return groupService.addFriend(addfrienDTO);

    }



}
