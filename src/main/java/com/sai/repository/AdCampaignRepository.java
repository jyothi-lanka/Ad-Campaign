package com.sai.repository;

import com.sai.entity.AdCampaign;

public interface AdCampaignRepository {
    AdCampaign findByPartnerId(String partnerId);
    AdCampaign create(AdCampaign adCampaign);
}
