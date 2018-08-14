package com.cg.organization;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.cg.organization.address.Address;

public class Organization {
	private String name;
	private Address address;
	private double marketValue;
	private LocalDate established;
	private int employeeCount;

	private HashSet<String> globalPresence;
	private ArrayList<String> boardMembers;
	private HashMap<String,String> projectManagers;
	
	
	public Organization(String name, Address address, double marketValue, String str, int employeeCount) {
		this.name = name;
		this.address = address;
		this.marketValue = marketValue;
		String[] date = str.split("/");
		this.established = LocalDate.of(Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));
		this.employeeCount = employeeCount;
	}


	public void setGlobalPresence(HashSet<String> globalPresence) {
		this.globalPresence = globalPresence;
	}


	public void setBoardMembers(ArrayList<String> boardMembers) {
		this.boardMembers = boardMembers;
	}


	public void setProjectManagers(HashMap<String, String> projectManagers) {
		this.projectManagers = projectManagers;
	}


	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", marketValue=" + marketValue + ", established="
				+ established + ", employeeCount=" + employeeCount + "]";
	}
	
}
