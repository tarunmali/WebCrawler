package com.example.WebCrawler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crawl")
public class CrawlController {
    @Autowired
    private CrawlManager crawlManager;

//    @PostMapping("/start")
    //or
    @RequestMapping(method= RequestMethod.POST, value="/start")
    public CrawlStarterResponse start(){

    }



}
