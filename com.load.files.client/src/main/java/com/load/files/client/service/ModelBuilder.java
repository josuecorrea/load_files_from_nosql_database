package com.load.files.client.service;

import com.load.files.client.enums.DocumentType;
import com.load.files.client.models.IDefaultModel;
import com.load.files.client.models.Pais;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModelBuilder implements IModelBuilder{

    @Override
    public List<IDefaultModel> Create(List<String> lines, DocumentType type) throws ClassNotFoundException {
        List<IDefaultModel> dnes = new ArrayList<>();

        for (int i = 0; i < lines.stream().count(); i++) {

            var line = lines.get(i);
            var lineSplit = line.split("@");

            if (type == DocumentType.DnePais){
                Pais pais = new  Pais.builder();

                dnes.add(pais);
            }
        }

        return dnes;
    }
}
