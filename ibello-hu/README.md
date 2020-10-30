# Első lépések

### Telepítés, indítás

1. Töltsd le az ibello legfrissebb verzióját az alábbi oldalról: 
   https://ibello.hu/ibello/public/#interest

2. Indítsd el a telepítőt, majd kövesd az utasításait.

3. - Amennyiben az elkészített demó projektet szeretnéd tanulmányozni a `git clone https://github.com/kokog78/ibello-tests.git választott-könyvtár` parancs segítségével végezd el a klónozást, egy általad meghatározott könyvtárba.
   - Ha az oktató dokumentumok szerint magad hoznád létre a demó projekt feladatát, az `ibello init --gradle` (maven esetén `--maven`) parancs segítségével hozz létre egy új projektet egy általad választott könyvtárban.

4. Indítsd el az ibello-t:

   - A leklónozott demo projekt könyvtárában az `ibello` parancs segítségével
   - Az általad létrehozott új projekt könyvtárában az `ibello` parancs segítségével
   - Az ibello telepítési könyvtárából az inditófájlra kattintással. Ebben az esetben az ibello grafikus felületén, a 'Projektek' menüben válaszd ki az előzetesen leklónozott vagy létrehozott projekt könyvtárát, majd kattints a 'Projekt megnyitása' gombra.

5. Sikeres megnyitás esetén az alábbi ablakhoz hasonló fogadja Önt.

   ![](/home/zolkasza/Képek/demo_projekt/nyito.png)

### Konfiguráció

Új projekt létrehozása esetén, első lépésként érdemes a teszt környezet alap beállításait konfigurálni. Ezt az ibello grafikus felületén, a 'Konfiguráció' menüben végezhetjük el. Az itt beállított értékek a  `default.properties` fájlban kerülnek mentésre. A demó projektben az alábbi beállításokat használjuk:

![](/home/zolkasza/Képek/demo_projekt/config_hu.png)

#### A demó projektben használt általános beállítások

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