package com.phoenixcoder.api.controllers;

import com.phoenixcoder.api.models.Child;
import com.phoenixcoder.api.services.ChildService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/child")
@RequiredArgsConstructor
public class ChildController {
    private final ChildService childService;

    @PostMapping("/add/{parentId}")
    public Child addChild(@RequestBody Child child,@PathVariable int parentId){
        return childService.addChild(child,parentId);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteChild(@PathVariable int id){
        childService.deleteChild(id);
    }
    @PostMapping("/updateChild/{id}")
    public Child updateChild(@PathVariable int id,@RequestBody Child child){
       return childService.updateChild(id,child);
    }
}
