package com.k.mongodb.project.arrayobj.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "cs_exam_ques")
@TypeAlias("examQues")
@Data
public class ExamQues {
    @Id
    @Indexed
    private String quesId;
    private String quesAns;
    private List<ExamOption> opts;
}
