package com.load.files.client.models;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder

public class cep implements IDefaultModel {
    @Id
    public String Id;
}
