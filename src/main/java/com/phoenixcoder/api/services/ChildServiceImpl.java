package com.phoenixcoder.api.services;

import com.phoenixcoder.api.models.Child;
import com.phoenixcoder.api.models.Parent;
import com.phoenixcoder.api.repositories.ChildRepository;
import com.phoenixcoder.api.repositories.ParentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChildServiceImpl implements ChildService{
    private final ChildRepository childRepository;
    private final ParentRepository parentRepository;

    @Override
    public Child addChild(Child child,int parentId) {
        Parent parent = parentRepository.findById(parentId).get();
        child.setParent(parent);
        return childRepository.save(child);
    }

    @Override
    public void deleteChild(int id) {
        childRepository.deleteById(id);
    }

    @Override
    public Child updateChild(int id, Child child) {
        child.setId(id);
        return childRepository.save(child);
    }

    @Override
    public Child getChildById(int id) {
        return childRepository.findById(id).get();
    }
}
