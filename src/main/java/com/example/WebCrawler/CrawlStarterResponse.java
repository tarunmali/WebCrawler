package com.example.WebCrawler;

public class CrawlStarterResponse {
    private String processId;
    private CrawlProcessStatus status;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public CrawlProcessStatus getStatus() {
        return status;
    }

    public void setStatus(CrawlProcessStatus status) {
        this.status = status;
    }
}
