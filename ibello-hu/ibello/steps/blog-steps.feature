# namespace: Blog

Step: Blog: Kiválasztok egy posztot
	Given Tesztadat: Az Aktuális Poszt Címe Legyen "180912"

Step: Blog: Megnyitom a blog oldalt
	Given Navigáció: Az Ibello Honlapján Vagyok
	Given Navigáció: Megnyitom a Blog Oldalt

Step: Blog: Ellenőrzöm hogy a poszt megjelenik a blog oldalon
	Given Blog oldalak: Kiválasztott Poszt Megjelenik a Magyar Blog Oldalon
