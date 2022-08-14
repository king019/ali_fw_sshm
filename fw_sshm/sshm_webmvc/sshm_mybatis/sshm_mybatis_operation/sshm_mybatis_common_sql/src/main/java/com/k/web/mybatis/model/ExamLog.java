package com.k.web.mybatis.model;

public class ExamLog {
    public Integer logId;
    public Integer examId;
    public String logAgent;
    public Integer logType;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public String getLogAgent() {
        return logAgent;
    }

    public void setLogAgent(String logAgent) {
        this.logAgent = logAgent;
    }
}
