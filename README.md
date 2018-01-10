# Ad-Campaign

This project has two functional requirements.

1. HTTP POST: Create Ad Campaign via 
http://<host>/ad
Http Body is a json object:
{
 "partner_id": "unique_string_representing_partner',
 "duration": "int_representing_campaign_duration_in_seconds_from_now"
 "ad_content": "string_of_content_to_display_as_ad"
}

Below is the sample of Http Body which is a json object:
{
 "partner_id": "5108b0c8-bf94-441e-af31-638dc27b96f6",	
 "duration": "500",
 "ad_content": "Hospital Ad"
}

2. GET request : Fetch Ad Campaign for a Partner and return the json object
http://<host>/ad/<partner_id>.




