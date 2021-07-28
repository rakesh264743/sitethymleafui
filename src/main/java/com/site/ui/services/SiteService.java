package com.site.ui.services;

import com.site.ui.entities.Site;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class SiteService {
    private static List<Site> list= new ArrayList<>();

    static {
        list.add(new Site(1,"b-jobz.com",12,12,"Active"));
        list.add(new Site(2,"b-bz.com",9,9,"Active"));
        list.add(new Site(3,"e-jobz.com",6,6,"Active"));

    }
    //get all Site
    public List<Site> getAllSites(){
        return list;
    }

    //get singal Site by id
    public Site getSiteById(int siteid){
        Site site=null;
        site=list.stream().filter(e->e.getSiteid()==siteid).findFirst().get();
        return site;
    }
    //add the site
    public Site addSite(Site s){
        list.add(s);
        return s;
    }
    // Delete site
    public void deleteSite(int sid){

        list=list.stream().filter(site -> site.getSiteid()!=sid).collect(Collectors.toList());

    }
    // Update Site
    public void updateSite(Site site,Integer siteId)
    {
        list = list.stream().map(b->{
            if(b.getSiteid()==siteId)
            {
                b.setSitename(site.getSitename());
                b.setFeeds(site.getFeeds());
                b.setCounties(site.getCounties());
                b.setStatus(site.getStatus());
              
            }
            return b;
        }).collect(Collectors.toList()) ;
    }
}
