package kh.lclass.openapi.rub;

import kh.lclass.openapi.controller.EVInfoController;

public class EvInfoRun {
	public static void main(String[] args) {
		EVInfoController evInfoCtrl =  new EVInfoController();
		evInfoCtrl.getEvInfoAll();
	}
}
