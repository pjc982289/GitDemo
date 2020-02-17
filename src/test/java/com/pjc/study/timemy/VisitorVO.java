package com.pjc.study.timemy;

import java.time.LocalDateTime;

/**
 * @program: javales
 * @description: shiti
 * @author: pjc
 * @create: 2019-12-27 09:55
 **/
public class VisitorVO {
    /**
     * 访问者id
     * */
    private String visitorId;

    /**
     * 最后一次访问时间
     * */
    private LocalDateTime lastVisitTime;

    /**
     * 访问时间
     * */
    private LocalDateTime visitTime;



    public VisitorVO() {
    }

    public VisitorVO(String visitorId, LocalDateTime lastVisitTime, LocalDateTime visitTime) {
        this.visitorId = visitorId;
        this.lastVisitTime = lastVisitTime;
        this.visitTime = visitTime;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public void setLastVisitTime(LocalDateTime lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    public void setVisitTime(LocalDateTime visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public LocalDateTime getLastVisitTime() {
        return lastVisitTime;
    }

    public LocalDateTime getVisitTime() {
        return visitTime;
    }

    @Override
    public String toString() {
        return "VisitorVO{" +
                "visitorId='" + visitorId + '\'' +
                ", lastVisitTime=" + lastVisitTime +
                ", visitTime=" + visitTime +
                '}';
    }
}


