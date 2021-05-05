package abstractt;

import entity.Campaign;

public abstract class BaseCampaignManager implements ICampaignService{

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("İnanılmaz Bir Kampanya İle Karşındayız ! Sakin Ol ! : " + campaign.getCampaingName() );
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println(":( Bu Kampanyanın Sonuna Geldik  : " + campaign.getCampaingName());
		
	}

	@Override
	public void campaignUpdate(Campaign campaign, int campaignId, String campaignName) {
		campaign.setCampaingId(campaignId);
		campaign.setCampaingName(campaignName);
		
		
		System.out.println("Kampanya Güncellendi ! Yeni Detaylar : " + campaign.getCampaingId() +" / " + campaign.getCampaingName()  );
		
	}

}
