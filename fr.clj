(ns official.fr
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

;(expect-not-include :fr "je démolis le" "(TRANS 0 (demolish PRES) 13)")
;(expect-not-include :fr "je cela démolis" "(TRANS 0 (demolish PRES) 13)")
;(expect-not-include :fr "pourquoi entourait-cela moi" "((TRANS IROG WHY) 13 (surround PRET) 0)")
;(expect-not-include :fr "qui veut quelqu'un harceler" "((TRANS IROG) SBY (harass want PRES) WHO)")
;(expect-not-include :fr "qui quelqu'un veut harceler" "((TRANS IROG) SBY (harass want PRES) WHO)")
;(expect-not-include :fr "vois-je" "((INTR IROG) 0 (see PRES))")

;; should not crash
(expect-inglua :fr (TRANS 12 (condole PRES) SBY) "elle présente ses condoléances à quelqu'un")

;; fr: ça/cela
(expect-inglua :fr (NOM 13 (ser PRES) (INDEF magnificent party)) "c'est une fête magnifique")
(expect-inglua :fr ((NOM NEG) 13 (ser PRES) (INDEF magnificent party)) "ce n'est pas une fête magnifique")
(expect-inglua :fr (INTR 13 (snow_v PRES)) "il neige")
(expect-inglua :fr (TRANS 13 (surprise PRES) 0) "cela m'étonne")
(expect-inglua :fr (TRANS 13 (surprise PRES) 0) "ça m'étonne")
(expect-inglua :fr (NOM 13 (ser may_v PRES) (possible)) "ça peut être possible")
(expect-inglua :fr (NOM 13 (ser may_v PRES) (possible)) "cela peut être possible")
(expect-inglua :fr ((NOM NEG) 13 (ser PRES) (possible)) "ça n'est pas possible")
(expect-inglua :fr ((NOM NEG) 13 (ser PRES) (possible)) "cela n'est pas possible")
(expect-inglua :fr ((TRANS IROG) 1 (faire PERF) 13) "as-tu fait cela")
(expect-inglua :fr ((TRANS IROG) 1 (faire PERF) 13) "as-tu fait ça")


;; l'article partitif
(expect-inglua :fr (TRANS 1 (tener PRES) (INDEF black shoe PL)) "tu as des chaussures noires")
(expect-inglua :fr (TRANS 1 (tener PRES) (INDEF beautiful shoe PL)) "tu as de belles chaussures")
(expect-inglua :fr (TRANS 1 (tener PRES) (INDEF shoe PL)) "tu as des chaussures")
(expect-inglua :fr (TRANS 0 (drink PRES) (INDEF water)) "je bois de l'eau")

;; fr: various issues
(expect-inglua :fr (DAT 0 (give PRES) (THE apple) 12) "je lui donne la pomme")
(expect-inglua :fr (DAT NBY (send PRES) (INDEF money ) NBY) "personne n'envoie de l'argent à personne")
(expect-inglua :fr (DAT 0 (give PRES) (THE apple) 13) "je lui donne la pomme")
(expect-inglua :fr (INTR 12 (be_hungry PERF)) "elle a eu faim")
(expect-inglua :fr (INTR 12 (be_correct PERF)) "elle a été exacte")
(expect-inglua :fr (INTR 12 (write PERF)) "elle a écrit")
(expect-inglua :fr (TRANS 0 (see PRES) NTH) "je ne vois rien")
(expect-inglua :fr (TRANS NBY (see PRES) 0) "personne ne me voit")
(expect-inglua :fr ((NOM IROG WHY) (THE sky) (ser PRES) (blue)) "pourquoi est-ce que le ciel est bleu")
(expect-inglua :fr ((NOM IROG WHY) (THE sky) (ser PRES) (blue)) "pourquoi le ciel est-il bleu")
(expect-inglua :fr (DAT 4 (send PERF) (THE fork PL) 2) "nous vous avons envoyé les fourchettes")
(expect-inglua :fr (NOUN (THE gas_station)) "la station-service")
(expect-inglua :fr (NOUN (N2 match PL)) "deux matches")
(expect-inglua :fr (NOUN (THE gas_station PL)) "les stations-service")
(expect-inglua :fr (NOUN (THE trafficlight PL)) "les feux rouges")
(expect-inglua :fr (NOUN (THE track)) "la voie ferrée")
(expect-inglua :fr (NOUN (THE track PL)) "les voies ferrées")
(expect-inglua :fr (NOUN (THE policeman PL)) "les agents de police")
(expect-inglua :fr ((TRANS) (THE spider) (prevent PRES) 13) "l'araignée le prévient")
(expect-inglua :fr ((TRANS) (THE spider) (prevent PRES) 13) "l'araignée prévient cela")
(expect-inglua :fr ((INTR IROG HOW) 1 (hurry PRES)) "comment est-ce que tu te dépêches")
(expect-inglua :fr ((TRANS IROG WHY) 13 (surround PRET) 0) "pourquoi est-ce que cela m'entourait")
(expect-inglua :fr ((INTR IROG) 0 (be_mistaken pouvoir PRES)) "je peux me tromper")
(expect-inglua :fr ((INTR IROG) 0 (be_mistaken pouvoir PRES)) "est-ce que je peux me tromper")
(expect-inglua :fr ((INTR IROG) 0 (be_mistaken pouvoir PRES)) "puis-je me tromper")
(expect-inglua :fr (NOUN (THE highland)) "les hautes terres")
(expect-inglua :fr (NOUN (THE lowland)) "les basses terres")
(expect-inglua :fr ((TRANS IROG) SBY (harass want PRES) WHO) "qui est-ce que quelqu'un veut harceler")
(expect-inglua :fr ((TRANS IROG) SBY (harass want PRES) WHO) "quelqu'un veut harceler qui")
(expect-inglua :fr (INTR 3 (reveal PRES)) "il révèle")
(expect-inglua :fr ((TRANS IROG) (ALL snow) (love_v PRES) WHO) "qui est-ce que toute la neige aime")
(expect-inglua :fr (TRANS (THE mother) (love_v PRES) 1) "la mère t'aime")
(expect-inglua :fr (INTR (THE necessary fear) (kneel PRES)) "la peur nécessaire s'agenouille")
(expect-inglua :fr (TRANS (THE deep accident) (need PRES) (THE king PL)) "l'accident profond a besoin des rois")
(expect-inglua :fr (NOM 12 (ser PRES) (shallow)) "elle est peu profonde")

;; les chats y appartiennent
(expect-inglua :fr (TRANS (THE cat PL) (belong_to PRES) 13) "les chats y appartiennent")
(expect-inglua :fr (TRANS (THE cat PL) (think_about PRES) 13) "les chats y pensent")

;; les chats en ont besoin
(expect-inglua :fr (TRANS (THE cat PL) (need PRES) 13) "les chats en ont besoin")
(expect-inglua :fr (TRANS (P4 success) (depend_on PRES) 13) "notre succès en dépend")

;; tu me manques
(expect-inglua :fr (TRANS 0 (pine_for PRES) 1) "tu me manques")

;; ils se sont rappelés
(expect-inglua :fr (INTR 7 (recollect PERF)) "ils se sont rappelés")
(expect-inglua :fr (INTR 12 (recollect PERF)) "elle s'est rappelée")

;; les mêmes jours
(expect-inglua :fr (NOUN (SAME day PL)) "les mêmes jours")

;; be_painful
(expect-inglua :fr (TRANS () (be_painful INF) STH) "avoir mal à")

;; quatre-vingt voitures
(expect-inglua :fr (NOUN (N80 car PL)) "quatre-vingt voitures")
(expect-inglua :fr (NOUN (N80 car PL)) "quatre-vingts voitures")

;; subj compl
(expect-inglua :fr (NOM (INDEF woman) (ser PRES) (pretty)) "une femme est jolie")

;; subj compl
(expect-inglua :fr (INTR (INDEF woman) (doubt_intr PRES)) "une femme est indécise")

;; niet verbuigen predicate adjectives
(expect-inglua :fr (NOM (THE saturday PL) (ser PRES) (reluctant)) "les samedis sont de mauvaise volonté")

;; infliger une amende à quelqu'un
(expect-inglua :fr (TRANS () (fine INF) SBY) "infliger une amende à quelqu'un")

;; talentueuxs
(expect-inglua :fr (NOUN (THE talented apple PL)) "les pommes talentueuses")
(expect-inglua :fr (NOUN (THE talented liver PL)) "les foies talentueux")

;; c'est désobligeant
(expect-inglua :fr (NOM 13 (ser PRES) (unfriendly)) "c'est désobligeant")

;; c'est désobligeante
(expect-inglua :fr (NOM 12 (ser PRES) (unfriendly)) "elle est désobligeante")

;; fermer qqch à clé
(expect-inglua :fr (TRANS () (lock_v INF) STH) "fermer quelque chose à clé")

(expect-inglua :fr (INTR (THE female_friend PL) (pause PRES)) "les amies font une pause")
(expect-inglua :fr (TRANS (THE probable blouse PL) (need PRES) 0) "les blouses probables ont besoin de moi")
(expect-inglua :fr (TRANS 3 (allow PRES) (THE desperate nonsense)) "il permet l'idiotie désespérée")

;; fr 'adverbial pronoun'
;; infinitive
(expect-inglua :fr (INTR () (go_away INF)) "s'en aller")

;; 1st singular
(expect-inglua :fr ((INTR) 0 (go_away PRES)) "je m'en vais")

;; negated
(expect-inglua :fr ((INTR NEG) 4 (go_away PRES)) "nous ne nous en allons pas")

;; question
(expect-inglua :fr ((INTR IROG) 1 (go_away PRES)) "tu t'en vas")

;; direct questions
(expect-inglua :fr ((INTR IROG) 1 (see PRES)) "tu vois")
(expect-inglua :fr ((INTR IROG) 1 (see PRES)) "est-ce que tu vois")
(expect-inglua :fr ((INTR IROG) 1 (see PRES)) "vois-tu")
(expect-inglua :fr ((INTR IROG) 0 (see PRES)) "je vois")
(expect-inglua :fr ((INTR IROG) 0 (see PRES)) "est-ce que je vois")
(expect-inglua :fr ((INTR IROG) 0 (may_v PRES)) "puis-je")
(expect-inglua :fr ((INTR IROG) (THE sister) (see PRES)) "la soeur voit")
(expect-inglua :fr ((INTR IROG) (THE sister) (see PRES)) "est-ce que la soeur voit")
(expect-inglua :fr ((INTR IROG) (THE sister) (swim PRES)) "la soeur nage-t-elle")
(expect-inglua :fr ((INTR IROG) (THE sister) (swim PERF)) "la soeur a-t-elle nagé")
