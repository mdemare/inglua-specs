(ns official.de
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

;; Grundrecht
(expect-inglua :de (NOUN (before THE spring)) "vor dem Frühling")
(expect-inglua :de (TRANS 0 (see PRES) NTH) "ich sehe nichts")
(expect-inglua :de (TRANS 0 (see PRES) NBY) "ich sehe niemanden")
(expect-inglua :de (TRANS 0 (see PRES) NBY) "ich sehe keinen")
(expect-inglua :de (TRANS NBY (see PRES) 0) "niemand sieht mich")
(expect-inglua :de (TRANS NBY (see PRES) 0) "keiner sieht mich")
(expect-inglua :de (NOUN (ZERO basic right)) "Grundrecht")
(expect-inglua :de (NOUN (ZERO main cause)) "Hauptursache")

;; warten auf4
(expect-inglua :de (TRANS () (wait_for INF) STH) "auf etwas warten")

;; sein Magen tut weh
(expect-inglua :de (TRANS (THE stomach) (be_painful PRES) 13) "sein Magen tut weh")

;; catch error
(expect-inglua :de (NOM (SUCH key) (ser IMPERF) (hungry)) "ein solcher Schlüssel war hungrig")

;; nicht jeder Hund bellt
(expect-inglua :de ((INTR NEG) (EACH dog) (bark PRES)) "nicht jeder Hund bellt")

;; nicht alle Hunde bellen
(expect-inglua :de ((INTR NEG) (ALL dog PL) (bark PRES)) "nicht alle Hunde bellen")

;; ich bin nicht grau
(expect-inglua :de ((NOM NEG) 0 (ser PRES) (grey)) "ich bin nicht grau")

(expect-inglua :de (NOM (NO spider) (ser PRES) (EQL venomous (INDEF snake))) "keine Spinne ist so giftig wie eine Schlange")

(expect-inglua :de (TRANS 11 (drop_v PRES) (THE blanket)) "sie lassen die Decke fallen")
(expect-inglua :de (TRANS (THE squirrel PL) (promise PRES) (THE tail PL)) "die Eichhörner versprechen die Schwänze")
(expect-inglua :de (TRANS (THE squirrel PL) (believe PRES) (THE tail PL)) "die Eichhörner glauben den Schwänzen")
(expect-inglua :de (DAT (THE mercy) (ask PRES) (THE bicycle) 12) "die Gnade frägt ihr das Fahrrad")

;; german prepos case
;; für
(expect-inglua :de (TRANS 0 (vote_for PRES) 1) "ich stimme für dich")
(expect-inglua :de (TRANS 0 (vote_for PRES) (THAT woman)) "ich stimme für jene Frau")

;; zu
(expect-inglua :de (TRANS 0 (belong_to PRES) 1) "ich gehöre zu dir")
(expect-inglua :de (TRANS 0 (belong_to PRES) (THAT woman)) "ich gehöre zu jener Frau")

;; an
(expect-inglua :de (TRANS 0 (think_about PRES) 1) "ich denke an dich")
(expect-inglua :de (TRANS 0 (think_about PRES) (THE funeral)) "ich denke ans Begräbnis")

;; an
(expect-inglua :de (TRANS 0 (participate PRES) 1) "ich nehme teil an dir")
(expect-inglua :de (TRANS 0 (participate PRES) (THE funeral)) "ich nehme teil am Begräbnis")

;; de ind_object
;; correct fragen an
(expect-inglua :de (DAT 0 (ask PRES) (ZERO nonsense) 1) "ich frage dir Unsinn")

;; correct schicken zu
(expect-inglua :de (DAT 0 (send PRES) (THE rose) (THE magician)) "ich schicke dem Zauberer die Rose")

;; correct schicken zu
(expect-inglua :de (DAT 0 (send PRES) (THE magician) 1) "ich schicke dir den Zauberer")
(expect-inglua :de (DAT 0 (send PRES) 1 (THE magician)) "ich schicke dich dem Zauberer")

;; correct objects in 3rd case
(expect-inglua :de (TRANS 0 (help PRES) 1) "ich helfe dir")
(expect-inglua :de (TRANS 0 (believe PRES) (THE magician)) "ich glaube dem Zauberer")

;; de verb prepos
;; strong (ausgehen)
(expect-inglua :de (TRANS 9 (go_out PRES) (THE cloudless sympathy)) "ihr geht die wolkenlose Sympathie aus")

;; weak (ausschmücken)
(expect-inglua :de (TRANS (THE lovely suggestion PL) (decorate PRES) 3) "die lieblichen Vorschläge schmücken ihn aus")
