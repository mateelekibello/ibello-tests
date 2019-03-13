package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.tools.TestData;
import hu.ibello.tests.ibellohu.pages.BlogPage;
import hu.ibello.tests.ibellohu.pages.BlogPostPage;
import hu.ibello.tests.ibellohu.pages.MenuPage;

@Name("Blog oldalak")
public class BlogSteps extends AbstractSteps {
	
	@Inject
	private TestData testData;
	
	private BlogPage blogPage;
	private MenuPage menuPage;
	private BlogPostPage blogPostPage;
	
//	@Name("Magyar nyelv kiválasztása")
	public void magyar_nyelv_kiválasztása() {
		menuPage.beállítom_a_nyelvválasztót("Magyar");
	}

//	@Name("Angol nyelv kiválasztása")
	public void angol_nyelv_kiválasztása() {
		menuPage.beállítom_a_nyelvválasztót("English");
	}

	public void magyarra_állított_nyelvválasztó() {
		menuPage.a_nyelvválasztó_állásának_ellenőrzése("Magyar");
	}
	
	public void angolra_állított_nyelvválasztó() {
		menuPage.a_nyelvválasztó_állásának_ellenőrzése("English");
	}
	
	public void kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon() {
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_megjelenik(testData.post.title);
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_képe_megjelenik();
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_címe_megjelenik(testData.post.title);
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_szerzője_megjelenik(testData.post.author);
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_dátuma_megjelenik(testData.post.date);
		if (testData.post.categoryBővítmények) blogPage.bővítmények_kategória_link_ellenőrzése();
		if (testData.post.categoryGrafikusFelület) blogPage.grafikus_felület_kategória_link_ellenőrzése();
		if (testData.post.categoryMesterségesIntelligencia) blogPage.mesterséges_intelligencia_kategória_link_ellenőrzése();
		if (testData.post.categoryParancssor) blogPage.parancssor_kategória_link_ellenőrzése();
		if (testData.post.categoryPéldák) blogPage.példák_kategória_link_ellenőrzése();
		if (testData.post.categoryTanulmányok) blogPage.tanulmányok_kategória_link_ellenőrzése();
		if (testData.post.categoryÚjdonságok) blogPage.újdonságok_kategória_link_ellenőrzése();
		if (testData.post.categoryÁttekintés) blogPage.áttekintés_kategória_link_ellenőrzése();
	} 
	
	public void kiválasztott_poszt_megjelenik_az_angol_blog_oldalon() {
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_megjelenik(testData.post.titleInEnglish);
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_képe_megjelenik();
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_címe_megjelenik(testData.post.titleInEnglish);
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_szerzője_megjelenik(testData.post.authorInEnglish);
		blogPage.ellenőrzés_hogy_az_aktuális_poszt_dátuma_megjelenik(testData.post.date);
/*		if (testData.post.categoryBővítmények) blogPage.bővítmények_kategória_link_ellenőrzése();
		if (testData.post.categoryGrafikusFelület) blogPage.grafikus_felület_kategória_link_ellenőrzése();
		if (testData.post.categoryMesterségesIntelligencia) blogPage.mesterséges_intelligencia_kategória_link_ellenőrzése();
		if (testData.post.categoryParancssor) blogPage.parancssor_kategória_link_ellenőrzése();
		if (testData.post.categoryPéldák) blogPage.példák_kategória_link_ellenőrzése();
		if (testData.post.categoryTanulmányok) blogPage.tanulmányok_kategória_link_ellenőrzése();
		if (testData.post.categoryÚjdonságok) blogPage.újdonságok_kategória_link_ellenőrzése();
		if (testData.post.categoryÁttekintés) blogPage.áttekintés_kategória_link_ellenőrzése();
		*/
	}
	
