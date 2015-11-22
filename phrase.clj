(ns official.phrase
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

;; I walk
;; all languages
(expect-inglua :en (INTR 0 (walk PRES)) "I walk")
(expect-inglua :es (INTR 0 (walk PRES)) "yo ando")
(expect-inglua :nl (INTR 0 (walk PRES)) "ik loop")
(expect-inglua :de (INTR 0 (walk PRES)) "ich laufe")
(expect-inglua :fr (INTR 0 (walk PRES)) "je marche")
(expect-inglua :it (INTR 0 (walk PRES)) "cammino")

;; reflexive
(expect-inglua :en (INTR 0 (behave PRES)) "I behave myself")
(expect-inglua :es (INTR 0 (behave PRES)) "yo me comporto")
(expect-inglua :nl (INTR 0 (behave PRES)) "ik gedraag me")
(expect-inglua :de (INTR 0 (behave PRES)) "ich verhalte mich")
(expect-inglua :fr (INTR 0 (behave PRES)) "je me comporte")
(expect-inglua :it (INTR 0 (behave PRES)) "mi comporto")

;; reflexive
(expect-inglua :en (INTR 1 (behave PRES)) "you behave yourself")
(expect-inglua :es (INTR 1 (behave PRES)) "tú te comportas")
(expect-inglua :nl (INTR 1 (behave PRES)) "jij gedraagt je")
(expect-inglua :de (INTR 1 (behave PRES)) "du verhältst dich")
(expect-inglua :fr (INTR 1 (behave PRES)) "tu te comportes")
(expect-inglua :it (INTR 1 (behave PRES)) "ti comporti")

;; reflexive
(expect-inglua :en (INTR 2 (behave PRES)) "you behave yourself")
(expect-inglua :es (INTR 2 (behave PRES)) "usted se comporta")
(expect-inglua :nl (INTR 2 (behave PRES)) "u gedraagt zich")
(expect-inglua :de (INTR 2 (behave PRES)) "Sie verhalten sich")
(expect-inglua :fr (INTR 2 (behave PRES)) "vous vous comportez")
(expect-inglua :it (INTR 2 (behave PRES)) "si comporta")

;; reflexive
(expect-inglua :en (INTR 12 (behave PRES)) "she behaves herself")
(expect-inglua :es (INTR 12 (behave PRES)) "ella se comporta")
(expect-inglua :nl (INTR 12 (behave PRES)) "ze gedraagt zich")
(expect-inglua :de (INTR 12 (behave PRES)) "sie verhält sich")
(expect-inglua :fr (INTR 12 (behave PRES)) "elle se comporte")
(expect-inglua :it (INTR 12 (behave PRES)) "si comporta")

;; reflexive
(expect-inglua :en (INTR 8 (behave PRES)) "we behave ourselves")
(expect-inglua :es (INTR 8 (behave PRES)) "nosotras nos comportamos")
(expect-inglua :nl (INTR 8 (behave PRES)) "we gedragen ons")
(expect-inglua :de (INTR 8 (behave PRES)) "wir verhalten uns")
(expect-inglua :fr (INTR 8 (behave PRES)) "nous nous comportons")
(expect-inglua :it (INTR 8 (behave PRES)) "ci comportiamo")

;; reflexive
(expect-inglua :en (INTR 5 (behave PRES)) "you behave yourselves")
(expect-inglua :es (INTR 5 (behave PRES)) "vosotros os comportáis")
(expect-inglua :nl (INTR 5 (behave PRES)) "jullie gedragen je")
(expect-inglua :de (INTR 5 (behave PRES)) "ihr verhaltet euch")
(expect-inglua :fr (INTR 5 (behave PRES)) "vous vous comportez")
(expect-inglua :it (INTR 5 (behave PRES)) "vi comportate")

;; reflexive
(expect-inglua :en (INTR 7 (behave PRES)) "they behave themselves")
(expect-inglua :es (INTR 7 (behave PRES)) "ellos se comportan")
(expect-inglua :nl (INTR 7 (behave PRES)) "zij gedragen zich")
(expect-inglua :de (INTR 7 (behave PRES)) "sie verhalten sich")
(expect-inglua :fr (INTR 7 (behave PRES)) "ils se comportent")
(expect-inglua :it (INTR 7 (behave PRES)) "si comportano")

;; noun phrase
(expect-inglua :en (INTR (THE girl) (behave PRES)) "the girl behaves herself")
(expect-inglua :es (INTR (THE girl) (behave PRES)) "la chica se comporta")
(expect-inglua :nl (INTR (THE girl) (behave PRES)) "het meisje gedraagt zich")
(expect-inglua :de (INTR (THE girl) (behave PRES)) "das Mädchen verhält sich")
(expect-inglua :fr (INTR (THE girl) (behave PRES)) "la fille se comporte")
(expect-inglua :it (INTR (THE girl) (behave PRES)) "la ragazza si comporta")

;; reflexive
(expect-inglua :en (INTR () (behave INF)) "to behave oneself")
(expect-inglua :es (INTR () (behave INF)) "comportarse")
(expect-inglua :nl (INTR () (behave INF)) "zich gedragen")
(expect-inglua :de (INTR () (behave INF)) "sich verhalten")
(expect-inglua :fr (INTR () (behave INF)) "se comporter")
(expect-inglua :it (INTR () (behave INF)) "comportarsi")

;; noun phrase object
(expect-inglua :en (TRANS (THE snake) (bite PRES) (THE dog)) "the snake bites the dog")
(expect-inglua :es (TRANS (THE snake) (bite PRES) (THE dog)) "la serpiente muerde el perro")
(expect-inglua :nl (TRANS (THE snake) (bite PRES) (THE dog)) "de slang bijt de hond")
(expect-inglua :de (TRANS (THE snake) (bite PRES) (THE dog)) "die Schlange beißt den Hund")
(expect-inglua :fr (TRANS (THE snake) (bite PRES) (THE dog)) "le serpent mord le chien")
(expect-inglua :it (TRANS (THE snake) (bite PRES) (THE dog)) "il serpente morde il cane")

;; noun phrase object adj
(expect-inglua :en (TRANS (THE brown snake) (bite PRES) (THE beautiful dog)) "the brown snake bites the beautiful dog")
(expect-inglua :es (TRANS (THE brown snake) (bite PRES) (THE beautiful dog)) "la serpiente marrona muerde el perro hermoso")
(expect-inglua :nl (TRANS (THE brown snake) (bite PRES) (THE beautiful dog)) "de bruine slang bijt de mooie hond")
(expect-inglua :de (TRANS (THE brown snake) (bite PRES) (THE beautiful dog)) "die braune Schlange beißt den schönen Hund")
(expect-inglua :fr (TRANS (THE brown snake) (bite PRES) (THE beautiful dog)) "le serpent brun mord le beau chien")
(expect-inglua :it (TRANS (THE brown snake) (bite PRES) (THE beautiful dog)) "il serpente marrone morde il bel cane")

;; dative with nps
(expect-inglua :en (DAT 1 (give PRES) (THE fish) (THE man)) "you give the fish to the man")
(expect-inglua :es (DAT 1 (give PRES) (THE fish) (THE man)) "tú das el pez al hombre")
(expect-inglua :nl (DAT 1 (give PRES) (THE fish) (THE man)) "je geeft de vis aan de man")
(expect-inglua :de (DAT 1 (give PRES) (THE fish) (THE man)) "du gibst dem Mann den Fisch")
(expect-inglua :fr (DAT 1 (give PRES) (THE fish) (THE man)) "tu donnes le poisson à l'homme")
(expect-inglua :it (DAT 1 (give PRES) (THE fish) (THE man)) "dai il pesce all'uomo")

;; dative with nps
(expect-inglua :en (DAT 1 (give PRES) (THE fish) (THE man)) "you give the man the fish")
(expect-inglua :nl (DAT 1 (give PRES) (THE fish) (THE man)) "je geeft de man de vis")

;; subject complement through nominal phrases
;; sg masc
(expect-inglua :en (NOM 3 (ser PRES) (fast)) "he is fast")
(expect-inglua :es (NOM 3 (ser PRES) (fast)) "él es rápido")
(expect-inglua :nl (NOM 3 (ser PRES) (fast)) "hij is snel")
(expect-inglua :de (NOM 3 (ser PRES) (fast)) "er ist schnell")
(expect-inglua :fr (NOM 3 (ser PRES) (fast)) "il est rapide")
(expect-inglua :it (NOM 3 (ser PRES) (fast)) "è rapido")

;; sg fem
(expect-inglua :en (NOM 12 (ser PRES) (fast)) "she is fast")
(expect-inglua :es (NOM 12 (ser PRES) (fast)) "ella es rápida")
(expect-inglua :nl (NOM 12 (ser PRES) (fast)) "zij is snel")
(expect-inglua :de (NOM 12 (ser PRES) (fast)) "sie ist schnell")
(expect-inglua :fr (NOM 12 (ser PRES) (fast)) "elle est rapide")
(expect-inglua :it (NOM 12 (ser PRES) (fast)) "è rapida")

;; pl masc
(expect-inglua :en (NOM 7 (ser PRES) (fast)) "they are fast")
(expect-inglua :es (NOM 7 (ser PRES) (fast)) "ellos son rápidos")
(expect-inglua :nl (NOM 7 (ser PRES) (fast)) "zij zijn snel")
(expect-inglua :de (NOM 7 (ser PRES) (fast)) "sie sind schnell")
(expect-inglua :fr (NOM 7 (ser PRES) (fast)) "ils sont rapides")
(expect-inglua :it (NOM 7 (ser PRES) (fast)) "sono rapidi")

;; pl fem
(expect-inglua :en (NOM 11 (ser PRES) (fast)) "they are fast")
(expect-inglua :es (NOM 11 (ser PRES) (fast)) "ellas son rápidas")
(expect-inglua :nl (NOM 11 (ser PRES) (fast)) "zij zijn snel")
(expect-inglua :de (NOM 11 (ser PRES) (fast)) "sie sind schnell")
(expect-inglua :fr (NOM 11 (ser PRES) (fast)) "elles sont rapides")
(expect-inglua :it (NOM 11 (ser PRES) (fast)) "sono rapide")

;; nominal phrase
(expect-inglua :en (NOM 1 (ser PRES) (THE enemy)) "you are the enemy")
(expect-inglua :es (NOM 1 (ser PRES) (THE enemy)) "tú eres el enemigo")
(expect-inglua :nl (NOM 1 (ser PRES) (THE enemy)) "jij bent de vijand")
(expect-inglua :de (NOM 1 (ser PRES) (THE enemy)) "du bist der Feind")
(expect-inglua :fr (NOM 1 (ser PRES) (THE enemy)) "tu es l'ennemi")
(expect-inglua :it (NOM 1 (ser PRES) (THE enemy)) "sei il nemico")

;; negation intransitive pronoun
(expect-inglua :en ((INTR NEG) 0 (sleep PRES)) "I do not sleep")
(expect-inglua :es ((INTR NEG) 0 (sleep PRES)) "no duermo")
(expect-inglua :nl ((INTR NEG) 0 (sleep PRES)) "ik slaap niet")
(expect-inglua :de ((INTR NEG) 0 (sleep PRES)) "ich schlafe nicht")
(expect-inglua :fr ((INTR NEG) 0 (sleep PRES)) "je ne dors pas")
(expect-inglua :it ((INTR NEG) 0 (sleep PRES)) "non dormo")

;; subject complement through transform
;; wake up
(expect-inglua :nl (INTR 0 (wake_up PRES)) "ik word wakker")

;; blush nl
(expect-inglua :nl (INTR 0 (blush PRES)) "ik word rood")

;; blush de
(expect-inglua :de (INTR 0 (blush PRES)) "ich werde rot")

;; catch on fr
(expect-inglua :fr (INTR 0 (catch_on PRES)) "je suis adopté")
(expect-inglua :fr (INTR 12 (catch_on PRES)) "elle est adoptée")
(expect-inglua :fr (INTR 4 (catch_on PRES)) "nous sommes adoptés")

;; remain de
(expect-inglua :de (INTR 0 (remain PRES)) "ich bleibe übrig")

;; be born en
(expect-inglua :en (INTR 0 (be_born PRES)) "I am born")

;; apply es
(expect-inglua :es (INTR 3 (apply PRES)) "él es válido")
(expect-inglua :es (INTR 7 (apply PRES)) "ellos son válidos")

;; sit fr
(expect-inglua :fr (INTR 12 (sit PRES)) "elle est assise")
(expect-inglua :fr (INTR 7 (sit PRES)) "ils sont assis")
(expect-inglua :fr (INTR 11 (sit PRES)) "elles sont assises")

;; be lucky it
(expect-inglua :it (INTR 12 (be_lucky PRES)) "è fortunata")
(expect-inglua :it (INTR 7 (be_lucky PRES)) "sono fortunati")
(expect-inglua :it (INTR 11 (be_lucky PRES)) "sono fortunate")

;; negation intransitive pronoun reflexive
(expect-inglua :en ((INTR NEG) 3 (shave PRES)) "he does not shave himself")
(expect-inglua :es ((INTR NEG) 3 (shave PRES)) "él no se afeita")
(expect-inglua :nl ((INTR NEG) 3 (shave PRES)) "hij scheert zich niet")
(expect-inglua :de ((INTR NEG) 3 (shave PRES)) "er rasiert sich nicht")
(expect-inglua :fr ((INTR NEG) 3 (shave PRES)) "il ne se rase pas")
(expect-inglua :it ((INTR NEG) 3 (shave PRES)) "non si rade")

;; negation transitive pronoun pronoun
(expect-inglua :en ((TRANS NEG) 0 (hug PRES) 12) "I do not hug her")
(expect-inglua :es ((TRANS NEG) 0 (hug PRES) 12) "no la abrazo")
(expect-inglua :nl ((TRANS NEG) 0 (hug PRES) 12) "ik omhels haar niet")
(expect-inglua :de ((TRANS NEG) 0 (hug PRES) 12) "ich umarme ihr nicht")
(expect-inglua :fr ((TRANS NEG) 0 (hug PRES) 12) "je ne l'étreins pas")
(expect-inglua :it ((TRANS NEG) 0 (hug PRES) 12) "non l'abbraccio")

;; negation transitive pronoun pronoun reflexive
(expect-inglua :en ((TRANS NEG) 2 (recollect PRES) 12) "you do not remember her")
(expect-inglua :es ((TRANS NEG) 2 (recollect PRES) 12) "usted no se acuerda de ella")
(expect-inglua :nl ((TRANS NEG) 2 (recollect PRES) 12) "u herinnert zich haar niet")
(expect-inglua :de ((TRANS NEG) 2 (recollect PRES) 12) "Sie erinnern sich ihr nicht")
(expect-inglua :fr ((TRANS NEG) 2 (recollect PRES) 12) "vous ne vous la rappelez pas")
(expect-inglua :it ((TRANS NEG) 2 (recollect PRES) 12) "non la ricorda")

;; negation transitive pronoun np
(expect-inglua :en ((TRANS NEG) 0 (mock PRES) (SUCH cat)) "I do not mock such a cat")
(expect-inglua :es ((TRANS NEG) 0 (mock PRES) (SUCH cat)) "no me burlo de tal gato")
(expect-inglua :nl ((TRANS NEG) 0 (mock PRES) (SUCH cat)) "ik spot niet met zo'n kat")
(expect-inglua :de ((TRANS NEG) 0 (mock PRES) (SUCH cat)) "ich spaße nicht mit einer solcher Katze")
(expect-inglua :fr ((TRANS NEG) 0 (mock PRES) (SUCH cat)) "je ne me moque pas d'un tel chat")
(expect-inglua :it ((TRANS NEG) 0 (mock PRES) (SUCH cat)) "non beffo tali gatto")

;; negation transitive pronoun pronoun pronoun
(expect-inglua :en ((DAT NEG) 0 (tell PRES) 13 7) "I do not tell it to them")
(expect-inglua :es ((DAT NEG) 0 (tell PRES) 13 7) "no se lo cuento")
(expect-inglua :nl ((DAT NEG) 0 (tell PRES) 13 7) "ik vertel het ze niet")
(expect-inglua :de ((DAT NEG) 0 (tell PRES) 13 7) "ich erzähle es ihnen nicht")
(expect-inglua :fr ((DAT NEG) 0 (tell PRES) 13 7) "je ne leur raconte pas cela")
(expect-inglua :it ((DAT NEG) 0 (tell PRES) 13 7) "non glielo racconto")

;; negation transitive pronoun pronoun np
(expect-inglua :en ((DAT NEG) 4 (send PRES) 13 (BOTH dog PL)) "we do not send it to both dogs")
(expect-inglua :es ((DAT NEG) 4 (send PRES) 13 (BOTH dog PL)) "nosotros no lo enviamos a ambos perros")
(expect-inglua :nl ((DAT NEG) 4 (send PRES) 13 (BOTH dog PL)) "wij sturen het niet aan beide honden")
(expect-inglua :de ((DAT NEG) 4 (send PRES) 13 (BOTH dog PL)) "wir schicken es beiden Hunden nicht")
(expect-inglua :fr ((DAT NEG) 4 (send PRES) 13 (BOTH dog PL)) "nous n'envoyons pas ça aux deux chiens")
(expect-inglua :it ((DAT NEG) 4 (send PRES) 13 (BOTH dog PL)) "non lo mandiamo a entrambi cani")

;; negation transitive pronoun np pronoun
(expect-inglua :en ((DAT NEG) 5 (give PRES) (THIS spider PL) 12) "you do not give her these spiders")
(expect-inglua :es ((DAT NEG) 5 (give PRES) (THIS spider PL) 12) "vosotros no le dais estas arañas")
(expect-inglua :nl ((DAT NEG) 5 (give PRES) (THIS spider PL) 12) "jullie geven haar deze spinnen niet")
(expect-inglua :de ((DAT NEG) 5 (give PRES) (THIS spider PL) 12) "ihr gebt ihr diese Spinnen nicht")
(expect-inglua :fr ((DAT NEG) 5 (give PRES) (THIS spider PL) 12) "vous ne lui donnez pas cettes araignées")
(expect-inglua :it ((DAT NEG) 5 (give PRES) (THIS spider PL) 12) "non le date questi ragni")

;; negation transitive pronoun np np
;; all
(expect-inglua :en ((DAT NEG) 12 (show PRES) (INDEF rat) (P0 boyfriend)) "she does not show a rat to my boyfriend")
(expect-inglua :en ((DAT NEG) 12 (show PRES) (INDEF rat) (P0 boyfriend)) "she does not show my boyfriend a rat")
(expect-inglua :es ((DAT NEG) 12 (show PRES) (INDEF rat) (P0 boyfriend)) "ella no muestra ninguna rata a mi novio")
(expect-inglua :nl ((DAT NEG) 12 (show PRES) (INDEF rat) (P0 boyfriend)) "ze laat geen rat aan mijn vriend zien")
(expect-inglua :nl ((DAT NEG) 12 (show PRES) (INDEF rat) (P0 boyfriend)) "ze laat mijn vriend geen rat zien")
(expect-inglua :de ((DAT NEG) 12 (show PRES) (INDEF rat) (P0 boyfriend)) "sie zeigt meinem Freund keine Ratte")
(expect-inglua :fr ((DAT NEG) 12 (show PRES) (INDEF rat) (P0 boyfriend)) "elle ne montre aucun rat à mon ami")
(expect-inglua :it ((DAT NEG) 12 (show PRES) (INDEF rat) (P0 boyfriend)) "non mostra nessuno ratto al mio ragazzo")

;; interrogative prepositional object
;; all langDuages
(expect-inglua :en ((DAT IROG) 1 (give PERF) (INDEF pink rabbit) (WHICH grandson)) "which grandson have you given a pink rabbit")
(expect-inglua :es ((DAT IROG) 1 (give PERF) (INDEF pink rabbit) (WHICH grandson)) "a cuál nieto has dado una coneja rosada")
(expect-inglua :nl ((DAT IROG) 1 (give PERF) (INDEF pink rabbit) (WHICH grandson)) "welke kleinzoon heb je een roze konijn gegeven")
(expect-inglua :de ((DAT IROG) 1 (give PERF) (INDEF pink rabbit) (WHICH grandson)) "welchem Enkelsohn hast du ein rosa Kaninchen gegeben")
(expect-inglua :fr ((DAT IROG) 1 (give PERF) (INDEF pink rabbit) (WHICH grandson)) "à quel petit-fils as-tu donné un lapin rose")
(expect-inglua :it ((DAT IROG) 1 (give PERF) (INDEF pink rabbit) (WHICH grandson)) "a quale nipote hai dato un coniglio rosa")

;; interrogative prepositional object
;; all langDuages
(expect-inglua :en ((TRANS IROG) 1 (think_about PERF) (WHICH pink elephant)) "which pink elephant have you thought about")
(expect-inglua :es ((TRANS IROG) 1 (think_about PERF) (WHICH pink elephant)) "en cuál elefante rosado has pensado")
(expect-inglua :nl ((TRANS IROG) 1 (think_about PERF) (WHICH pink elephant)) "aan welke roze olifant heb je gedacht")
(expect-inglua :de ((TRANS IROG) 1 (think_about PERF) (WHICH pink elephant)) "an welchen rosa Elefanten hast du gedacht")
(expect-inglua :fr ((TRANS IROG) 1 (think_about PERF) (WHICH pink elephant)) "à quel éléphant rose as-tu pensé")
(expect-inglua :it ((TRANS IROG) 1 (think_about PERF) (WHICH pink elephant)) "a quale elefante rosa hai pensato")

;; simple question intr
;; all languages
(expect-inglua :en ((INTR IROG) 1 (walk PRES)) "do you walk")
(expect-inglua :es ((INTR IROG) 1 (walk PRES)) "andas")
(expect-inglua :nl ((INTR IROG) 1 (walk PRES)) "loop jij")
(expect-inglua :de ((INTR IROG) 1 (walk PRES)) "läufst du")
(expect-inglua :fr ((INTR IROG) 1 (walk PRES)) "tu marches")
(expect-inglua :it ((INTR IROG) 1 (walk PRES)) "cammini")

;; perfect tense - intransitive
;; all languages
(expect-inglua :en (INTR 0 (travel PERF)) "I have traveled")
(expect-inglua :es (INTR 0 (travel PERF)) "he viajado")
(expect-inglua :nl (INTR 0 (travel PERF)) "ik heb gereisd")
(expect-inglua :de (INTR 0 (travel PERF)) "ich bin gereist")
(expect-inglua :fr (INTR 0 (travel PERF)) "j'ai voyagé")
(expect-inglua :it (INTR 0 (travel PERF)) "ho viaggiato")

;; perfect tense - intransitive
;; all languages
(expect-inglua :en (INTR 0 (die PERF)) "I have died")
(expect-inglua :es (INTR 0 (die PERF)) "he muerto")
(expect-inglua :nl (INTR 0 (die PERF)) "ik ben gestorven")
(expect-inglua :de (INTR 0 (die PERF)) "ich bin gestorben")
(expect-inglua :fr (INTR 0 (die PERF)) "je suis mort")
(expect-inglua :it (INTR 0 (die PERF)) "sono morto")

;; equality
(expect-inglua :nl (NOM 1 (ser PRES) (EQL green (THE house))) "je bent even groen als het huis")
(expect-inglua :nl (NOM 1 (ser PRES) (EQL green (THE house))) "je bent net zo groen als het huis")
(expect-inglua :en (NOM 1 (ser PRES) (EQL green (THE house))) "you are as green as the house")
(expect-inglua :es (NOM 1 (ser PRES) (EQL green (THE house))) "eres tan verde como la casa")
(expect-inglua :de (NOM 1 (ser PRES) (EQL green (THE house))) "du bist ebenso grün wie das Haus")
(expect-inglua :fr (NOM 1 (ser PRES) (EQL green (THE house))) "tu es aussi vert que la maison")
(expect-inglua :it (NOM 1 (ser PRES) (EQL green (THE house))) "sei verde quanto la casa")
(expect-inglua :it (NOM 1 (ser PRES) (EQL green (THE house))) "sei tanto verde quanto la casa")
(expect-inglua :it (NOM 1 (ser PRES) (EQL green (THE house))) "sei verde come la casa")
(expect-inglua :it (NOM 1 (ser PRES) (EQL green (THE house))) "sei così verde come la casa")

(expect-inglua :nl ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "je bent niet zo groen als het huis")
(expect-inglua :en ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "you are not so green as the house")
(expect-inglua :es ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "no eres tan verde como la casa")
(expect-inglua :de ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "du bist nicht so grün wie das Haus")
(expect-inglua :fr ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "tu n'es pas aussi vert que la maison")
(expect-inglua :fr ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "tu n'es pas si vert que la maison")
(expect-inglua :it ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "non sei verde quanto la casa")
(expect-inglua :it ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "non sei tanto verde quanto la casa")
(expect-inglua :it ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "non sei verde come la casa")
(expect-inglua :it ((NOM NEG) 1 (ser PRES) (EQL green (THE house))) "non sei così verde come la casa")

(expect-inglua :nl (NOM 1 (ser PRES) (EQL green (THE green house))) "je bent net zo groen als het groene huis")
(expect-inglua :en (NOM 1 (ser PRES) (EQL green (THE green house))) "you are as green as the green house")
(expect-inglua :es (NOM 1 (ser PRES) (EQL green (THE green house))) "eres tan verde como la casa verde")
(expect-inglua :de (NOM 1 (ser PRES) (EQL green (THE green house))) "du bist ebenso grün wie das grüne Haus")
(expect-inglua :fr (NOM 1 (ser PRES) (EQL green (THE green house))) "tu es aussi vert que la maison verte")
(expect-inglua :it (NOM 1 (ser PRES) (EQL green (THE green house))) "sei verde quanto la casa verde")

(expect-inglua :en (NOM 12 (ser PRES) (EQL white 0)) "she is as white as me")
(expect-inglua :es (NOM 12 (ser PRES) (EQL white 0)) "ella es tan blanca como yo")
(expect-inglua :nl (NOM 12 (ser PRES) (EQL white 0)) "ze is net zo wit als ik")
(expect-inglua :de (NOM 12 (ser PRES) (EQL white 0)) "sie ist ebenso weiß wie ich")
(expect-inglua :fr (NOM 12 (ser PRES) (EQL white 0)) "elle est aussi blanche que moi")
(expect-inglua :it (NOM 12 (ser PRES) (EQL white 0)) "lei è bianca come me")

;; go crazy
(expect-inglua :en (INTR 3 (go_crazy PRES)) "he loses his mind")
(expect-inglua :es (INTR 3 (go_crazy PRES)) "se vuelve loco")
(expect-inglua :nl (INTR 3 (go_crazy PRES)) "hij wordt gek")
(expect-inglua :nl (INTR 3 (go_crazy PRES)) "hij verliest zijn verstand")
(expect-inglua :de (INTR 3 (go_crazy PRES)) "er wird verrückt")
(expect-inglua :fr (INTR 3 (go_crazy PRES)) "il devient fou")
(expect-inglua :it (INTR 3 (go_crazy PRES)) "diventa pazzo")

(expect-inglua :en (INTR 3 (go_crazy PERF)) "he has gone crazy")
(expect-inglua :en (INTR 3 (go_crazy PERF)) "he has lost his mind")
(expect-inglua :es (INTR 3 (go_crazy PERF)) "se ha vuelto loco")
(expect-inglua :nl (INTR 3 (go_crazy PERF)) "hij is gek geworden")
(expect-inglua :nl (INTR 3 (go_crazy PERF)) "hij heeft zijn verstand verloren")
(expect-inglua :de (INTR 3 (go_crazy PERF)) "er ist verrückt gewurden")
(expect-inglua :fr (INTR 3 (go_crazy PERF)) "il est devenu fou")
(expect-inglua :it (INTR 3 (go_crazy PERF)) "è diventato pazzo")

(expect-inglua :en (INTR 12 (go_crazy PRES)) "she loses her mind")
(expect-inglua :es (INTR 12 (go_crazy PRES)) "se vuelve loca")
(expect-inglua :nl (INTR 12 (go_crazy PRES)) "zij wordt gek")
(expect-inglua :nl (INTR 12 (go_crazy PRES)) "zij verliest haar verstand")
(expect-inglua :de (INTR 12 (go_crazy PRES)) "sie wird verrückt")
(expect-inglua :fr (INTR 12 (go_crazy PRES)) "elle devient folle")
(expect-inglua :it (INTR 12 (go_crazy PRES)) "diventa pazza")

(expect-inglua :en (INTR 7 (go_crazy PRES)) "they lose their minds")
(expect-inglua :es (INTR 7 (go_crazy PRES)) "se vuelven locos")
(expect-inglua :nl (INTR 7 (go_crazy PRES)) "zij worden gek")
(expect-inglua :nl (INTR 7 (go_crazy PRES)) "zij verliezen hun verstand")
(expect-inglua :de (INTR 7 (go_crazy PRES)) "sie werden verrückt")
(expect-inglua :fr (INTR 7 (go_crazy PRES)) "ils deviennent fous")
(expect-inglua :it (INTR 7 (go_crazy PRES)) "diventano pazzi")

(expect-inglua :en (INTR 3 (go_crazy want PRES)) "he wants to lose his mind")
(expect-inglua :es (INTR 3 (go_crazy want PRES)) "quiere volverse loco")
(expect-inglua :nl (INTR 3 (go_crazy want PRES)) "hij wil gek worden")
(expect-inglua :nl (INTR 3 (go_crazy want PRES)) "hij wil zijn verstand verliezen")
(expect-inglua :de (INTR 3 (go_crazy want PRES)) "er will verrückt werden")
(expect-inglua :fr (INTR 3 (go_crazy want PRES)) "il veut devenir fou")
(expect-inglua :it (INTR 3 (go_crazy want PRES)) "vuole diventare pazzo")

(expect-inglua :en ((INTR NEG) 3 (go_crazy PRES)) "he doesn't lose his mind")
(expect-inglua :es ((INTR NEG) 3 (go_crazy PRES)) "no se vuelve loco")
(expect-inglua :nl ((INTR NEG) 3 (go_crazy PRES)) "hij wordt niet gek")
(expect-inglua :nl ((INTR NEG) 3 (go_crazy PRES)) "hij verliest zijn verstand niet")
(expect-inglua :de ((INTR NEG) 3 (go_crazy PRES)) "er wird nicht verrückt")
(expect-inglua :fr ((INTR NEG) 3 (go_crazy PRES)) "il ne devient pas fou")
(expect-inglua :it ((INTR NEG) 3 (go_crazy PRES)) "non diventa pazzo")

(expect-inglua :nl (INTR 3 (be_home PERF)) "hij is thuis geweest")
(expect-inglua :en ((INTR NEG) 3 (go_crazy PERF)) "he has not gone crazy")
(expect-inglua :en ((INTR NEG) 3 (go_crazy PERF)) "he has not lost his mind")
(expect-inglua :es ((INTR NEG) 3 (go_crazy PERF)) "no se ha vuelto loco")
(expect-inglua :nl ((INTR NEG) 3 (go_crazy PERF)) "hij is niet gek geworden")
(expect-inglua :nl ((INTR NEG) 3 (go_crazy PERF)) "hij heeft zijn verstand niet verloren")
(expect-inglua :de ((INTR NEG) 3 (go_crazy PERF)) "er ist nicht verrückt gewurden")
(expect-inglua :fr ((INTR NEG) 3 (go_crazy PERF)) "il n'est pas devenu fou")
(expect-inglua :it ((INTR NEG) 3 (go_crazy PERF)) "non è diventato pazzo")
