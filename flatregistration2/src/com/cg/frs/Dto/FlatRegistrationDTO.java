package com.cg.frs.Dto;

public class FlatRegistrationDTO {
	private  int ownId;
	private  int flatId;
	private  String flatType;
	public FlatRegistrationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlatRegistrationDTO(int ownId, int flatId,
			String flatType, int flatArea, int desRent, int depAmt) {
		super();
		this.ownId = ownId;
		this.flatId = flatId;
		this.flatType = flatType;
		this.flatArea = flatArea;
		this.desRent = desRent;
		this.depAmt = depAmt;
	}
	@Override
	public String toString() {
		return "FlatRegistrationDTO [ownId=" + ownId + ", flatId="
				+ flatId + ", flatType=" + flatType + ", flatArea=" + flatArea
				+ ", desRent=" + desRent + ", depAmt=" + depAmt + "]";
	}
	private int flatArea;
	private int desRent;
	private int depAmt;
	public int getOwnId() {
		return ownId;
	}
	public void setOwnId(int ownId) {
		this.ownId = ownId;
	}
	public int getFlatId() {
		return flatId;
	}
	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	public int getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(int flatArea) {
		this.flatArea = flatArea;
	}
	public int getDesRent() {
		return desRent;
	}
	public void setDesRent(int desRent) {
		this.desRent = desRent;
	}
	public int getDepAmt() {
		return depAmt;
	}
	public void setDepAmt(int depAmt) {
		this.depAmt = depAmt;
	}

}
