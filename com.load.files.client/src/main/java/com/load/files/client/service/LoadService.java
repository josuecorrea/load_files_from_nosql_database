package com.load.files.client.service;


import com.load.files.client.enums.DocumentType;
import com.load.files.client.models.IDefaultModel;

import com.load.files.client.repository.interfaces.IFileRepository;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.File;
import java.util.List;

@Service
@Log4j2
public class LoadService implements ILoadService {

    @Autowired
    private IFileRepository _fileRepository;
    @Autowired
    private IFileRegister _fileRegister;
    @Autowired
    private IModelBuilder _modelBuilder;

    Logger logger = LoggerFactory.getLogger(LoadService.class);

    @Override
    public void loadExecute(String path) {
        try{
            List<File> files = _fileRepository.GetAllFiles(path);

            Long totalFiles = files.stream().count();

            for (int i = 0; i < totalFiles; i++){
                var result = _fileRepository.readAllLines(files.get(i).getAbsolutePath());

                transformData(result, files.get(i).getName());
            }

            logger.info("Files missings ::::" + totalFiles);

        }catch (Exception ex){
            logger.error("An error ocurred while read files from directory:::", ex);
        }
    }

    private void transformData(List<String> lines, String fileName){
        DocumentType documentType = _fileRegister.getDocumentType(fileName);

        var result = createModel(lines, documentType);

        //call insert cache
    }

    private List<IDefaultModel> createModel (List<String> lines, DocumentType type){
            return  _modelBuilder.Create(lines, type );
    }
}

