package com.sai.repository;

import com.sai.entity.AdCampaign;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AdCampaignRepositoryImpl implements AdCampaignRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public AdCampaign findByPartnerId(String partnerId){
        return entityManager.find(AdCampaign.class, partnerId);
    }

    public AdCampaign create(AdCampaign adCampaign){
        entityManager.persist(adCampaign);
        return adCampaign;
    }


}
