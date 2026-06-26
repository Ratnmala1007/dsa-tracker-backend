package com.dsa.tracker.dto;

public class DashboardResponse {

    private long totalSolved;
    private long easy;
    private long medium;
    private long hard;

    public DashboardResponse(long totalSolved,
                             long easy,
                             long medium,
                             long hard) {
        this.totalSolved = totalSolved;
        this.easy = easy;
        this.medium = medium;
        this.hard = hard;
    }

    public long getTotalSolved() {
        return totalSolved;
    }

    public long getEasy() {
        return easy;
    }

    public long getMedium() {
        return medium;
    }

    public long getHard() {
        return hard;
    }
}