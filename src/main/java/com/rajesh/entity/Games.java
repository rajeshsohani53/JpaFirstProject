package com.rajesh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Games {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 private String game_Name;
 private Integer game_NoOf_Players;
 private String game_Mode;
 public Games() {
	super();
	// TODO Auto-generated constructor stub
 }
 public Games(String game_Name, Integer game_NoOf_Players, String game_Mode) {
	super();
	this.game_Name = game_Name;
	this.game_NoOf_Players = game_NoOf_Players;
	this.game_Mode = game_Mode;
 }
 public Integer getId() {
	return id;
 }
 public void setId(Integer id) {
	this.id = id;
 }
 public String getGame_Name() {
	return game_Name;
 }
 public void setGame_Name(String game_Name) {
	this.game_Name = game_Name;
 }
 public Integer getGame_NoOf_Players() {
	return game_NoOf_Players;
 }
 public void setGame_NoOf_Players(Integer game_NoOf_Players) {
	this.game_NoOf_Players = game_NoOf_Players;
 }
 public String getGame_Mode() {
	return game_Mode;
 }
 public void setGame_Mode(String game_Mode) {
	this.game_Mode = game_Mode;
 }
 @Override
 public String toString() {
	return "Games [id=" + id + ", game_Name=" + game_Name + ", game_NoOf_Players=" + game_NoOf_Players + ", game_Mode="
			+ game_Mode + "]";
 }
 
 
 
 
 
}
