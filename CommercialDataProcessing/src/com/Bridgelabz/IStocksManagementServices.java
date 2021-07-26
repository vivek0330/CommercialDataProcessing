package com.Bridgelabz;

/**
 * 
 * @author Official_vk
 * 
 *         This Interface will have abstract methods. Methods which will be use
 *         some operations. Like Buy new stocks, Sell existing stocks and Print
 *         report.
 */
public interface IStocksManagementServices {
	public void displayPresentCompanySharesDetails();

	public void buyStocks(CompanyShares companySharesDetails);

	public void sellStocks(String companySymbol);

	public void displayDetailPortFolio();
}
