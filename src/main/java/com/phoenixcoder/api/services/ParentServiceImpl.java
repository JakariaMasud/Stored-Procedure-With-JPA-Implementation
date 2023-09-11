package com.phoenixcoder.api.services;

import com.phoenixcoder.api.models.Parent;
import com.phoenixcoder.api.repositories.ParentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParentServiceImpl implements ParentService{
    private final ParentRepository parentRepository;
    @Override
    public Parent addParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public void deleteParent(int parentId) {
        parentRepository.deleteById(parentId);
    }

    @Override
    public Parent updateParent(int id, Parent parent) {
        parent.setId(id);
       return parentRepository.save(parent);
    }

    @Override
    public Parent getParentById(int id) {
        Parent parent = parentRepository.findById(id).get();
        return parent;
    }
}
