package entity;

public class Campaign {
	private int campaingId;
	private String campaingName;
	
	
	public Campaign (int campaingId, String campaingName) {
		
		super();
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	

}
