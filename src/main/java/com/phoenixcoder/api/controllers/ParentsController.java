package com.phoenixcoder.api.controllers;

import com.phoenixcoder.api.models.Parent;
import com.phoenixcoder.api.services.ParentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/parent")
@RequiredArgsConstructor
public class ParentsController {
    private final ParentService parentService;

    @PostMapping("/add")
    public Parent addParent(Parent parent){
        return parentService.addParent(parent);
    }

    @DeleteMapping("/delete/{parentId}")
    public void delete(@PathVariable int parentId){
        parentService.deleteParent(parentId);
    }

    @PostMapping("/update/{parentId}")
    public Parent update(@PathVariable int parentId,Parent parent){
        return parentService.updateParent(parentId,parent);
    }

    @GetMapping("/{parentId}")
    public Parent getParentById(@PathVariable int parentId){
        return parentService.getParentById(parentId);
    }


}
