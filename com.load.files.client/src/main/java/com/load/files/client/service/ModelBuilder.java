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
    public List<IDefaultModel> Create(List<String> lines, DocumentType type) {
        List<IDefaultModel> dnes = new ArrayList<>();

        for (int i = 0; i < lines.stream().count(); i++) {

            var line = lines.get(i);
            var lineSplit = line.split("@");

            if (type == DocumentType.DnePais){
                dnes.add(CreatePaisInstance(lineSplit));
            }
        }

        return dnes;
    }

    private Pais CreatePaisInstance(String[] param)
    {
        Pais pais = new Pais();
        pais.setSigla(param[0]);
        pais.setEnglishName(param[3]);
        pais.setPortugueseName(param[2]);
        return pais;
    }
}
