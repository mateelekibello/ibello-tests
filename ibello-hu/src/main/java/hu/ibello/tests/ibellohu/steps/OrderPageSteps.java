package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.tools.TestData;
import hu.ibello.tests.ibellohu.pages.OrderPage;

@Name("Megrendelés oldal")
public class OrderPageSteps extends AbstractSteps{
	
	private OrderPage orderPage;
	
	@Name("beállítom a bronz licencek számát") 
	public void beállítom_a_bronz_licencek_számát() {
		orderPage.bronz_licencek_száma_legyen_$(3);
	}
	
	@Name("beállítom az ezüst licencek számát") 
	public void beállítom_az_ezüst_licencek_számát() {
		orderPage.ezüst_licencek_száma_legyen_$(2);
	}
	
	@Name("beállítom az arany licencek számát") 
	public void beállítom_az_arany_licencek_számát() {
		orderPage.arany_licencek_száma_legyen_$(1);
	}
	
	@Name("áttekintem a megrendelést")
	public void áttekintem_a_megrendelést() {
		orderPage.kattintás_az_áttekintő_gombra();
	}
	
	@Name("megjelenik a véglegesítés üzenetablak")
	public void megjelenik_a_véglegesítés_üzenetablak() {
		orderPage.ellenőrzés_hogy_a_véglegesítő_üzenetablak_megnyílt();
	}
	
	@Name("ellenőrzöm a megrendelés adatait")
	public void ellenőrzöm_a_megrendelés_adatait() {
		
	}
	
	@Name("véglegesítem a megrendelést")
	public void véglegesítem_a_megrendelést() {
		orderPage.kattintás_a_véglegesítő_gombra();
	}
	
	@Name("megjelenik a sikeres megrendelés dialógusablak")
	public void megjelenik_a_sikeres_megrendelés_dialógusablak() {
		orderPage.ellenőrzés_hogy_a_visszaigazoló_dialógusablak_megnyílt();
	}
	
	@Name("bezárom a felugró ablakot")
	public void bezárom_a_felugró_ablakot() {
		orderPage.kattintás_az_Ok_gombra();
	}

}
