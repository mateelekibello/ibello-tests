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
	
	

}
