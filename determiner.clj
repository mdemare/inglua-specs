(ns official.determiner
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

;; determiners singular countable
;; THIS
(expect-inglua :en (NOUN (THIS fence)) "this fence")
(expect-inglua :es (NOUN (THIS fence)) "esta valla")
(expect-inglua :nl (NOUN (THIS fence)) "dit hek")
(expect-inglua :de (NOUN (THIS fence)) "dieser Zaun")
(expect-inglua :fr (NOUN (THIS fence)) "cette clôture")
(expect-inglua :it (NOUN (THIS fence)) "questo recinto")

;; THAT
(expect-inglua :en (NOUN (THAT fence)) "that fence")
(expect-inglua :es (NOUN (THAT fence)) "esa valla")
(expect-inglua :nl (NOUN (THAT fence)) "dat hek")
(expect-inglua :de (NOUN (THAT fence)) "jener Zaun")
(expect-inglua :fr (NOUN (THAT fence)) "cette clôture-là")
(expect-inglua :it (NOUN (THAT fence)) "quello recinto")

(expect-inglua :en (NOUN (THAT fence)) "that fence")
(expect-inglua :es (NOUN (THAT fence)) "aquella valla")
(expect-inglua :nl (NOUN (THAT fence)) "dat hek")
(expect-inglua :de (NOUN (THAT fence)) "jener Zaun")
(expect-inglua :fr (NOUN (THAT fence)) "cette clôture-là")
(expect-inglua :it (NOUN (THAT fence)) "quello recinto")

;; IROG
(expect-inglua :en (NOUN (WHICH style)) "which style")
(expect-inglua :es (NOUN (WHICH style)) "cuál estilo")
(expect-inglua :nl (NOUN (WHICH style)) "welke stijl")
(expect-inglua :de (NOUN (WHICH style)) "welcher Stil")
(expect-inglua :fr (NOUN (WHICH style)) "quel style")
(expect-inglua :it (NOUN (WHICH style)) "quale stile")

;; EACH
(expect-inglua :en (NOUN (EACH jet)) "each jet")
(expect-inglua :es (NOUN (EACH jet)) "cada chorro")
(expect-inglua :nl (NOUN (EACH jet)) "elke straal")
(expect-inglua :de (NOUN (EACH jet)) "jede Düse")
(expect-inglua :fr (NOUN (EACH jet)) "chaque jet")
(expect-inglua :it (NOUN (EACH jet)) "ogni getto")
(expect-inglua :it (NOUN (EACH jet)) "ciascuno getto")

;; SUCH
(expect-inglua :en (NOUN (SUCH donkey)) "such a donkey")
(expect-inglua :es (NOUN (SUCH donkey)) "tal burro")
(expect-inglua :nl (NOUN (SUCH donkey)) "zo'n ezel")
(expect-inglua :nl (NOUN (SUCH donkey)) "een dergelijke ezel")
(expect-inglua :de (NOUN (SUCH donkey)) "ein solcher Esel")
(expect-inglua :fr (NOUN (SUCH donkey)) "un tel âne")
(expect-inglua :it (NOUN (SUCH donkey)) "tali somaro")

;; SAME
(expect-inglua :en (NOUN (SAME fence)) "the same fence")
(expect-inglua :es (NOUN (SAME fence)) "la misma valla")
(expect-inglua :nl (NOUN (SAME fence)) "hetzelfde hek")
(expect-inglua :de (NOUN (SAME fence)) "derselbe Zaun")
(expect-inglua :fr (NOUN (SAME fence)) "la même clôture")
(expect-inglua :it (NOUN (SAME fence)) "lo stesso recinto")

;; OTHER
(expect-inglua :en (NOUN (OTHER fence)) "the other fence")
(expect-inglua :es (NOUN (OTHER fence)) "la otra valla")
(expect-inglua :nl (NOUN (OTHER fence)) "het andere hek")
(expect-inglua :de (NOUN (OTHER fence)) "der andere Zaun")
(expect-inglua :fr (NOUN (OTHER fence)) "l'autre clôture")
(expect-inglua :it (NOUN (OTHER fence)) "l'altro recinto")

;; ANOTHER
(expect-inglua :en (NOUN (ANOTHER fence)) "another fence")
(expect-inglua :es (NOUN (ANOTHER fence)) "otra valla")
(expect-inglua :nl (NOUN (ANOTHER fence)) "een ander hek")
(expect-inglua :de (NOUN (ANOTHER fence)) "ein anderer Zaun")
(expect-inglua :fr (NOUN (ANOTHER fence)) "une autre clôture")
(expect-inglua :it (NOUN (ANOTHER fence)) "un altro recinto")

;; ALL
(expect-inglua :en (NOUN (ALL city)) "the whole city")
(expect-inglua :en (NOUN (ALL city)) "the entire city")
(expect-inglua :es (NOUN (ALL city)) "toda la ciudad")
(expect-inglua :nl (NOUN (ALL city)) "de hele stad")
(expect-inglua :de (NOUN (ALL city)) "die ganze Stadt")
(expect-inglua :fr (NOUN (ALL city)) "toute la ville")
(expect-inglua :it (NOUN (ALL city)) "tutta la città")


;; determiners plural
;; THIS
(expect-inglua :en (NOUN (THIS fence PL)) "these fences")
(expect-inglua :es (NOUN (THIS fence PL)) "estas vallas")
(expect-inglua :nl (NOUN (THIS fence PL)) "deze hekken")
(expect-inglua :de (NOUN (THIS fence PL)) "diese Zäune")
(expect-inglua :fr (NOUN (THIS fence PL)) "cettes clôtures")
(expect-inglua :it (NOUN (THIS fence PL)) "questi recinti")

;; THAT
(expect-inglua :en (NOUN (THAT fence PL)) "those fences")
(expect-inglua :es (NOUN (THAT fence PL)) "esas vallas")
(expect-inglua :nl (NOUN (THAT fence PL)) "die hekken")
(expect-inglua :de (NOUN (THAT fence PL)) "jene Zäune")
(expect-inglua :fr (NOUN (THAT fence PL)) "cettes clôtures-là")
(expect-inglua :it (NOUN (THAT fence PL)) "quei recinti")

(expect-inglua :en (NOUN (THAT fence PL)) "those fences")
(expect-inglua :es (NOUN (THAT fence PL)) "aquellas vallas")
(expect-inglua :nl (NOUN (THAT fence PL)) "die hekken")
(expect-inglua :de (NOUN (THAT fence PL)) "jene Zäune")
(expect-inglua :fr (NOUN (THAT fence PL)) "cettes clôtures-là")
(expect-inglua :it (NOUN (THAT fence PL)) "quei recinti")

;; SUCH
(expect-inglua :en (NOUN (SUCH lark PL)) "such larks")
(expect-inglua :es (NOUN (SUCH lark PL)) "tales alondras")
(expect-inglua :nl (NOUN (SUCH lark PL)) "zulke leeuweriken")
(expect-inglua :nl (NOUN (SUCH lark PL)) "dergelijke leeuweriken")
(expect-inglua :de (NOUN (SUCH lark PL)) "solche Lerchen")
(expect-inglua :fr (NOUN (SUCH lark PL)) "telles alouettes")
(expect-inglua :it (NOUN (SUCH lark PL)) "tale allodole")

;; MANY
(expect-inglua :en (NOUN (MANY trunk PL)) "many trunks")
(expect-inglua :es (NOUN (MANY trunk PL)) "muchas trompas")
(expect-inglua :nl (NOUN (MANY trunk PL)) "veel slurven")
(expect-inglua :de (NOUN (MANY trunk PL)) "viele Rüssel")
(expect-inglua :fr (NOUN (MANY trunk PL)) "beaucoup de trompes")
(expect-inglua :it (NOUN (MANY trunk PL)) "molte proboscidi")

;; TOO MANY
(expect-inglua :en (NOUN (TOO_MANY trunk PL)) "too many trunks")
(expect-inglua :es (NOUN (TOO_MANY trunk PL)) "demasiadas trompas")
(expect-inglua :nl (NOUN (TOO_MANY trunk PL)) "te veel slurven")
(expect-inglua :de (NOUN (TOO_MANY trunk PL)) "zu viele Rüssel")
(expect-inglua :fr (NOUN (TOO_MANY trunk PL)) "trop trompes")
(expect-inglua :it (NOUN (TOO_MANY trunk PL)) "troppe proboscidi")

;; ALL
(expect-inglua :en (NOUN (ALL head PL)) "all heads")
(expect-inglua :es (NOUN (ALL head PL)) "todas las cabezas")
(expect-inglua :nl (NOUN (ALL head PL)) "alle hoofden")
(expect-inglua :de (NOUN (ALL head PL)) "alle Köpfe")
(expect-inglua :fr (NOUN (ALL head PL)) "toutes les têtes")
(expect-inglua :it (NOUN (ALL head PL)) "tutte le teste")

;; FEW
(expect-inglua :en (NOUN (FEW head PL)) "few heads")
(expect-inglua :es (NOUN (FEW head PL)) "pocas cabezas")
(expect-inglua :nl (NOUN (FEW head PL)) "weinig hoofden")
(expect-inglua :de (NOUN (FEW head PL)) "wenige Köpfe")
(expect-inglua :fr (NOUN (FEW head PL)) "peu de têtes")
(expect-inglua :it (NOUN (FEW head PL)) "poce teste")

;; SOME
(expect-inglua :en (NOUN (SOME head PL)) "some heads")
(expect-inglua :es (NOUN (SOME head PL)) "algunas cabezas")
(expect-inglua :nl (NOUN (SOME head PL)) "sommige hoofden")
(expect-inglua :de (NOUN (SOME head PL)) "manche Köpfe")
(expect-inglua :fr (NOUN (SOME head PL)) "certaines têtes")
(expect-inglua :it (NOUN (SOME head PL)) "certe teste")

;; A FEW
(expect-inglua :en (NOUN (A_FEW head PL)) "a few heads")
(expect-inglua :es (NOUN (A_FEW head PL)) "unas cabezas")
(expect-inglua :nl (NOUN (A_FEW head PL)) "enkele hoofden")
(expect-inglua :de (NOUN (A_FEW head PL)) "einige Köpfe")
(expect-inglua :fr (NOUN (A_FEW head PL)) "quelques têtes")
(expect-inglua :it (NOUN (A_FEW head PL)) "alcune teste")
(expect-inglua :nl (NOUN (A_FEW head PL)) "enige hoofden")

;; BOTH
(expect-inglua :en (NOUN (BOTH shop PL)) "both shops")
(expect-inglua :es (NOUN (BOTH shop PL)) "ambas tiendas")
(expect-inglua :nl (NOUN (BOTH shop PL)) "beide winkels")
(expect-inglua :de (NOUN (BOTH shop PL)) "beide Läden")
(expect-inglua :fr (NOUN (BOTH shop PL)) "les deux boutiques")
(expect-inglua :it (NOUN (BOTH shop PL)) "entrambi negozi")

;; MOST
(expect-inglua :en (NOUN (MOST shop PL)) "most shops")
(expect-inglua :es (NOUN (MOST shop PL)) "la mayoría de tiendas")
(expect-inglua :nl (NOUN (MOST shop PL)) "de meeste winkels")
(expect-inglua :de (NOUN (MOST shop PL)) "die meiste Läden")
(expect-inglua :fr (NOUN (MOST shop PL)) "la plupart des boutiques")
(expect-inglua :it (NOUN (MOST shop PL)) "la maggior parte dei negozi")

;; SEVERAL
(expect-inglua :en (NOUN (SEVERAL shop PL)) "several shops")
(expect-inglua :es (NOUN (SEVERAL shop PL)) "varias tiendas")
(expect-inglua :nl (NOUN (SEVERAL shop PL)) "verscheidene winkels")
(expect-inglua :de (NOUN (SEVERAL shop PL)) "mehrere Läden")
(expect-inglua :fr (NOUN (SEVERAL shop PL)) "plusieurs boutiques")
(expect-inglua :it (NOUN (SEVERAL shop PL)) "parecchi negozi")
(expect-inglua :it (NOUN (SEVERAL shop PL)) "vari negozi")

;; OTHER
(expect-inglua :en (NOUN (OTHER shop PL)) "the other shops")
(expect-inglua :es (NOUN (OTHER shop PL)) "las otras tiendas")
(expect-inglua :nl (NOUN (OTHER shop PL)) "de andere winkels")
(expect-inglua :de (NOUN (OTHER shop PL)) "die anderen Läden")
(expect-inglua :fr (NOUN (OTHER shop PL)) "les autres boutiques")
(expect-inglua :it (NOUN (OTHER shop PL)) "gli altri negozi")

;; ANOTHER
(expect-inglua :en (NOUN (ANOTHER shop PL)) "other shops")
(expect-inglua :es (NOUN (ANOTHER shop PL)) "otras tiendas")
(expect-inglua :nl (NOUN (ANOTHER shop PL)) "andere winkels")
(expect-inglua :de (NOUN (ANOTHER shop PL)) "andere Läden")
(expect-inglua :fr (NOUN (ANOTHER shop PL)) "des autres boutiques")
(expect-inglua :it (NOUN (ANOTHER shop PL)) "altri negozi")

;; determiners singular uncountable
;; SUCH
(expect-inglua :en (NOUN (SUCH luck)) "such luck")
(expect-inglua :es (NOUN (SUCH luck)) "tal suerte")
(expect-inglua :nl (NOUN (SUCH luck)) "zulk geluk")
(expect-inglua :nl (NOUN (SUCH luck)) "dergelijk geluk")
(expect-inglua :de (NOUN (SUCH luck)) "solches Glück")
(expect-inglua :fr (NOUN (SUCH luck)) "telle chance")
(expect-inglua :it (NOUN (SUCH luck)) "tale fortuna")

;; MANY
(expect-inglua :en (NOUN (MANY luck)) "much luck")
(expect-inglua :es (NOUN (MANY luck)) "mucha suerte")
(expect-inglua :nl (NOUN (MANY luck)) "veel geluk")
(expect-inglua :de (NOUN (MANY luck)) "viel Glück")
(expect-inglua :fr (NOUN (MANY luck)) "beaucoup de chance")
(expect-inglua :it (NOUN (MANY luck)) "molta fortuna")

;; ALL
(expect-inglua :en (NOUN (ALL water)) "all the water")
(expect-inglua :es (NOUN (ALL water)) "toda el agua")
(expect-inglua :nl (NOUN (ALL water)) "al het water")
(expect-inglua :de (NOUN (ALL water)) "alles Wasser")
(expect-inglua :fr (NOUN (ALL water)) "toute l'eau")
(expect-inglua :it (NOUN (ALL water)) "tutta l'acqua")

;; FEW
(expect-inglua :en (NOUN (FEW water)) "little water")
(expect-inglua :es (NOUN (FEW water)) "poca agua")
(expect-inglua :nl (NOUN (FEW water)) "weinig water")
(expect-inglua :de (NOUN (FEW water)) "wenig Wasser")
(expect-inglua :fr (NOUN (FEW water)) "peu d'eau")
(expect-inglua :it (NOUN (FEW water)) "poca acqua")

;; ANOTHER
(expect-inglua :en (NOUN (ANOTHER water)) "other water")
(expect-inglua :es (NOUN (ANOTHER water)) "otra agua")
(expect-inglua :nl (NOUN (ANOTHER water)) "ander water")
(expect-inglua :de (NOUN (ANOTHER water)) "anderes Wasser")
(expect-inglua :fr (NOUN (ANOTHER water)) "autre eau")
(expect-inglua :it (NOUN (ANOTHER water)) "altra acqua")


;; possessives singular
;; mijn
(expect-inglua :en (NOUN (P0 fence)) "my fence")
(expect-inglua :es (NOUN (P0 fence)) "mi valla")
(expect-inglua :nl (NOUN (P0 fence)) "mijn hek")
(expect-inglua :de (NOUN (P0 fence)) "mein Zaun")
(expect-inglua :fr (NOUN (P0 fence)) "ma clôture")
(expect-inglua :it (NOUN (P0 fence)) "il mio recinto")

;; jouw
(expect-inglua :en (NOUN (P1 fence)) "your fence")
(expect-inglua :es (NOUN (P1 fence)) "tu valla")
(expect-inglua :nl (NOUN (P1 fence)) "jouw hek")
(expect-inglua :de (NOUN (P1 fence)) "dein Zaun")
(expect-inglua :fr (NOUN (P1 fence)) "ta clôture")
(expect-inglua :it (NOUN (P1 fence)) "il tuo recinto")

;; uw
(expect-inglua :en (NOUN (P2 fence)) "your fence")
(expect-inglua :es (NOUN (P2 fence)) "su valla")
(expect-inglua :nl (NOUN (P2 fence)) "uw hek")
(expect-inglua :de (NOUN (P2 fence)) "Ihr Zaun")
(expect-inglua :fr (NOUN (P2 fence)) "votre clôture")
(expect-inglua :it (NOUN (P2 fence)) "il suo recinto")

;; zijn
(expect-inglua :en (NOUN (P3 style)) "his style")
(expect-inglua :es (NOUN (P3 style)) "su estilo")
(expect-inglua :nl (NOUN (P3 style)) "zijn stijl")
(expect-inglua :de (NOUN (P3 style)) "sein Stil")
(expect-inglua :fr (NOUN (P3 style)) "son style")
(expect-inglua :it (NOUN (P3 style)) "il suo stile")

;; ons
(expect-inglua :en (NOUN (P4 jet)) "our jet")
(expect-inglua :es (NOUN (P4 jet)) "nuestro chorro")
(expect-inglua :nl (NOUN (P4 jet)) "onze straal")
(expect-inglua :de (NOUN (P4 jet)) "unsere Düse")
(expect-inglua :fr (NOUN (P4 jet)) "notre jet")
(expect-inglua :it (NOUN (P4 jet)) "il nostro getto")

;; jullie
(expect-inglua :en (NOUN (P5 donkey)) "your donkey")
(expect-inglua :es (NOUN (P5 donkey)) "vuestro burro")
(expect-inglua :nl (NOUN (P5 donkey)) "jullie ezel")
(expect-inglua :de (NOUN (P5 donkey)) "euer Esel")
(expect-inglua :fr (NOUN (P5 donkey)) "votre âne")
(expect-inglua :it (NOUN (P5 donkey)) "il vostro somaro")

;; hun
(expect-inglua :en (NOUN (P7 trunk)) "their trunk")
(expect-inglua :es (NOUN (P7 trunk)) "su trompa")
(expect-inglua :nl (NOUN (P7 trunk)) "hun slurf")
(expect-inglua :de (NOUN (P7 trunk)) "ihr Rüssel")
(expect-inglua :fr (NOUN (P7 trunk)) "leur trompe")
(expect-inglua :it (NOUN (P7 trunk)) "la loro proboscide")

;; haar
(expect-inglua :en (NOUN (P12 trunk)) "her trunk")
(expect-inglua :es (NOUN (P12 trunk)) "su trompa")
(expect-inglua :nl (NOUN (P12 trunk)) "haar slurf")
(expect-inglua :de (NOUN (P12 trunk)) "ihr Rüssel")
(expect-inglua :fr (NOUN (P12 trunk)) "sa trompe")
(expect-inglua :it (NOUN (P12 trunk)) "la sua proboscide")

;; determiners plural
;; mijn
(expect-inglua :en (NOUN (P0 fence PL)) "my fences")
(expect-inglua :es (NOUN (P0 fence PL)) "mis vallas")
(expect-inglua :nl (NOUN (P0 fence PL)) "mijn hekken")
(expect-inglua :de (NOUN (P0 fence PL)) "meine Zäune")
(expect-inglua :fr (NOUN (P0 fence PL)) "mes clôtures")
(expect-inglua :it (NOUN (P0 fence PL)) "i miei recinti")

;; jouw
(expect-inglua :en (NOUN (P1 fence PL)) "your fences")
(expect-inglua :es (NOUN (P1 fence PL)) "tus vallas")
(expect-inglua :nl (NOUN (P1 fence PL)) "jouw hekken")
(expect-inglua :de (NOUN (P1 fence PL)) "deine Zäune")
(expect-inglua :fr (NOUN (P1 fence PL)) "tes clôtures")
(expect-inglua :it (NOUN (P1 fence PL)) "i tuoi recinti")

;; uw
(expect-inglua :en (NOUN (P2 fence PL)) "your fences")
(expect-inglua :es (NOUN (P2 fence PL)) "sus vallas")
(expect-inglua :nl (NOUN (P2 fence PL)) "uw hekken")
(expect-inglua :de (NOUN (P2 fence PL)) "Ihre Zäune")
(expect-inglua :fr (NOUN (P2 fence PL)) "vos clôtures")
(expect-inglua :it (NOUN (P2 fence PL)) "i suoi recinti")

;; zijn
(expect-inglua :en (NOUN (P3 lark PL)) "his larks")
(expect-inglua :es (NOUN (P3 lark PL)) "sus alondras")
(expect-inglua :nl (NOUN (P3 lark PL)) "zijn leeuweriken")
(expect-inglua :de (NOUN (P3 lark PL)) "seine Lerchen")
(expect-inglua :fr (NOUN (P3 lark PL)) "ses alouettes")
(expect-inglua :it (NOUN (P3 lark PL)) "le sue allodole")

;; ons
(expect-inglua :en (NOUN (P4 trunk PL)) "our trunks")
(expect-inglua :es (NOUN (P4 trunk PL)) "nuestras trompas")
(expect-inglua :nl (NOUN (P4 trunk PL)) "onze slurven")
(expect-inglua :de (NOUN (P4 trunk PL)) "unsere Rüssel")
(expect-inglua :fr (NOUN (P4 trunk PL)) "nos trompes")
(expect-inglua :it (NOUN (P4 trunk PL)) "le nostre proboscidi")

;; jullie
(expect-inglua :en (NOUN (P5 trunk PL)) "your trunks")
(expect-inglua :es (NOUN (P5 trunk PL)) "vuestras trompas")
(expect-inglua :nl (NOUN (P5 trunk PL)) "jullie slurven")
(expect-inglua :de (NOUN (P5 trunk PL)) "euere Rüssel")
(expect-inglua :fr (NOUN (P5 trunk PL)) "vos trompes")
(expect-inglua :it (NOUN (P5 trunk PL)) "le vostre proboscidi")

;; hun
(expect-inglua :en (NOUN (P7 head PL)) "their heads")
(expect-inglua :es (NOUN (P7 head PL)) "sus cabezas")
(expect-inglua :nl (NOUN (P7 head PL)) "hun hoofden")
(expect-inglua :de (NOUN (P7 head PL)) "ihre Köpfe")
(expect-inglua :fr (NOUN (P7 head PL)) "leurs têtes")
(expect-inglua :it (NOUN (P7 head PL)) "le loro teste")

;; haar
(expect-inglua :en (NOUN (P12 head PL)) "her heads")
(expect-inglua :es (NOUN (P12 head PL)) "sus cabezas")
(expect-inglua :nl (NOUN (P12 head PL)) "haar hoofden")
(expect-inglua :de (NOUN (P12 head PL)) "ihre Köpfe")
(expect-inglua :fr (NOUN (P12 head PL)) "ses têtes")
(expect-inglua :it (NOUN (P12 head PL)) "le sue teste")

;; NO transformations

(expect-inglua :en ((TRANS NEG) 0 (see PRES) (INDEF cow)) "I don't see a cow")
(expect-inglua :es ((TRANS NEG) 0 (see PRES) (INDEF cow)) "no veo ninguna vaca")
(expect-inglua :nl ((TRANS NEG) 0 (see PRES) (INDEF cow)) "ik zie geen koe")
(expect-inglua :de ((TRANS NEG) 0 (see PRES) (INDEF cow)) "ich sehe keine Kuh")
(expect-inglua :fr ((TRANS NEG) 0 (see PRES) (INDEF cow)) "je ne vois aucune vache")
(expect-inglua :it ((TRANS NEG) 0 (see PRES) (INDEF cow)) "non vedo nessuna vacca")

(expect-inglua :en ((TRANS NEG) 0 (tener PRES) (INDEF money)) "I don't have any money")
(expect-inglua :es ((TRANS NEG) 0 (tener PRES) (INDEF money)) "no tengo dinero")
(expect-inglua :nl ((TRANS NEG) 0 (tener PRES) (INDEF money)) "ik heb geen geld")
(expect-inglua :de ((TRANS NEG) 0 (tener PRES) (INDEF money)) "ich habe kein Geld")
(expect-inglua :fr ((TRANS NEG) 0 (tener PRES) (INDEF money)) "je n'ai pas d'argent")
(expect-inglua :it ((TRANS NEG) 0 (tener PRES) (INDEF money)) "non ho denaro")

(expect-inglua :en ((TRANS NEG) 0 (see PRES) (INDEF cow PL)) "I don't see any cows")
(expect-inglua :es ((TRANS NEG) 0 (see PRES) (INDEF cow PL)) "no veo ningunas vacas")
(expect-inglua :nl ((TRANS NEG) 0 (see PRES) (INDEF cow PL)) "ik zie geen koeien")
(expect-inglua :de ((TRANS NEG) 0 (see PRES) (INDEF cow PL)) "ich sehe keine Kühe")
(expect-inglua :fr ((TRANS NEG) 0 (see PRES) (INDEF cow PL)) "je ne vois aucunes vaches")
(expect-inglua :it ((TRANS NEG) 0 (see PRES) (INDEF cow PL)) "non vedo nessune vacche")

(expect-inglua :en (INTR (NO dog) (sleep PRES)) "no dog sleeps")
(expect-inglua :es (INTR (NO dog) (sleep PRES)) "ningún perro duerme")
(expect-inglua :nl (INTR (NO dog) (sleep PRES)) "geen hond slaapt")
(expect-inglua :de (INTR (NO dog) (sleep PRES)) "kein Hund schläft")
(expect-inglua :fr (INTR (NO dog) (sleep PRES)) "aucun chien dort")
(expect-inglua :it (INTR (NO dog) (sleep PRES)) "nessuno cane dorme")

(expect-inglua :en ((NOM NEG) 0 (ser PRES) (INDEF monster)) "I am no monster")
(expect-inglua :en ((NOM NEG) 0 (ser PRES) (INDEF monster)) "I am not a monster")
(expect-inglua :es ((NOM NEG) 0 (ser PRES) (INDEF monster)) "no soy un monstruo")
(expect-inglua :nl ((NOM NEG) 0 (ser PRES) (INDEF monster)) "ik ben geen monster")
(expect-inglua :de ((NOM NEG) 0 (ser PRES) (INDEF monster)) "ich bin kein Monster")
(expect-inglua :fr ((NOM NEG) 0 (ser PRES) (INDEF monster)) "je ne suis pas un monstre")
(expect-inglua :it ((NOM NEG) 0 (ser PRES) (INDEF monster)) "non sono un mostro")

(expect-inglua :en ((NOM NEG) (INDEF water) (ser PRES) (INDEF milk)) "water is no milk")
(expect-inglua :en ((NOM NEG) (INDEF water) (ser PRES) (INDEF milk)) "water is not milk")
(expect-inglua :es ((NOM NEG) (INDEF water) (ser PRES) (INDEF milk)) "el agua no es leche")
(expect-inglua :nl ((NOM NEG) (INDEF water) (ser PRES) (INDEF milk)) "water is geen melk")
(expect-inglua :de ((NOM NEG) (INDEF water) (ser PRES) (INDEF milk)) "Wasser ist keine Milch")
(expect-inglua :fr ((NOM NEG) (INDEF water) (ser PRES) (INDEF milk)) "l'eau n'est pas du lait")
(expect-inglua :it ((NOM NEG) (INDEF water) (ser PRES) (INDEF milk)) "l'acqua non è latte")

(expect-inglua :en ((NOM NEG) 4 (ser PRES) (INDEF monster PL)) "we are no monsters")
(expect-inglua :en ((NOM NEG) 4 (ser PRES) (INDEF monster PL)) "we are not monsters")
(expect-inglua :es ((NOM NEG) 4 (ser PRES) (INDEF monster PL)) "no somos monstruos")
(expect-inglua :nl ((NOM NEG) 4 (ser PRES) (INDEF monster PL)) "we zijn geen monsters")
(expect-inglua :de ((NOM NEG) 4 (ser PRES) (INDEF monster PL)) "wir sind keine Monster")
(expect-inglua :fr ((NOM NEG) 4 (ser PRES) (INDEF monster PL)) "nous ne sommes pas des monstres")
(expect-inglua :it ((NOM NEG) 4 (ser PRES) (INDEF monster PL)) "non siamo mostri")
