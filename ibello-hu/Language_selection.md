# Nyelv választás teszt

Ebben a dokumentumben végigvesszük az https://ibello.hu/ oldalon elérhető nyelv választó működését ellenőrző teszt elkészítését. A kész teszt a demo projekt repositoryban elérhető.

### Teszt lépései

- megnyitjuk az weblapot
- leellenőrizzük, hogy a megjelenő oldal a rendszerünknek megfelelő nyelven jelenik meg
- a navigációs sávban kiválasztjuk a másik nyelvet
  ![](/home/zolkasza/Képek/demo_projekt/nyelvvalasztas.png)
- leellenőrizzük, hogy a nyelv megváltozott
- visszaállítjuk az eredeti nyelvet
- leellenőrizzük, hogy a megjelenő oldal a rendszerünknek megfelelő nyelven jelenik meg

### Jellemző létrehozása

Jellemzőknek nevezzük azokat a `.feature` kiterjesztésű fájlokat, amik a teszt forgatókönyveket tartalmazzák. 

Új jellemző létrehozásához kattintsunk a 'Teszt tervezés' menün belül a 'Forgatókönyvek' opcióra. Az 'Új fájl' gombra kattintva adjuk meg a létrehozni kívánt fájl, illetve a jellemző nevét. Az 'Ok' gomb megnyomásával a jellemző létrejön. A demo projektben használt jellemző a 'changing-language' nevet viseli. Az újonnan létrehozott jellemzőbe vegyünk fel egy új forgatókönyvet. Ehhez kattintsunk az 'Új forgatókönyv létrehozása' gombra. A forgatókönyvek elkészítésekor a Gherkin nyelvi szabályok alapján a 'Given', 'When', 'Then' és 'And' kulcsszavak használhatóak. A nyelv választó teszteléséhez a forgatókönyvet a 'teszt lépései' szekcióban lévő pontok alapján írjuk meg. 

![](/home/zolkasza/Képek/demo_projekt/forgatókönyv.png)

A tesztlépésekben látható 'Language' a használt névteret jelöli. Ahhoz, hogy később az egyes jellemzőket külön is tudjuk futtatni érdemes cimkéket használni. A demo projektben a @full-test cimke az összes jellemzőben a @language csak ebben a jellemzőben van használva. 

Ezzel a jellemző a forgatókönyvvel elkészült és a projekt/fetatures/ mappában megtalálható.  

![](/home/zolkasza/Képek/demo_projekt/featureide.png)

### Workflow létrehozása

A 'workflow' egy olyan osztály ami a jellemzőben leírt forgatókönyvek lépéseit fejti ki java metódusok segítségével. 

Ennek létrehozásához navigáljunk a 'Tesztlépések' menün belül a 'Nem létező tesztlépések' opcióra. Itt láthatóak az előzőleg létrehozott tesztlépések, a hozzájuk tartozó névtérrel együtt. Jelöljük ki az összes tesztlépést és kattintsunk a 'Kód generálása' gombra. 

![](/home/zolkasza/Képek/demo_projekt/generalt_lépések.png)

Ez a kód nem kerül be automatikus a forráskódba. Ehhez először hozzunk létre egy java osztályt, majd a generált kódot másoljuk be abba. A demo projektben az ehhez a teszthez tartozó workflow-t 'LanguageWorkflow' néven találja meg.

#### `i_am_on_homepage()` metódus kifejtése

A teszt első lépéseként implementáljuk az `i_am_on_homepage()` metódust, amivel megnyitjuk a kezdő oldalt. Mivel ez egy egyszerű lépés ezért ennek a metódusnak a törzsében egyetlen metódus hívás lesz. Ennek ellenére a különböző szinteket (workflow, steps, page object) meg kell tartanunk a későbbi újrafelhasználhatóság érdekében. A kezdőoldal megnyitásának logikáját szervezzük ki a 'NavigationSteps' osztályba, hogy a workflow áttekinthető maradjon. 

```
private NavigationSteps navigationSteps;

public void i_am_on_homepage() {
    navigationSteps.i_open_the_homepage();
}
```

#### NavigationSteps létrehozása

Hozzunk létre az IDE-ben egy új, 'NavigationSteps' osztályt. Fontos, hogy minden 'steps' osztály a 'StepLibrary' osztályból kell, hogy leszármazzon. 

```
public void i_open_the_homepage() {
    homePage.i_open_homepage();
    i_am_on_homepage();
}
```



