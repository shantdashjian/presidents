package project;

public class President {
	private String firstName;
	private String middleName;
	private String lastName;
	private String party;
	private int termNumber;
	private int startYear;
	private int endYear;
	/**
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param party
	 * @param termNumber
	 * @param startYear
	 * @param endYear
	 */
	public President(String firstName, String middleName, String lastName, String party, int termNumber, int startYear,
			int endYear) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.party = party;
		this.termNumber = termNumber;
		this.startYear = startYear;
		this.endYear = endYear;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the party
	 */
	public String getParty() {
		return party;
	}
	/**
	 * @param party the party to set
	 */
	public void setParty(String party) {
		this.party = party;
	}
	/**
	 * @return the termNumber
	 */
	public int getTermNumber() {
		return termNumber;
	}
	/**
	 * @param termNumber the termNumber to set
	 */
	public void setTermNumber(int termNumber) {
		this.termNumber = termNumber;
	}
	/**
	 * @return the startYear
	 */
	public int getStartYear() {
		return startYear;
	}
	/**
	 * @param startYear the startYear to set
	 */
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	/**
	 * @return the endYear
	 */
	public int getEndYear() {
		return endYear;
	}
	/**
	 * @param endYear the endYear to set
	 */
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("President [firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", party=");
		builder.append(party);
		builder.append(", termNumber=");
		builder.append(termNumber);
		builder.append(", startYear=");
		builder.append(startYear);
		builder.append(", endYear=");
		builder.append(endYear);
		builder.append("]");
		return builder.toString();
	}



}
