package com.xxl.job.admin.core.model;

import java.sql.Timestamp;

/**
 * xxl-job log for glue, used to track job code process
 * @author xuxueli 2016-5-19 17:57:46
 * editor by chenxh on 2021/11/1
 * TODO oracle支持调整 修改Date为Timestamp
 */
public class XxlJobLogReport {

    private int id;

    private Timestamp triggerDay;

    private int runningCount;
    private int sucCount;
    private int failCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTriggerDay() {
        return triggerDay;
    }

    public void setTriggerDay(Timestamp triggerDay) {
        this.triggerDay = triggerDay;
    }

    public int getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(int runningCount) {
        this.runningCount = runningCount;
    }

    public int getSucCount() {
        return sucCount;
    }

    public void setSucCount(int sucCount) {
        this.sucCount = sucCount;
    }

    public int getFailCount() {
        return failCount;
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }
}
