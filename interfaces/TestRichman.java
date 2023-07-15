package com.rays.interfaces;

public class TestRichman {

	public static void main(String[] args) {

		Richman r = new Businessman("Adani", "Gujrat");
		r.donation();
		r.earnMoney();
		r.party();
		SocialWorker s = new Businessman2("Mukesh Bhai", "Mumbai");
		SocialWorker s1 = new Businessman3("Sachin Kalar", "Village panchhor teh-Bherunda district sehore mp");
		s.helpToOthers();
		s1.helpToOthers();
	}

}