```
public void i_am_on_homepage() {
    String url = "/#home";
    homePage.expect_url_is_$(url);
    homePage.i_expect_main_lane_is_displayed();
    navigationBar.expect_menu_component_is_displayed();
}
```

Ehhez tartozo homePAge és navigationBar page objectek













csak egy metodus, de az ujrafelhasználhatóság miatt szétszedve használjuk

```
public void the_current_language_is_the_default() {
    LanguageSelection data = testData().fromJson(LanguageSelection.class).load();
    languageSteps.based_on_$_test_data_i_check_if_the_language_is_default(data);
}
```

itt mrá a tesztadat is bejön a képbe, plusz átadott paraméter

#### Steps létrehozása

Ahhoz, hogy a projekt jól struktúrált és újrafelhasználható legyen, a workflow-ban lévő lépéseket további allépésekre lehet bontani. Ezek az allépések egy 'Steps' osztályban fejthetőek ki. A könnyebb átláthatóság érdekében érdemes a főbb üzleti logikákat itt kifejteni, illetve minden workflow-hoz külön steps osztályt használni. Előfordulhat azonban olyan eset, hogy egy workflow-ban egy másik steps-ben kifejtett metódust is felhasználunk. Az itt tárgyalt demo projektben péládul a navigációs sávot érintő funkciók egy külön 'NavigationSteps' osztályban találhatóak. Így a teszt első lépésekét használt 'I am on homepage' is abban az osztályban kifejtett metódust használja.

Hozzon létre az Ön által használt IDE-ben egy új osztályt. A későbbi átláthatóság miatt érdemes a nevében feltüntetni a 'Steps' szócskát. A demo projektben a nyelv választáshoz tartozó osztály a 'LanguageSteps' nevet viseli. Fontos, hogy minden 'steps' osztály a 'StepLibrary' osztályból kell, hogy leszármazzon. A szükséges üzleti logika megíráshoz elengedhetetlen lépés a felhasznált oldal-leírók létrehozása.

első

```
private HomePage homePage;

public void i_open_the_homepage() {
    homePage.i_open_homepage();
}
```

második

```
public void based_on_$_test_data_i_check_if_the_language_is_default(LanguageSelection data) {
    check_texts_based_on_$_test_data_with_$_boolean(data, true);
}
```

```
@Internal
public void check_texts_based_on_$_test_data_with_$_boolean(LanguageSelection data, boolean isDefault) {
    if (data != null && data.getLanguage() != null && data.getHungarianTexts() != null
            && data.getEnglishTexts() != null) {
        switch (data.getLanguage()) {
            case HUNGARIAN:
                if (isDefault) {
                    list_is_displayed(data.getEnglishTexts());
                    list_is_not_displayed(data.getHungarianTexts());
                } else {
                    list_is_displayed(data.getHungarianTexts());
                    list_is_not_displayed(data.getEnglishTexts());
                }
                break;
            case ENGLISH:
                if (isDefault) {
                    list_is_displayed(data.getHungarianTexts());
                    list_is_not_displayed(data.getEnglishTexts());
                } else {
                    list_is_displayed(data.getEnglishTexts());
                    list_is_not_displayed(data.getHungarianTexts());
                }
                break;
            default:
                break;
        }
    } else {
        throw new AssertionError("One or more testdata are null!");
    }
}
```

```
private void list_is_displayed(List<String>displayedList) {
    for (String text : displayedList) {
        homePage.assume_$_text_is_displayed(text);
    }
}

private void list_is_not_displayed(List<String>notDisplayedList) {
    for (String text : notDisplayedList) {
        homePage.assume_$_text_is_not_displayed(text);
    }
}
```

#### Oldal-leírók létrehozása

elsőhöz nem kell semmilyen elemet felvenni

```
public void i_open_homepage() {
    browser().resize(2000, 1000);
    browser().maximize();
    browser().openURL("/#home");
}
```

másodikhoz kell

```
@Find(by = By.TEXT, using = "${0}")
@Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "welcome-main-lane")
private WebElement text;

public void assume_$_text_is_displayed(String textToCheck) {
    expectations().assume(text.applyParameters(textToCheck)).toBe().displayed();
}

public void assume_$_text_is_not_displayed(String textToCheck) {
    expectations().assume(text.applyParameters(textToCheck)).toNotBe().displayed();
}
```



A projekt áttekinthetőségének, újrahasználhatóságának érdekében a navigációval kapcsolatos összes tevékenységet egy külön steps osztályban hozzuk létre. 