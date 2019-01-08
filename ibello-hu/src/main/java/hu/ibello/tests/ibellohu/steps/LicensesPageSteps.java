package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.tools.TestData;
import hu.ibello.tests.ibellohu.pages.LicensesPage;
import hu.ibello.tests.ibellohu.pages.MenuPage;

@Name("Licencek oldal")
public class LicensesPageSteps extends AbstractSteps {
	
	@Inject
	private TestData testData;
	
	private LicensesPage licensesPage;
	private MenuPage menuPage;
	
	private boolean licenseIsGranted = false;
	
//	@Name("Elindítom az engedélyezést")
	public void elindítom_az_engedélyezést() {
		licensesPage.kattintás_az_engedélyez_gombra_a_$_licenchez(testData.license.licenseId);
	}
	
//	@Name("Elindítom a licenc visszavonását")
	public void elindítom_a_licenc_visszavonását() {
		licensesPage.kattintás_a_visszavon_gombra_a_$_licenchez(testData.license.licenseId);
	}
	
//	@Name("Elindítom a licenc visszaadását")
	public void elindítom_a_licenc_visszaadását() {
		licensesPage.kattintás_a_visszaad_gombra_a_$_licenchez(testData.license.licenseId);
	}
	
//	@Name("Megnyílik a licenc engedélyezés dialógusablak")
	public void megnyílik_a_licenc_engedélyezés_dialógusablak() {
		licensesPage.ellenőrzés_hogy_az_engedélyező_dialógusablak_megnyílt();
	}
	
//	@Name("Megjelenik a licenc visszavonása dialógusablak")
	public void megjelenik_a_licenc_visszavonása_dialógusablak() {
		licensesPage.ellenőrzés_hogy_a_visszavonó_dialógusablak_megnyílt();
	}
	
//	@Name("Megjelenik a licenc visszaadása dialógusablak")
	public void megjelenik_a_licenc_visszaadása_dialógusablak() {
		licensesPage.ellenőrzés_hogy_a_visszaadó_dialógusablak_megnyílt();
	}
	
//	@Name("Megjelenik a lejárt licenc üzenetablak")
	public void megjelenik_a_lejárt_licenc_üzenetablak() {
		licensesPage.ellenőrzés_hogy_a_lejárt_licenc_dialógusablak_megnyílt();
	}
	
//	@Name("Ellenőrzöm a licenc adatait")
	public void ellenőrzöm_a_licenc_adatait() {
		licensesPage.licenc_adatok_ellenőrzése(
				testData.license.licenseId,
				testData.license.licenseType,
				testData.license.licenseClass,
				testData.license.licenseOwner,
				testData.license.licenseValidThru
		);
	}
	
//	@Name("Beírom a felhasználó nevét")
	public void beírom_a_felhasználó_nevét() {
		licensesPage.felhasználó_nevének_beírása(testData.license.licenseUser);
	}
	
//	@Name("Engedélyezem a licencet")
	public void engedélyezem_a_licencet() {
		licensesPage.kattintás_az_engdélyezés_gombra();
		licenseIsGranted = true;
	}
	
//	@Name("Visszavonom a licencet")
	public void visszavonom_a_licencet() {
		licensesPage.kattintás_a_visszavon_gombra();
		licenseIsGranted = false;
	}
	
//	@Name("Visszaadom a licencet")
	public void visszaadom_a_licencet() {
		licensesPage.kattintás_a_visszaad_gombra();
		licenseIsGranted = false;
	}
	
//	@Name("A listában megjelenik az engedélyezett licenc")
	public void az_engedélyezett_licenc_megjelenik_a_listában() {
		licensesPage.ellenőrzés_hogy_a_$_lincenc_visszavonható(testData.license.licenseId);
		licenseIsGranted = true;
	}
	
//	@Name("A licenc engedélyezhető")
	public void az_aktuális_licenc_engedélyezhető() {
		licensesPage.ellenőrzés_hogy_a_$_lincenc_engedélyezhető(testData.license.licenseId);
		licenseIsGranted = false;
	}
	
//	@Name("A licenc visszaadható")
	public void az_aktuális_licenc_visszaadható() {
		licensesPage.ellenőrzés_hogy_a_$_lincenc_visszaadható(testData.license.licenseId);
		licenseIsGranted = false;
	}
	
//	@Name("A licenc nem visszaadható")
	public void az_aktuális_licenc_nem_visszaadható() {
		licensesPage.ellenőrzés_hogy_a_$_lincenc_nem_visszaadható(testData.license.licenseId);
		licenseIsGranted = false;
	}
	
//	@Name("Frissítem az oldalt")
	public void frissítem_az_oldalt() {
		licensesPage.frissítem_az_oldalt();
	}
	
//	@Name("A licenc nincs a listán")
	public void az_aktuális_licenc_nincs_a_listán() {
		licensesPage.ellenőrzés_hogy_a_licenc_nincs_a_listán(testData.license.licenseId);
		licenseIsGranted = false;
	}
	
//	@Name("Bezárom az üzenetablakot")
	public void bezárom_az_üzenetablakot() {
		licensesPage.kattintás_az_ok_gombra_a_lejárt_licenc_ablakon();
	}
	
//	@Name("Megrendelem a licencem")
	public void megrendelem_a_licencem() {
		licensesPage.kattintás_a_megrendelés_gombra();
	}
	
//	@Name("Kilistáztatom a lejárt licenceket")
	public void kilistáztatom_a_lejárt_licenceket() {
		licensesPage.lejárt_licencek_megjelenítése_választása();
	}
	
//	@Name("Kijelentkezek a licencek oldalról")
	public void Kijelentkezek_a_Licencek_oldalról() {
		menuPage.bejelentkezett_kijelentkezés_menüelem_választása();
	}
	
//	@Name("A licenc legyen engedélyezhető")
	public void az_aktuális_licenc_legyen_engedélyezhető() {
		if (licenseIsGranted) {
			elindítom_a_licenc_visszavonását();
			megjelenik_a_licenc_visszavonása_dialógusablak();
			ellenőrzöm_a_licenc_adatait();
			visszavonom_a_licencet();
			az_aktuális_licenc_engedélyezhető();
		}
	}
	
//	@Name("A licenc legyen visszavonható")
	public void az_aktuális_licenc_legyen_visszavonható() {
		if (!licenseIsGranted) {
			elindítom_az_engedélyezést();
			megnyílik_a_licenc_engedélyezés_dialógusablak();
			ellenőrzöm_a_licenc_adatait();
			beírom_a_felhasználó_nevét();
			engedélyezem_a_licencet();
			az_engedélyezett_licenc_megjelenik_a_listában();
		}
	}
	
//	@Name("Beállítom a licenc státuszát")
	public void beállítom_a_licenc_státuszát() {
		if (licensesPage.az_$_licenchez_az_engedélyez_gomb_megjelent(testData.license.licenseId)) {
			licenseIsGranted = false;
		}
		if (licensesPage.az_$_licenchez_a_visszavon_gomb_megjelent(testData.license.licenseId)) {
			licenseIsGranted = true;
		}
	}
}
