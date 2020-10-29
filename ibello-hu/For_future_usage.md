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



