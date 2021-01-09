package com.k.mongodb.project.arrayobj.model;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "cs_exam_ques")
@TypeAlias("examQues")
public class ExamQues {
  @Id
  @Indexed
  private String quesId;
  private String quesAns;
  private List<ExamOption> opts;
  public String getQuesId() {
    return quesId;
  }
  public void setQuesId(String quesId) {
    this.quesId = quesId;
  }
  public String getQuesAns() {
    return quesAns;
  }
  public void setQuesAns(String quesAns) {
    this.quesAns = quesAns;
  }
  public List<ExamOption> getOpts() {
    return opts;
  }
  public void setOpts(List<ExamOption> opts) {
    this.opts = opts;
  }
}
