package com.load.files.client.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Pais implements IDefaultModel {
    private String Uf;
    private String PortugueseName;
    private String EnglishName;
}
