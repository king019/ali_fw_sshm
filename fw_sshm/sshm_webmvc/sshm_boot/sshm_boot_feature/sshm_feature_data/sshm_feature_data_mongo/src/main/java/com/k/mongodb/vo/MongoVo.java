package com.k.mongodb.vo;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "mongoVoDoc")
@TypeAlias("clazzName")
public class MongoVo {
    private String optId = "id_" + UUID.randomUUID().toString();
    private String optName = "name_" + UUID.randomUUID().toString();
}
