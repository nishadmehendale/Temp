package com.moneymoney.app.console.bootstrap;

import java.io.IOException;

import com.moneymoney.app.console.view.MMBankView;

public class Bootstrap {
	public static void main(String[] args) {
		try {
			new MMBankView().start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
  