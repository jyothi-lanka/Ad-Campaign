package com.sai.service;

import com.sai.entity.AdCampaign;
import com.sai.exception.BadRequestException;
import com.sai.exception.ResourceNotFoundException;
import com.sai.repository.AdCampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Date;

@Service
public class AdCampaignServiceImpl implements AdCampaignService{

    @Autowired
    AdCampaignRepository repository;

    @Transactional(readOnly = true)
    public AdCampaign findByPartnerId(String partnerId) {
        return repository.findByPartnerId(partnerId);
    }

    @Transactional
    public AdCampaign createAd(AdCampaign adCampaign){
        AdCampaign existing= findByPartnerId(adCampaign.getPartner_id());
            if (existing != null) {
            throw new BadRequestException("AdCampaign with partnerId " + adCampaign.getPartner_id() + " already exists.");
        }
        return repository.create(adCampaign);
    }

    @Transactional(readOnly = true)
    public AdCampaign findAd(String partnerId) {
        AdCampaign adCampaign = repository.findByPartnerId(partnerId);

        if (adCampaign == null) {
            throw new ResourceNotFoundException("AdCampaign with partnerId " + partnerId + " doesn't exists.");
        }
        return adCampaign;

    }

}
