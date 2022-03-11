package com.load.files.client.repository.interfaces;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Repository
public interface IFileRepository {

    List<String> readAllLines(String path) throws IOException;
    List<File> GetAllFiles(String path);
}
