package com.Bridgelabz;

import java.text.DecimalFormat;
import java.util.LinkedList;

public class StockPersonalAccountImpl implements IStocksManagementServices {

	LinkedList<CompanyShares> portFolioList = new LinkedList<CompanyShares>();

	// Used to Format decimal points.
	private DecimalFormat decimalFormat = new DecimalFormat("#.##");

	@Override
	public void displayPresentCompanySharesDetails() {
		double comapanyOneSharePrice = Math.random() * 1000;
		double comapanyTwoSharePrice = Math.random() * 1000;
		double comapanyThreeSharePrice = Math.random() * 1000;
		double comapanyFourSharePrice = Math.random() * 1000;
		double comapanyFiveSharePrice = Math.random() * 1000;

		// Printing stocks name along with symbol and current per share price.
		System.out.println("Following are the Company Stocks currently available to buy at current prices.\n");
		System.out.println("Company-Name\tSymbol\tCurrent-Market-Price");
		System.out.println("Reliance\tRIL\t" + decimalFormat.format(comapanyOneSharePrice));
		System.out.println("Adani-Ports\tADP\t" + decimalFormat.format(comapanyTwoSharePrice));
		System.out.println("Cipla\t\tCipla\t" + decimalFormat.format(comapanyThreeSharePrice));
		System.out.println("Coal-India\tCI\t" + decimalFormat.format(comapanyFourSharePrice));
		System.out.println("Bata\t\tBFW\t" + decimalFormat.format(comapanyFiveSharePrice));

	}

	@Override
	public void buyStocks(CompanyShares companySharesDetails) {
		portFolioList.add(companySharesDetails);
	}

	@Override
	public void sellStocks(String companySymbol) {
		for (CompanyShares iterator : portFolioList) {
			if (iterator.getCompanySymbol().equals(companySymbol)) {
				portFolioList.remove(iterator);
				System.out.println("Stock sold successfully.\n");
			}
		}
	}

	@Override
	public void displayDetailPortFolio() {
		System.out.println("\n" + "Following are the detail stocks holdings from your portfolio.");
		for (CompanyShares iterator : portFolioList) {
			System.out.println(iterator);
		}
	}

}
