package controller;

import database.DBaccess;

public class HondenUitlaatLauncher {
	
	public static void main(String[] args) {
		DBaccess dBaccess = new DBaccess("UitlaatService", "userUitlaatService", "pwUitlaatService");
		dBaccess.openConnection();



		dBaccess.closeConnection();
	}
}
