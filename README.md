# Zadatak

Napisati aplikaciju kojom se realizuje prijavljivanje ispita u tekućem ispitnom roku za studente koji studiraju po starom statutu.

- Klasa **Student** opisuje prijavu jednog ispita od strane jednog studenta. Instance promenjljive klase su: kategorija
  (može biti "redovni", "samofinasirajući" i "apsolvent"), ime, prezime i smer studenta (sve tipa String), datum prijave 
  (tipa Datum) i podaci o ispitu koji studen prijavljuje (tipa ispit). 
  Za redovnog studenta se dodatno zna njegova godina studija, kao i po koji put po redu prijavljuje ispit.
  Za samofinansirajućeg se dodatno zna njegova godina studija. 
  Poznato je da u rokovima "januar", "februar", "jun", "septembar" i "oktobar" svi studenti mogu polagati ispite, a da u 
  rokovima "mart", "april", "novembar" i "decembar" ispite mogu polagati samo apsolventi. Za svaki od ispitnih rokova zna
  se krajnji rok do kog je moguće prijaviti ispite (neka to bude do 1-og tog meseca).
- Klasa **Datum** od atributa (instancnih promenljivih) ima dan, mesec i godinu (sve je tipa int).
- Klasa **Ispit** od atributa (instancnih promenljivih) ima ime ispita (String), i godinu na kojoj se taj ispit sluša (tipa int). 
- U svakoj od navedenih klasa implementirati:
  - konstruktor za kreiranje objekta kada su dostupni svi neophodni podaci
  - kopi-konstuktor
  - neophodne get*() i set*() metode
  - metodu koja vraća String-reprezentaciju objekta klase (Datum ispisuje u formatu dd.mm.gggg.)
- Obezbediti da se polimorfna izvršavaju metodi:
  1. **int uplata();** koja vraća sumu novca koju je student uplatio prilikom prijave ispita. Redovni student ne plaća 
     ništa ako ispit prijavljuje manje od 3 puta, a plaća 300 dinara za ispit koji prijavljuje 3 ili više puta. 
     Samofinansirajući studenti i apsolventi plaćaju po 300 dinara za svaki prijavljeni ispit.
  2. **bolean moze(String rok);** koja treba da vrati da li student može prijaviti željeni ispit u datom roku. Student 
     može prijaviti samo ispite koje je odslušao i to do krajnjeg roka za ispitni rok u kome ima pravo da polaže ispite.
     Dopušteno je u klase dodavati i druge metode za kojima se ukaže potreba pri rešavanju zadatka.
