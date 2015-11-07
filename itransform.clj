(ns official.itransform
  (:use [expectations]
        [clinglua.Gram]))

(defmacro expect-inglua [l sexp expected]
  (list 'expect expected (list 'in (list 'collect-forms sexp l))))

(expect-inglua :fr "(INTR 0 (invest PRES))" "je place mon argent")
(expect-inglua :fr "(INTR 1 (invest PRES))" "tu places ton argent")
(expect-inglua :fr "(INTR 2 (invest PRES))" "vous placez votre argent")
(expect-inglua :fr "(INTR 3 (invest PRES))" "il place son argent")
(expect-inglua :fr "(INTR 4 (invest PRES))" "nous plaçons notre argent")
(expect-inglua :fr "(INTR 7 (invest PRES))" "ils placent leur argent")
(expect-inglua :fr "(INTR () (invest INF))" "placer son argent")

;; neg + zero -> no
(expect-inglua :en "((TRANS NEG) 0 (see PRES) (INDEF cat PL))" "I don't see any cats")
(expect-inglua :es "((TRANS NEG) 0 (see PRES) (INDEF cat PL))" "no veo ningunos gatos")
(expect-inglua :nl "((TRANS NEG) 0 (see PRES) (INDEF cat PL))" "ik zie geen katten")
(expect-inglua :de "((TRANS NEG) 0 (see PRES) (INDEF cat PL))" "ich sehe keine Katzen")
(expect-inglua :fr "((TRANS NEG) 0 (see PRES) (INDEF cat PL))" "je ne vois aucuns chats")

;; fr 'adverbial pronoun'
;; infinitive
(expect-inglua :fr "(INTR () (go_away INF))" "s'en aller")

;; 1st singular
(expect-inglua :fr "((INTR) 0 (go_away PRES))" "je m'en vais")

;; negated
(expect-inglua :fr "((INTR NEG) 4 (go_away PRES))" "nous ne nous en allons pas")

;; question
(expect-inglua :fr "((INTR IROG) 1 (go_away PRES))" "tu t'en vas")

;; être chez vous
;; pron 0
(expect-inglua :fr "(INTR 0 (be_home PRES))" "je suis chez moi")

;; pron 1
(expect-inglua :fr "(INTR 1 (be_home PRES))" "tu es chez toi")

;; pron 12
(expect-inglua :fr "(INTR 12 (be_home PRES))" "elle est chez lui")

;; pron 5
(expect-inglua :fr "(INTR 5 (be_home PRES))" "vous êtes chez vous")

;; 3 sg
(expect-inglua :fr "(INTR (THE man) (be_home PRES))" "l'homme est chez lui")

;; 3 pl
(expect-inglua :fr "(INTR (THE woman PL) (be_home PRES))" "les femmes sont chez eux")

;; transformations with 'hurt'
;; correct en
(expect-inglua :en "(TRANS (THE finger) (be_painful PRES) 0)" "my finger hurts")
(expect-inglua :en "(TRANS (THE finger) (be_painful PRES) 1)" "your finger hurts")
(expect-inglua :en "(TRANS (THE finger) (be_painful PRES) 12)" "her finger hurts")
(expect-inglua :en "(TRANS (THE finger PL) (be_painful PRES) 7)" "their fingers hurt")
(expect-inglua :en "(INTR () (be_painful INF))" "to hurt")

;; correct es
(expect-inglua :es "(TRANS (THE finger) (be_painful PRES) 0)" "el dedo me duele")
(expect-inglua :es "(INTR () (be_painful INF))" "doler")

;; correct nl
(expect-inglua :nl "(TRANS (THE finger) (be_painful PRES) 0)" "mijn vinger doet pijn")
(expect-inglua :nl "(INTR () (be_painful INF))" "pijn doen")

;; correct de
(expect-inglua :de "(TRANS (THE finger) (be_painful PRES) 0)" "mein Finger tut weh")
(expect-inglua :de "(INTR () (be_painful INF))" "wehtun")

;; correct fr
(expect-inglua :fr "(TRANS (THE finger) (be_painful PRES) 0)" "j'ai mal au doigt")

;; ind -> object
;; Leid tun
(expect-inglua :de "(INTR 0 (be_sorry PRES))" "es tut mir Leid")

;; standje geven
(expect-inglua :nl "(TRANS 0 (scold PRES) (THE girl))" "ik geef het meisje een standje")

;; onderdak bieden
(expect-inglua :nl "(TRANS 0 (shelter_v PRES) (THE girl))" "ik bied het meisje onderdak")
(expect-inglua :nl "(TRANS 0 (shelter_v PRES) (THE girl))" "ik bied onderdak aan het meisje")

;; infliger une amende
(expect-inglua :fr "(TRANS 0 (fine PRES) (THE girl))" "j'inflige une amende à la fille")

;; dar una palmadita
(expect-inglua :es "(TRANS 0 (pat PRES) (THE dog))" "doy una palmadita al perro")

;; hacer daño
(expect-inglua :es "(TRANS 1 (hurt PRES) 0)" "tú me haces daño")

;; hacer daño
(expect-inglua :nl "(TRANS 1 (hurt PRES) 0)" "je doet me pijn")

;; wehtun
(expect-inglua :de "(TRANS 0 (hurt PRES) 1)" "ich tue dir weh")

;; danken
(expect-inglua :de "(TRANS 0 (thank PRES) 1)" "ich danke dir")

;; glauben
(expect-inglua :de "(TRANS 0 (believe PRES) 1)" "ich glaube dir")

;; bei sich aufnehmen
(expect-inglua :de "(TRANS 1 (shelter_v PRES) (THE girl))" "du nimmst das Mädchen bei dir auf")
(expect-inglua :de "(TRANS 4 (shelter_v PRES) (THE girl))" "wir nehmen das Mädchen bei uns auf")
(expect-inglua :de "(TRANS (THE wolf PL) (shelter_v PRES) (THE girl))" "die Wölfe nehmen das Mädchen bei ihnen auf")

;; object complement
;; tomar prestado
(expect-inglua :es "(TRANS 0 (borrow PRES) (P1 raincoat))" "tomo tu impermeable prestado")
(expect-inglua :es "(TRANS 0 (borrow PRES) (P1 black skirt))" "tomo tu falda negra prestada")

;; overstuur maken
(expect-inglua :nl "(TRANS 1 (upset_v PRES) 12)" "je maakt haar overstuur")

;; transformations
;; intransitive with added object
(expect-inglua :fr "(INTR 0 (pause PRES))" "je fais une pause")

;; transitive to dative with auto object
(expect-inglua :nl "(TRANS 0 (shelter_v PRES) (THE crocodile PL))" "ik bied onderdak aan de krokodillen")

;; added reflexive with preposition
(expect-inglua :de "(TRANS 0 (shelter_v PRES) (THE crocodile PL))" "ich nehme die Krokodile bei mir auf")

;; verb with preposition
(expect-inglua :en "(TRANS 0 (turn_over PRES) (THE map))" "I turn over the map")

;; infinitive
(expect-inglua :nl "(DAT 0 (show PRES) (THE lion) (INDEF girl))" "ik laat de leeuw aan een meisje zien")

;; transitive 4th -> 3rd
(expect-inglua :de "(TRANS 1 (hurt PRES) 0)" "du tust mir weh")

;; subject object switch
(expect-inglua :fr "(TRANS 0 (pine_for PRES) (THE owl PL))" "les hiboux me manquent")
