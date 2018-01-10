package com.sai.service;

import com.sai.entity.AdCampaign;

public interface AdCampaignService {
    AdCampaign createAd(AdCampaign adCampaign);
    AdCampaign findAd(String partnerId);
}