	public void megjelenik_a_kiválasztott_poszt_fejléce_magyarul() {
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_megjelenik(testData.post.title);
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_címe_megjelenik(testData.post.title);
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_szerzője_megjelenik(testData.post.author);
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_dátuma_megjelenik(testData.post.date);
		if (testData.post.categoryBővítmények) blogPostPage.bővítmények_kategória_link_ellenőrzése();
		if (testData.post.categoryGrafikusFelület) blogPostPage.grafikus_felület_kategória_link_ellenőrzése();
		if (testData.post.categoryMesterségesIntelligencia) blogPostPage.mesterséges_intelligencia_kategória_link_ellenőrzése();
		if (testData.post.categoryParancssor) blogPostPage.parancssor_kategória_link_ellenőrzése();
		if (testData.post.categoryPéldák) blogPostPage.példák_kategória_link_ellenőrzése();
		if (testData.post.categoryTanulmányok) blogPostPage.tanulmányok_kategória_link_ellenőrzése();
		if (testData.post.categoryÚjdonságok) blogPostPage.újdonságok_kategória_link_ellenőrzése();
		if (testData.post.categoryÁttekintés) blogPostPage.áttekintés_kategória_link_ellenőrzése();
	}
	
	public void megjelenik_a_kiválasztott_poszt_fejléce_angolul() {
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_megjelenik(testData.post.titleInEnglish);
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_címe_megjelenik(testData.post.titleInEnglish);
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_szerzője_megjelenik(testData.post.authorInEnglish);
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_dátuma_megjelenik(testData.post.date);
/*		if (testData.post.categoryBővítmények) blogPostPage.bővítmények_kategória_link_ellenőrzése();
		if (testData.post.categoryGrafikusFelület) blogPostPage.grafikus_felület_kategória_link_ellenőrzése();
		if (testData.post.categoryMesterségesIntelligencia) blogPostPage.mesterséges_intelligencia_kategória_link_ellenőrzése();
		if (testData.post.categoryParancssor) blogPostPage.parancssor_kategória_link_ellenőrzése();
		if (testData.post.categoryPéldák) blogPostPage.példák_kategória_link_ellenőrzése();
		if (testData.post.categoryTanulmányok) blogPostPage.tanulmányok_kategória_link_ellenőrzése();
		if (testData.post.categoryÚjdonságok) blogPostPage.újdonságok_kategória_link_ellenőrzése();
		if (testData.post.categoryÁttekintés) blogPostPage.áttekintés_kategória_link_ellenőrzése();
		*/
	}
	
	public void megjelenik_a_kiválasztott_poszt_szövege_magyarul() {
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_egy_bekezdése_megjelenik(testData.post.partOfText);
	}
	
	public void megjelenik_a_kiválasztott_poszt_szövege_angolul() {
		blogPostPage.ellenőrzés_hogy_az_aktuális_poszt_egy_bekezdése_megjelenik(testData.post.partOfTextInEnglish);
	}
	
	public void megjelenik_az_ibello_blog_poszt_oldala_magyarul() {
		blogPostPage.ellenőrzés_hogy_az_oldal_megnyílt_$_nyelven("Magyar");
	}
	
	public void megjelenik_az_ibello_blog_poszt_oldala_angolul() {
		blogPostPage.ellenőrzés_hogy_az_oldal_megnyílt_$_nyelven("English");
	}
	
	public void megjelenik_a_poszt_címe_az_oldal_fejlécében_magyarul() {
		blogPostPage.ellenőrzés_hogy_a_$_cím_jelenik_meg(testData.post.title);
	}
	
	public void megjelenik_a_poszt_címe_az_oldal_fejlécében_angolul() {
		blogPostPage.ellenőrzés_hogy_a_$_cím_jelenik_meg(testData.post.titleInEnglish);
	}
	
	public void továbblépés_a_következő_posztra() {
		blogPostPage.kattintás_a_következő_gombra();
	}
	
	public void visszalépés_az_előző_posztra() {
		blogPostPage.kattintás_a_előző_gombra();
	}
	
	public void bővítmények_kategória_ellenőrzése_$(String from) {
		if (testData.post.categoryBővítmények) {
			if (from.equals("a blog oldal csempéjén")) blogPage.bővítmények_link_választása();
			else if (from.equals("a blog fejlécén")) blogPostPage.bővítmények_link_választása();
			else if (from.equals("a kategóriák menüben")) blogPostPage.bővítmények_menü_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
			if (!from.equals("a blog oldal csempéjén")) megnyitom_a_kiválasztott_posztot();
		}
	}
	
