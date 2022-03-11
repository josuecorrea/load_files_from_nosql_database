package com.load.files.client.service;

import com.load.files.client.enums.DocumentType;

public interface IFileRegister {
    DocumentType getDocumentType(String fileName);
}
