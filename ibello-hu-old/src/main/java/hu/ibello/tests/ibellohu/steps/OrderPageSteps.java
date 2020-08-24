package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.tools.TestData;
import hu.ibello.tests.ibellohu.pages.OrderPage;

@Name("Megrendelés oldal")
public class OrderPageSteps extends AbstractSteps{
	
	@Inject
	private TestData testData;
	
	private OrderPage orderPage;
	
//	@Name("Beállítom a bronz licencek számát") 
	public void beállítom_a_bronz_licencek_számát() {
		orderPage.bronz_licencek_száma_legyen_$(3);
	}
	
//	@Name("Beállítom az ezüst licencek számát") 
	public void beállítom_az_ezüst_licencek_számát() {
		orderPage.ezüst_licencek_száma_legyen_$(2);
	}
	
//	@Name("Beállítom az arany licencek számát") 
	public void beállítom_az_arany_licencek_számát() {
		orderPage.arany_licencek_száma_legyen_$(1);
	}
	
//	@Name("Áttekintem a megrendelést")
	public void áttekintem_a_megrendelést() {
		orderPage.kattintás_az_áttekintő_gombra();
	}
	
//	@Name("Megjelenik a véglegesítés üzenetablak")
	public void megjelenik_a_véglegesítés_üzenetablak() {
		orderPage.ellenőrzés_hogy_a_véglegesítő_üzenetablak_megnyílt();
	}
	
//	@Name("Ellenőrzöm a megrendelés adatait")
	public void ellenőrzöm_a_megrendelés_adatait() {
		orderPage.megrendelés_tételének_ára(testData.order.bronzeName, testData.order.bronzeItemPrice);
		orderPage.megrendelés_tételének_ára(testData.order.silverName, testData.order.silverItemPrice);
		orderPage.megrendelés_tételének_ára(testData.order.goldName, testData.order.goldItemPrice);
		orderPage.megrendelés_tételének_ára(testData.order.sumName, testData.order.sumPrice);
	}
	
//	@Name("Véglegesítem a megrendelést")
	public void véglegesítem_a_megrendelést() {
		orderPage.kattintás_a_véglegesítő_gombra();
	}
	
//	@Name("Megjelenik a sikeres megrendelés dialógusablak")
	public void megjelenik_a_sikeres_megrendelés_dialógusablak() {
		orderPage.ellenőrzés_hogy_a_visszaigazoló_dialógusablak_megnyílt();
	}
	
//	@Name("Bezárom a felugró ablakot")
	public void bezárom_a_felugró_ablakot() {
		orderPage.kattintás_az_Ok_gombra();
	}

}
