package abstractt;

import entity.Campaign;

public interface ICampaignService {
	void campaignAdd(Campaign campaign);
	void campaignDelete(Campaign campaign);
	void campaignUpdate(Campaign campaign, int campaignId, String campaignName);
	

}
