package com.shreeganesh.hibernate.HIbernate1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "songs")
public class Song {

	@Id
	@Column(name = "songId")
	private Integer id;
	@Column(name = "songName")
	private String songName;
	@Column(name = "artist")
	private String singer;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", singer=" + singer + "]";
	}
	
	
	
}
