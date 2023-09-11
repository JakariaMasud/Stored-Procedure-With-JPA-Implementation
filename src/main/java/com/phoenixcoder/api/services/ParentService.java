package com.phoenixcoder.api.services;

import com.phoenixcoder.api.models.Parent;

public interface ParentService {
    Parent addParent(Parent parent);
    void deleteParent(int parentId);
    Parent updateParent(int id, Parent parent);

    Parent getParentById(int id);
}
