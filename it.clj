(ns official.it
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

;(expect-not-include :it "il ragazzo bello" "(NOUN (THE beautiful boy))")
;(expect-not-include :it "il ragazzo brutto" "(NOUN (THE ugly boy))")
;(expect-not-include :it "il ragazzo buono" "(NOUN (THE good boy))")
;(expect-not-include :it "il ragazzo cattivo" "(NOUN (THE bad boy))")
;(expect-not-include :it "il ragazzo grande" "(NOUN (THE large boy))")
;(expect-not-include :it "il ragazzo piccolo" "(NOUN (THE small boy))")
;(expect-not-include :it "il tempo lungo" "(NOUN (THE long time))")
;(expect-not-include :it "il tempo breve" "(NOUN (THE brief time))")
;(expect-not-include :it "il verde serpente" "(NOUN (THE green snake))")
;(expect-not-include :it "lo desidero comprare" "(TRANS 0 (buy long_for PRES) 13)")
;(expect-not-include :it "ti mi dà" "(DAT 3 (give PRES) 0 1)")
;(expect-not-include :it "mi ti dà" "(DAT 3 (give PRES) 0 1)")

;; negation transformations
(expect-inglua :it (TRANS 0 (see PRES) NTH) "non vedo niente")
(expect-inglua :it (TRANS NBY (see PRES) 0) "nessuno mi vede")
(expect-inglua :it (TRANS 0 (see PRES) (NO spider PL)) "non vedo nessuni ragni")
(expect-inglua :it (TRANS (NO spider PL) (scare PRES) 0) "nessuni ragni mi fanno paura")

;; should not crash
(expect-inglua :it (INTR () (be_glad-it-1 INF)) "essere felice")

(expect-inglua :it (TRANS 0 (need-it-0 PRES) 1) "ho bisogno di te")

(expect-inglua :it (TRANS 0 (need PRES) 1) "io ho bisogno di te")

(expect-inglua :it (TRANS 0 (fear_v PRES) 13) "lo temo")

(expect-inglua :it (DAT () (lend INF) 13 SBY) "prestarlo a qualcuno")

(expect-inglua :it (INTR 7 (stand PRET)) "stettero in piedi")
(expect-inglua :it (NOUN (THE shorts)) "i pantaloncini corti")
(expect-inglua :it (NOUN (THE firstname PL)) "i nomi di battesimo")
(expect-inglua :it (NOUN (THE bottom PL)) "le parti inferiori")
(expect-inglua :it (NOUN (THE grassy_field PL)) "i campi erbosi")
(expect-inglua :it (NOUN (THE roadsign PL)) "i cartelli stradali")
(expect-inglua :it (NOUN (THE roadsign PL)) "le segnaletiche stradali")
(expect-inglua :it (NOM 12 (ser PRES) (furry)) "è coperta di pelliccia")
(expect-inglua :it (NOUN (A_FEW head PL)) "qualche testa")
(expect-inglua :it (NOM (A_FEW head PL) (ser PRES) (red)) "qualche testa è rossa")
(expect-inglua :it (NOM (A_FEW head PL) (ser PRES) (red)) "alcune teste sono rosse")
(expect-inglua :it (TRANS () (rely_on INF) STH) "contare su qualcosa")
(expect-inglua :it (INTR 0 (sleep PERF)) "ho dormito")
(expect-inglua :it (INTR () (sleep let INF)) "lasciar dormire")

;; placement adjectives
(expect-inglua :it (NOUN (THE green snake)) "il serpente verde")
;; buono, bello
(expect-inglua :it (NOUN (THE beautiful boy)) "il bel ragazzo")
(expect-inglua :it (NOUN (THE beautiful girl)) "la bella ragazza")
(expect-inglua :it (NOUN (THE beautiful boy PL)) "i bei ragazzi")
(expect-inglua :it (NOUN (THE beautiful girl PL)) "le belle ragazze")
(expect-inglua :it (NOUN (THE beautiful male_friend)) "il bell'amico")
(expect-inglua :it (NOUN (THE beautiful female_friend)) "la bella amica")
(expect-inglua :it (NOUN (THE beautiful male_friend PL)) "i begli amici")
(expect-inglua :it (NOUN (THE beautiful female_friend PL)) "le belle amiche")
(expect-inglua :it (NOUN (THE beautiful play_n)) "il bello spettacolo")
(expect-inglua :it (NOUN (THE good price)) "il buon prezzo")
(expect-inglua :it (NOUN (THE good male_friend)) "il buon amico")
(expect-inglua :it (NOUN (THE good play_n)) "il buono spettacolo")

;; possessives
(expect-inglua :it (NOUN (P0 mother)) "mia madre")
(expect-inglua :it (NOUN (P0 cat)) "il mio gatto")
(expect-inglua :it (NOUN (P7 mother)) "la loro madre")
(expect-inglua :it (NOUN (P0 cruel mother)) "la mia madre crudele")
(expect-inglua :it (NOUN (P0 mother PL)) "le mie madri")

;; noun plurals
(expect-inglua :it (NOUN (THE office PL)) "gli uffici")
(expect-inglua :it (NOUN (THE kiss_n PL)) "i baci")
(expect-inglua :it (NOUN (THE watch_n PL)) "gli orologi")
(expect-inglua :it (NOUN (THE son PL)) "i figli")
(expect-inglua :it (NOUN (THE mirror PL)) "gli specchi")
(expect-inglua :it (NOUN (THE shop PL)) "i negozi")
(expect-inglua :it (NOUN (THE uncle PL)) "gli zii")
(expect-inglua :it (NOUN (THE forest PL)) "i boschi")
(expect-inglua :it (NOUN (THE mushroom PL)) "i funghi")
(expect-inglua :it (NOUN (THE male_friend PL)) "gli amici")
(expect-inglua :it (NOUN (THE enemy PL)) "i nemici")
(expect-inglua :it (NOUN (THE doctor PL)) "i medici")
(expect-inglua :it (NOUN (THE orange_n PL)) "le arance")
(expect-inglua :it (NOUN (THE face PL)) "le facce")
(expect-inglua :it (NOUN (THE beach PL)) "le spiagge")
(expect-inglua :it (NOUN (THE shirt PL)) "le camicie")
(expect-inglua :it (NOUN (THE cherry PL)) "le ciliegie")
(expect-inglua :it (NOUN (THE mentira PL)) "le bugie")
(expect-inglua :it (NOUN (THE finger PL)) "le dita")
(expect-inglua :it (NOUN (THE arm PL)) "le bracchia")
(expect-inglua :it (NOUN (THE lip PL)) "le labbra")
(expect-inglua :it (NOUN (THE knee PL)) "le ginocchia")
(expect-inglua :it (NOUN (THE bone PL)) "le ossa")
(expect-inglua :it (NOUN (THE sheet PL)) "le lenzuola")
(expect-inglua :it (NOUN (THE pair PL)) "le paia")
(expect-inglua :it (NOUN (THE egg PL)) "le uova")
(expect-inglua :it (NOUN (THE weapon PL)) "le armi")
(expect-inglua :it (NOUN (THE hand PL)) "le mani")
(expect-inglua :it (NOUN (THE oxen PL)) "le buoi")
(expect-inglua :it (NOUN (THE wing PL)) "le ali")
(expect-inglua :it (NOUN (THE city PL)) "le città")
(expect-inglua :it (NOUN (THE king PL)) "i re")
(expect-inglua :it (NOUN (THE bus PL)) "gli autobus")
(expect-inglua :it (NOUN (THE film PL)) "i film")
(expect-inglua :it (NOUN (THE motorbike PL)) "le moto")
(expect-inglua :it (NOUN (THE photo PL)) "le foto")
(expect-inglua :it (NOUN (THE series PL)) "le serie")
(expect-inglua :it (NOUN (THE species PL)) "le specie")

;; personal pronouns
(expect-inglua :it (TRANS 0 (write PRES) 13) "lo scrivo")
(expect-inglua :it (TRANS (THE woman) (open PRES) 7) "la donna li apre")
(expect-inglua :it (TRANS 13 (open PRES) 7) "li apre")
(expect-inglua :it (TRANS (THE woman) (open PRES) 11) "la donna le apre")
(expect-inglua :it (TRANS 12 (open PRES) 11) "le apre")
(expect-inglua :it (TRANS 1 (recognize PRES) 12) "la riconosci")
(expect-inglua :it (DAT 0 (bring PRES) (THE wine) 3) "gli porto il vino")
(expect-inglua :it (DAT 0 (bring PRES) (THE wine) 7) "gli porto il vino")
(expect-inglua :it (DAT 0 (bring PRES) (THE wine) 12) "gli porto il vino")
(expect-inglua :it (TRANS 0 (see PERF) 12) "l'ho vista")
(expect-inglua :it (TRANS 0 (order_food PERF) (N2 book PL)) "ho ordinato due libri")
(expect-inglua :it (TRANS 0 (pay PERF) 7) "li ho pagati")
(expect-inglua :it (TRANS 0 (see PERF) 2) "L'ho vista")
(expect-inglua :it (TRANS 0 (buy long_for PRES) 0) "desidero comprarmi")
(expect-inglua :it (TRANS 0 (buy long_for PRES) 7) "desidero comprarli")
(expect-inglua :it (TRANS 0 (buy long_for PRES) 13) "desidero comprarlo")
(expect-inglua :it ((TRANS NEG) 0 (buy long_for PRES) 13) "non desidero comprarlo")
(expect-inglua :it (TRANS 0 (buy want PRES) 13) "lo voglio comprare")
(expect-inglua :it (TRANS 0 (buy must PRES) 13) "lo devo comprare")
(expect-inglua :it (TRANS 0 (buy can PRES) 13) "lo sapo comprare")
(expect-inglua :it (TRANS 0 (buy may_v PRES) 13) "lo posso comprare")
(expect-inglua :it (DAT 2 (give PERF) (THE spider PL) (THE brother)) "ha dato i ragni al fratello")
(expect-inglua :it (DAT 0 (bring PRES) (THE wine) 12) "gli porto il vino")
(expect-inglua :it (DAT 0 (give PERF) 13 2) "Glielo ho dato")
(expect-inglua :it (DAT 0 (give PERF) 13 3) "glielo ho dato")
(expect-inglua :it (DAT 0 (give PERF) 13 5) "ve lo ho dato")
(expect-inglua :it (DAT 3 (give PRES) 0 1) "mi dà a te")
(expect-inglua :it (NOM 12 (ser PRES) (EQL white 0)) "lei è bianca come me")
(expect-inglua :it (NOM 12 (ser PRES) (EQL white 1)) "lei è bianca come te")
(expect-inglua :it (NOM 12 (ser PRES) (EQL white 3)) "lei è bianca come lui")
(expect-inglua :it (NOM 12 (ser PRES) (EQL white 12)) "lei è bianca come lei")
(expect-inglua :it (NOM 12 (ser PRES) (EQL white 7)) "lei è bianca come loro")
(expect-inglua :it (NOM 12 (ser PRES) (EQL white 5)) "lei è bianca come voi")

;; attributive adjectives
(expect-inglua :it (NOUN (THE red boy)) "il ragazzo rosso")
(expect-inglua :it (NOUN (THE red boy PL)) "i ragazzi rossi")
(expect-inglua :it (NOUN (THE red church)) "la chiesa rossa")
(expect-inglua :it (NOUN (THE red church PL)) "le chiese rosse")
(expect-inglua :it (NOUN (THE selfish boy)) "il ragazzo egoista")
(expect-inglua :it (NOUN (THE selfish boy PL)) "i ragazzi egoisti")
(expect-inglua :it (NOUN (THE selfish church PL)) "le chiese egoiste")
(expect-inglua :it (NOUN (THE selfish church PL)) "le chiese egoiste")
(expect-inglua :it (NOUN (THE old boy PL)) "i ragazzi vecchi")
(expect-inglua :it (NOUN (THE opposite boy PL)) "i ragazzi contrari")
(expect-inglua :it (NOUN (THE fresh boy PL)) "i ragazzi freschi")
(expect-inglua :it (NOUN (THE white girl PL)) "le ragazze bianche")
(expect-inglua :it (NOUN (THE magnificent boy PL)) "i ragazzi magnifici")
(expect-inglua :it (NOUN (THE magnificent girl PL)) "le ragazze magnifiche")
(expect-inglua :it (NOUN (THE smooth girl PL)) "le ragazze lisce")
(expect-inglua :it (NOUN (THE smooth girl PL)) "le lisce ragazze")
(expect-inglua :it (NOUN (THE sensible girl PL)) "le ragazze sagge")
(expect-inglua :it (NOUN (THE dirty girl PL)) "le ragazze sudicie")
(expect-inglua :it (NOUN (THE grey girl PL)) "le ragazze grigie")
(expect-inglua :it (NOUN (THE orange girl)) "la ragazza arancio")
(expect-inglua :it (NOUN (THE pink boy)) "il ragazzo rosa")
(expect-inglua :it (NOUN (THE purple boy)) "il ragazzo viola")
(expect-inglua :it (NOUN (THE blue boy PL)) "i ragazzi blu")

;; verbs: perfecto
(expect-inglua :it (INTR 12 (sleep PERF)) "ha dormito")
(expect-inglua :it (INTR 12 (sit_down PERF)) "si è seduta")
(expect-inglua :it (INTR 13 (rain_v PERF)) "è piovuto")
(expect-inglua :it (INTR 13 (rain_v PERF)) "ha piovuto")
(expect-inglua :it (INTR 12 (lie_v PERF)) "è stata distesa")
(expect-inglua :it (INTR 12 (go_crazy PERF)) "è diventata pazza")

;; verbs
(expect-inglua :it (INTR 0 (sleep PRES)) "io dormo")
