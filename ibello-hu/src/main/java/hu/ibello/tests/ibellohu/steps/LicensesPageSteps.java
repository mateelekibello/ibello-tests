package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.tools.TestData;
import hu.ibello.tests.ibellohu.pages.LicensesPage;

@Name("Licencek oldal")
public class LicensesPageSteps extends AbstractSteps{
	
	@Inject
	private TestData testData;
	
	private LicensesPage licensesPage;
	
	@Name("elindítom az engedélyezést")
	public void elindítom_az_engedélyezést() {
		//licensesPage.kattintás_az_engedélyez_gombra();
	}
	
	@Name("megnyílik a licenc engedélyezés dialógusablak")
	public void megnyílik_a_licenc_engedélyezés_dialógusablak() {
		licensesPage.ellenőrzés_hogy_a_dialógusablak_megnyílt();
	}
	
	@Name("ellenőrzöm a licenc adatait")
	public void ellenőrzöm_a_licenc_adatait() {
		licensesPage.licenc_adatok_ellenőrzése();
	}
	
	@Name("beírom a felhasználó nevét")
	public void beírom_a_felhasználó_nevét() {
		licensesPage.felhasználó_nevének_beírása(testData.license.licenseUser);
	}
	
	@Name("engedélyezem a licencet")
	public void engedélyezem_a_licencet() {
		licensesPage.kattintás_az_engdélyezés_gombra();
	}
	
	@Name("a listában megjelenik az engedélyezett licenc")
	public void a_listában_megjelenik_az_engedélyezett_licenc() {
		//licensesPage.ellenőrzés_hogy_a_lincenc_visszavonható();
	}
	
	@Name("elindítom a licenc visszavonását")
	public void elindítom_a_licenc_visszavonását() {
		//licensesPage.kattintás_a_visszavon_gombra();
	}
}
