package com.k.mongodb.operators.vo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "ques")
@TypeAlias("Ques")
public class Ques {
    @Id
    private String quesId;
    private String quesAns;
    @Indexed
    private Integer num;
    private Integer num1;
    private Integer num2;
    private List<Integer> nums;
    private List<Opt> opts;
    private Date dateOpt;
}
