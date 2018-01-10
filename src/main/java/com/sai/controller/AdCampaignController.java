package com.sai.controller;

import com.sai.entity.AdCampaign;
import com.sai.service.AdCampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ad")
public class AdCampaignController {

    @Autowired
    AdCampaignService service;

    @RequestMapping(method = RequestMethod.POST)
    public AdCampaign createAd(@RequestBody AdCampaign  adCampaign) {
        return service.createAd(adCampaign);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public AdCampaign findAd(@PathVariable("id") String partnerId) {
        return service.findAd(partnerId);
    }
}
