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
	private BlogPostPage blogPostPage;
	
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
		
	}
	
	public void poszt_fejléce_magyarul_jelenik_meg() {
		
	}
	
	public void poszt_fejléce_angolul_jelenik_meg() {
		
	}
	
	public void poszt_szövege_magyarul_jelenik_meg() {
		
	}
	
	public void poszt_szövege_angolul_jelenik_meg() {
		
	}
	
	public void az_ibello_blog_poszt_oldala_magyarul_jelenik_meg() {
		
	}
	
	public void az_ibello_blog_poszt_oldala_angolul_jelenik_meg() {
		
	}
	
	public void bővítmények_kategória_ellenőrzése() {
		if (testData.post.categoryBővítmények) {
			blogPage.bővítmények_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
		}
	}
	
	public void grafikus_felület_kategória_ellenőrzése() {
		if (testData.post.categoryGrafikusFelület) {
			blogPage.grafikus_felület_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
		}
	}
	
	public void mesterséges_intelligencia_kategória_ellenőrzése() {
		if (testData.post.categoryMesterségesIntelligencia) {
			blogPage.mesterséges_intelligencia_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
		}
	}
	
	public void parancssor_kategória_ellenőrzése() {
		if (testData.post.categoryParancssor) {
			blogPage.parancssor_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
		}
	}
	
	public void példák_kategória_ellenőrzése() {
		if (testData.post.categoryPéldák) {
			blogPage.példák_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
		}
	}
	
	public void tanulmányok_kategória_ellenőrzése() {
		if (testData.post.categoryTanulmányok) {
			blogPage.tanulmányok_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
		}
	}
	
	public void újdonságok_kategória_ellenőrzése() {
		if (testData.post.categoryÚjdonságok) {
			blogPage.újdonságok_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
		}
	}
	
	public void áttekintés_kategória_ellenőrzése() {
		if (testData.post.categoryÁttekintés) {
			blogPage.áttekintés_link_választása();
			kiválasztott_poszt_megjelenik_a_magyar_blog_oldalon();
		}
	}
	
	public void megnyitom_a_kiválasztott_posztot() {
		blogPage.kattintás_a_kiválasztott_poszt_címére(testData.post.title);
	}
	
	public void poszt_címe_megjelenik_az_oldal_fejlécében_magyarul() {
		
	}
	
	public void megjelenik_a_kiválasztott_poszt_fejléce_magyarul() {
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
	
	public void megjelenik_a_kiválasztott_poszt_szövege_magyarul() {
		
	}

}
