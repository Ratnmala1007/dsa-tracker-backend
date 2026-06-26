package com.dsa.tracker.dto;

public class MonthlyStats {


	    private String month;
	    private long count;

	    public MonthlyStats(String month, long count) {
	        this.month = month;
	        this.count = count;
	    }

	    public String getMonth() {
	        return month;
	    }

	    public long getCount() {
	        return count;
	    }
	}
