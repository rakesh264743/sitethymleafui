package com.site.ui.controllers;

import com.site.ui.entities.Site;
import com.site.ui.services.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SiteController {
    @GetMapping(value="/home")
    public String home(Model model)
    {
        System.out.println("In side site handler..");
        model.addAttribute("titel", "Home");
        return "home";
    }
     @GetMapping(value="/site")
    public String site(Model model)
    {
        System.out.println("In side site handler..");
        model.addAttribute("titel", "Site");
    return "site";
    }

    @GetMapping(value="/viewsite")
    public String viewsite(Model model)
    {
        model.addAttribute("titel", "List");
        return "viewsite";
    }
    @GetMapping(value="/addsite")
    public String addsite(Model model)
    {
        model.addAttribute("titel", "Add Site");
        return "addsite";
    }
    @GetMapping(value="/modifysite")
    public String modifysite(Model model)
    {
        model.addAttribute("titel", "Modify Site");
        return "modifysite";
    }
    @GetMapping(value="/deletesite")
    public String deletesite(Model model)
    {
        model.addAttribute("titel", "Delete Site");
        return "deletesite";
    }


   /* @Autowired
    private SiteService siteService;
    //get all Site Handler
    @GetMapping("/site/viewsite")
    public List<Site> getAllSite() {
        return this.siteService.getAllSites();
    }
    //Create new  Site Handler
    @PostMapping("/site/addsite")
    public Site addSite(@RequestBody Site site){
        Site s = this.siteService.addSite(site);
        System.out.println(site);
        return s;
    }
    //Delete  Site Handler
    @DeleteMapping("/site/{siteId}")
    public void deleteSite(@PathVariable("siteId") int siteId)
    {
        this.siteService.deleteSite(siteId);
    }
    //Update   Site Handler
    @PutMapping("/site/{siteId}")
    public Site updateSite(@RequestBody Site site,@PathVariable("siteId") int siteId) {
        this.siteService.updateSite(site, siteId);
        return site;
    }  */
}
