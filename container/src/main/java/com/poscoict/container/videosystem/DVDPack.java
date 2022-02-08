package com.poscoict.container.videosystem;

import java.util.List;

public class DVDPack {
	private String title;
	private List<DigitalVideoDisc> dvds;

	public DVDPack(String title, List<DigitalVideoDisc> dvds) {
		super();
		this.title = title;
		this.dvds = dvds;
	}
}