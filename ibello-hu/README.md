# Első lépések

### Ibello telepítése

1. Töltse le az ibello legfrissebb verzióját az alábbi oldalról: 
   https://ibello.hu/ibello/public/#interest

2. Indítsa el a telepítőt, majd kövesse az utasításait.

3.  A `git clone https://github.com/kokog78/ibello-tests.git választott-könyvtár` parancs segítségével végezze el a klónozást, egy Ön által meghatározott könyvtárba.

4. Indítsa el az ibello-t, amit két módon is megtehet:

   - A leklónozott demo projekt könyvtárában az `ibello` parancs segítségével

   - Az ibello telepítési könyvtárából az inditófájlra kattintással. Ebben az esetben az ibello grafikus felületén, a 'Projektek' menüben válassza ki az előzetesen leklónozott projekt könyvtárát, majd kattintson a 'Projekt megnyitása' gombra.

5. Sikeres megnyitás esetén az alábbi ablakhoz hasonló fogadja Önt.

   ![](/home/zolkasza/Képek/demo_projekt/nyito.png)

### Konfiguráció

Első lépésként érdemes a teszt környezet alap beállításait konfigurálni. Ezt az ibello grafikus felületén, a 'Konfiguráció' menüben végezhetjük el. Az itt beállított értékek a  `default.properties` fájlban kerülnek mentésre. A demó projektben az alábbi beállításokat használjuk:

![](/home/zolkasza/Képek/demo_projekt/config_hu.png)

#### Általános beállítások

- böngésző típusa: Google Chrome
- konfigurációs fájl karakterkészlete: UTF-8
- Java osztálybetöltő útvonala: ./build/classes/java/main ./build/resources/main ./build/lib/*
- logfájlok tömörítése: igen
- tesztriport neve: Example test for ibello.hu
- képernyőkép fájl formátuma: JPG
- képernyőkép mérete: 1000x1000
- tesztlépések neveiben a kisbetűk megváltoztathatósága: igen
- tesztelendő alkalmazás URL-je: https://ibello.hu/ibello/public/
- lágy ellenőrzések használata: igen