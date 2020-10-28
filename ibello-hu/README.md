# Első lépések

### Ibello telepítése

1. Töltse le az ibello legfrissebb verzióját az alábbi oldalról: 
   https://ibello.hu/ibello/public/#interest
2. Indítsa el, majd kövesse a telepítő utasításait.
3.  A `git clone https://github.com/kokog78/ibello-tests.git választott-könyvtár` parancs segítségével végezze el a klónozást, egy Ön által meghatározott könyvtárba.

### Konfiguráció

A teszt környezet alapértelmezett konfigurációját az ibello grafikus felületén, a `Konfiguráció` menüben végezhetjük el. Az itt beállított értékek a  `default.properties` fájlban kerülnek mentésre.

![](/home/zolkasza/Képek/demo_projekt/config_hu.png)

#### Általános beállítások

- böngésző típusa: a tesztek futtatásakor használt böngésző típusa
- böngészőablak mérete: a tesztek futtatásakor megnyíló böngészőablak mérete képpontokban
- konfigurációs fájl karakterkészlete: TODO
- Java osztálybetöltő útvonala: TODO
- logfájlok tömörítése: a logfájlok tömörítésének engedélyezése (igen/nem)
- tesztriport neve: az aktuális tesztriport megnevezése
- képernyőkép rögzítésének stratégiája: TODO
- képernyőkép fájl formátuma: png/jpg/gif
- képernyőkép mérete: a megadott stratégia alapján elkészült képernyőkép mérete képpontokban
- tesztlépések neveiben a kisbetűk megváltoztathatósága: TODO
- tesztelendő alkalmazás URL-je: a tesztelendő alkalmazás URL előtagja
- lágy ellenőrzések használata: igen/nem

#### Időzítés

Az itt felsorolt időzítéseket a különböző ellenőrzésekhez használhatjuk.

- bello.timeout.default: alapértelmezett időtúllépés, másodpercekben
- bello.timeout.page.load: az oldal betöltődés itőtúllépése, másodpercekben
- ibello.timeout.page.refresh: az oldal frissítésének időtúllépése, másodpercekben
- ibello.timeout.page.refresh: alapértelmezett időeltolás, másodpercekben
- ibello.timeout.page.refresh: a műveletek időeltolása, másodpercekben
- ibello.timeout.page.refresh: az ellenőrzések időeltolása, másodpercekben

 Az ellenőrzésekhez rendelhetünk saját várakozási időt is, amit aztán itt, a konfigurációs fájlban nagyobbra definiálunk:

```properties
ibello.timeout.OPEN_PAGE = 30
```

A várakozási időkhöz érdemes egy saját enum osztályt definiálni. Ebben a konstansok nevei a konfigurációban megjelenő nevek:

```java
public enum MyTimeouts {
	OPEN_PAGE,
	CLOSE_PAGE,
	...
}
```

A várakozási időt egyszerűen be kell illesztenünk az ellenőrzésbe:

```java
public void expectOpened() {
	expectations().withTimeout(MyTimeouts.OPEN_PAGE).expect(indicator).toBe().displayed();
}
```

#### Egyéb beállítások

Az ibello lehetőséget nyújt különböző tulajdonságok, és a hozzájuk tartozó értékek konfigurációs fájlba való elmetésére. Amennyiben a tulajdonság értéke érzékeny adat, használhatunk titkosítást is. A tulajdonság értékének kinyerésére a `getConfigurationValue(String tulajdonságNeve)` metódust használjuk a forráskódban. Ennek módját az alábbi példa mutatja:

```
String password = getConfigurationValue("password").toString();
```