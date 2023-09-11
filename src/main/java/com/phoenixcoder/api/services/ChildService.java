package com.phoenixcoder.api.services;

import com.phoenixcoder.api.models.Child;

public interface ChildService {
    Child addChild(Child child,int parentId);
    void deleteChild(int id);
    Child updateChild(int id,Child child);

    Child getChildById(int id);
}
