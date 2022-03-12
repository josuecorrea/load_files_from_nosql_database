package com.load.files.client.service;

import com.load.files.client.enums.DocumentType;
import com.load.files.client.models.IDefaultModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IModelBuilder {
    List<IDefaultModel> Create(List<String> lines, DocumentType type);
}