	public void grafikus_felület_kategória_ellenőrzése_$(String from) {
		if (testData.post.categoryGrafikusFelület) {
			if (from.equals("a blog oldal csempéjén")) blogPage.grafikus_felület_link_választása();
			else if (from.equals("a blog fejlécén")) blogPostPage.grafikus_felület_link_választása();
			else if (from.equals("a kategóriák menüben")) blogPostPage.grafikus_felület_menü_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
			if (!from.equals("a blog oldal csempéjén")) megnyitom_a_kiválasztott_posztot();
		}
	}
	
	public void mesterséges_intelligencia_kategória_ellenőrzése_$(String from) {
		if (testData.post.categoryMesterségesIntelligencia) {
			if (from.equals("a blog oldal csempéjén")) blogPage.mesterséges_intelligencia_link_választása();
			else if (from.equals("a blog fejlécén")) blogPostPage.mesterséges_intelligencia_link_választása();
			else if (from.equals("a kategóriák menüben")) blogPostPage.mesterséges_intelligencia_menü_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
			if (!from.equals("a blog oldal csempéjén")) megnyitom_a_kiválasztott_posztot();
		}
	}
	
	public void parancssor_kategória_ellenőrzése_$(String from) {
		if (testData.post.categoryParancssor) {
			if (from.equals("a blog oldal csempéjén")) blogPage.parancssor_link_választása();
			else if (from.equals("a blog fejlécén")) blogPostPage.parancssor_link_választása();
			else if (from.equals("a kategóriák menüben")) blogPostPage.parancssor_menü_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
			if (!from.equals("a blog oldal csempéjén")) megnyitom_a_kiválasztott_posztot();
		}
	}
	
	public void példák_kategória_ellenőrzése_$(String from) {
		if (testData.post.categoryPéldák) {
			if (from.equals("a blog oldal csempéjén")) blogPage.példák_link_választása();
			else if (from.equals("a blog fejlécén")) blogPostPage.példák_link_választása();
			else if (from.equals("a kategóriák menüben")) blogPostPage.példák_menü_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
			if (!from.equals("a blog oldal csempéjén")) megnyitom_a_kiválasztott_posztot();
		}
	}
	
	public void tanulmányok_kategória_ellenőrzése_$(String from) {
		if (testData.post.categoryTanulmányok) {
			if (from.equals("a blog oldal csempéjén")) blogPage.tanulmányok_link_választása();
			else if (from.equals("a blog fejlécén")) blogPostPage.tanulmányok_link_választása();
			else if (from.equals("a kategóriák menüben")) blogPostPage.tanulmányok_menü_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
			if (!from.equals("a blog oldal csempéjén")) megnyitom_a_kiválasztott_posztot();
		}
	}
	
	public void újdonságok_kategória_ellenőrzése_$(String from) {
		if (testData.post.categoryÚjdonságok) {
			if (from.equals("a blog oldal csempéjén")) blogPage.újdonságok_link_választása();
			else if (from.equals("a blog fejlécén")) blogPostPage.újdonságok_link_választása();
			else if (from.equals("a kategóriák menüben")) blogPostPage.újdonságok_menü_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
			if (!from.equals("a blog oldal csempéjén")) megnyitom_a_kiválasztott_posztot();
		}
	}
	
	public void áttekintés_kategória_ellenőrzése_$(String from) {
		if (testData.post.categoryÁttekintés) {
			blogPage.áttekintés_link_választása();
			if (from.equals("a blog oldal csempéjén")) blogPage.áttekintés_link_választása();
			else if (from.equals("a blog fejlécén")) blogPostPage.áttekintés_link_választása();
			else if (from.equals("a kategóriák menüben")) blogPostPage.áttekintés_menü_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
			if (!from.equals("a blog oldal csempéjén")) megnyitom_a_kiválasztott_posztot();
		}
	}
	
	public void megnyitom_a_kiválasztott_posztot() {
		blogPage.kattintás_a_kiválasztott_poszt_címére(testData.post.title);
	}


}
