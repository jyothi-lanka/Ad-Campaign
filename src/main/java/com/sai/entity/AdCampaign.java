package com.sai.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class AdCampaign {

    @Id
    private String partner_id;
    private Integer duration;
    private String ad_content;


    public AdCampaign() {
        this.partner_id = UUID.randomUUID().toString();
    }

    public String getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(String partner_id) {
        this.partner_id = partner_id;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getAd_content() {
        return ad_content;
    }

    public void setAd_content(String ad_content) {
        this.ad_content = ad_content;
    }

    @Override
    public String toString() {
        return "AdCampaign{" +
                "partner_id='" + partner_id + '\'' +
                ", duration=" + duration +
                ", ad_content='" + ad_content + '\'' +
                '}';
    }
}
