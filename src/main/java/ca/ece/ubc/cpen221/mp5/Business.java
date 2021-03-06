package ca.ece.ubc.cpen221.mp5;

/**
 * Rep Invariant:
 * - url of one Business cannot be the same as the url of any other Business
 * - intersection of latitude and longitude must be located in the city
 * - city must be located in the state of the Business
 * - business_id of one Business cannot be the same as the business_id of any other Business
 * 
 */
public class Business {
	protected boolean open; //represents if the business is still running or not
	protected String url; //the the link which points to the business's page in the database
	protected double latitude; //represents the geographic location of the business on the map
	protected double longitude; //collection of neighborhoods a business is a part of
	protected String[] neighborhoods; //string that represents each business's business ID
	protected String business_id; //string that represents the name of the business
	protected String name; //collection of tags that the business is associated to
	protected String[] categories; //state the business is located in
	protected String state; //state the business is located in
	protected String city; //the city the business is located in
	protected String full_address; //the address of the business
	
	public Business(boolean open, String url, double latitude, double longitude, 
			String[] neighborhoods,String business_id,String name, String[] categories,
			String state, String city, String full_address)
	{
		this.open=open;
		this.url=url;
		this.latitude=latitude;
		this.longitude=longitude;
		this.neighborhoods=neighborhoods;
		this.business_id=business_id;
		this.name=name;
		this.categories=categories;
		this.state=state;
		this.city=city;
		this.full_address=full_address;
	}
	
	/**
	 * 
	 * @return whether open is true or false
	 */
	public boolean isOpen() {
		return open;
	}

	
	@Override 
	public String toString()
	{
		return new String(name);
	}
	/**
	 * changes the open field of the business to status
	 * @param open
	 */
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public String[] getCategories() {
		//ensure defensive copying
		String[] newstr = new String[categories.length];
		for (int i = 0; i < categories.length; i++)
		{
			newstr[i] = categories[i];
		}
		
		return newstr;
	}

	public void setCategories(String[] mcategories) {
		String[] newstr = new String[mcategories.length];
		for (int i = 0; i < mcategories.length; i++)
		{
			newstr[i] = mcategories[i];
		}
		this.categories = newstr;
	}
	

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String getBusiness_id() {
		return business_id;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}


	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getFull_address() {
		return full_address;
	}
	
	public String[] getNeighborhoods() {
		//defensive copying
		String[] newstr = new String[neighborhoods.length];
		for (int i = 0; i < neighborhoods.length; i++)
		{
			newstr[i] = neighborhoods[i];
		}
		return newstr;
	}

	public void setNeighborhoods(String[] mneighborhoods) {
		
		String[] newstr = new String[mneighborhoods.length];
		for (int i = 0; i < mneighborhoods.length; i++)
		{
			newstr[i] = mneighborhoods[i];
		}
		this.neighborhoods = newstr;
	}
	
}
