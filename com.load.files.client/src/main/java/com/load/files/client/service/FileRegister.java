package com.load.files.client.service;

import com.load.files.client.enums.DocumentType;
import org.springframework.stereotype.Service;

import java.util.Dictionary;
import java.util.Hashtable;

@Service
public class FileRegister implements IFileRegister {

    private Dictionary<String, DocumentType> documentRegister = new Hashtable();

    public FileRegister(){
        documentRegister.put("ECT_PAIS.TXT", DocumentType.DnePais);
        documentRegister.put("LOG_BAIRRO.TXT", DocumentType.DneBairro);
        documentRegister.put("LOG_LOCALIDADE.TXT", DocumentType.DneLocalidade);
        documentRegister.put("LOG_FAIXA_UF.TXT", DocumentType.DneUf);
        documentRegister.put("LOG_LOGRADOURO_AC.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_AL.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_AM.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_AP.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_BA.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_CE.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_DF.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_ES.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_GO.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_MA.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_MG.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_MS.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_PA.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_PB.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_PE.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_PI.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_RJ.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_RN.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_RR.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_RS.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_SC.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_SE.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_SP.TXT", DocumentType.DneLogradouro);
        documentRegister.put("LOG_LOGRADOURO_TO.TXT", DocumentType.DneLogradouro);
    }

    public DocumentType getDocumentType(String fileName) {
        return documentRegister.get(fileName);
    }
}
