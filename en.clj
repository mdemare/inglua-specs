(ns official.en
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

;; *he cuts off me*
; (expect-not-include :en "I've to swim" "(INTR 0 (swim must PRES))")
; (expect-not-include :en "I have not to swim" "((INTR NEG) 0 (swim must PRES))")
; (expect-not-include :en "I have" "(INTR 0 (must PRES))")
; (expect-not-include :en "he cuts off me" "(TRANS 3 (cut_off PRES) 0)")

;; various specs
(expect-inglua :en (TRANS 1 (overtake PERF) (Zuul)) "you have overtaken Zuul")

;; non-finite modal verbs
(expect-inglua :en (INTR 0 (swim can PRES)) "I can swim")
(expect-inglua :en (INTR 0 (swim can PRES)) "I am able to swim")
(expect-inglua :en (INTR 0 (swim may_v PRES)) "I may swim")
(expect-inglua :en (INTR 0 (swim must PRES)) "I must swim")
(expect-inglua :en (INTR 0 (swim must PRES)) "I have to swim")
(expect-inglua :en (INTR 12 (swim must PRES)) "she has to swim")
(expect-inglua :en ((INTR NEG) 0 (swim must PRES)) "I don't have to swim")
(expect-inglua :en ((INTR IROG) 0 (swim must PRES)) "do I have to swim")
(expect-inglua :en (INTR 0 (swim can IMPERF)) "I could swim")
(expect-inglua :en (INTR 0 (swim may_v IMPERF)) "I was allowed to swim")
(expect-inglua :en (INTR 0 (swim must IMPERF)) "I had to swim")
(expect-inglua :en (INTR 0 (swim can PERF)) "I have been able to swim")
(expect-inglua :en (INTR 0 (swim can PERF)) "I've been able to swim")
(expect-inglua :en (INTR 0 (swim may_v PERF)) "I have been allowed to swim")
(expect-inglua :en (INTR 0 (swim must PERF)) "I have had to swim")
(expect-inglua :en (TRANS 0 (see can PERF) (INDEF dead people PL)) "I have been able to see dead people")
(expect-inglua :en (INTR 0 (be_hungry can PRES)) "I am able to be hungry")
(expect-inglua :en (INTR (THE possessions) (burn PRES)) "the possessions burn")

;; en verb prepos
(expect-inglua :en (INTR 0 (go_away want PRES) (before THE summer)) "I want to leave before the summer")
(expect-inglua :en (TRANS 0 (see PRES) (THE dog) (before THE summer)) "I see the dog before the summer")
(expect-inglua :en (TRANS 0 (request PRET) (Alice) (before THE summer)) "I asked for Alice before the summer")
(expect-inglua :en (TRANS 0 (request PRET) (THE restaurantbill) (before THE summer)) "I asked for the check before the summer")

;; en verb prepos
;; wake up
(expect-inglua :en (TRANS 2 (turn_over PRES) (THE morning PL)) "you turn over the mornings")

;; negation transformations
(expect-inglua :en ((NOM NEG) 0 (ser PRES) (INDEF thief_masc)) "I am not a thief")
(expect-inglua :en (TRANS NBY (see PRES) 0) "nobody sees me")
(expect-inglua :en (TRANS 0 (see PRES) NTH) "I see nothing")
(expect-inglua :en (TRANS 0 (see PRES) NTH) "I do not see anything")
(expect-inglua :en (TRANS 0 (see PRES) (NO spider PL)) "I do not see any spiders")
(expect-inglua :en (TRANS 0 (see PRES) (NO spider PL)) "I see no spiders")

;; en: to provide someone with
(expect-inglua :en (DAT 1 (provide PRET) 4 (INDEF blanket PL)) "you provided us with blankets")
(expect-inglua :en ((DAT IROG WHEN) 1 (provide PRET) 4 (INDEF blanket PL)) "when did you provide us with blankets")
(expect-inglua :en ((DAT IROG) 1 (provide PRET) 4 (INDEF blanket PL)) "did you provide us with blankets")
(expect-inglua :en ((DAT IROG) WHO (provide PRET) 4 (INDEF blanket PL)) "who provided us with blankets")
(expect-inglua :en ((DAT IROG) 1 (provide PRET) WHO (INDEF blanket PL)) "who did you provide with blankets")
(expect-inglua :en ((DAT IROG) 1 (provide PRET) WHO (INDEF blanket PL)) "whom did you provide with blankets")
(expect-inglua :en ((DAT IROG) 1 (provide PRET) 4 WHAT) "what did you provide us with")
(expect-inglua :en ((DAT IROG) 1 (provide PRET) 4 WHAT) "with what did you provide us")

;; en: various issues
(expect-inglua :en (DAT (INDEF cat) (show PRES) 13 5) "a cat shows it to you")
(expect-inglua :en (NOUN (THE death)) "death")
(expect-inglua :en (NOUN (THE december)) "December")
(expect-inglua :en ((TRANS IROG) (ALL snow) (taste_like want PRES) WHO) "who does all the snow want to taste like")
(expect-inglua :en ((TRANS IROG) (ALL snow) (taste_like PRES) WHO) "who does all the snow taste like")
(expect-inglua :en ((TRANS IROG) (ALL snow) (taste_like want PRES) WHO) "like who does all the snow want to taste")
(expect-inglua :en (TRANS 0 (laugh_at PRES) SBY) "I laugh at somebody")
(expect-inglua :en ((TRANS IROG) (ALL snow) (taste_like PRES) WHO) "like who does all the snow taste")
(expect-inglua :en (NOUN (THE meuble PL)) "the pieces of furniture")
(expect-inglua :en ((INTR NEG) 0 (see PERF)) "I have not seen")
(expect-inglua :en (INTR 0 (must PRES)) "I have to")
(expect-inglua :en (INTR 0 (must PRES)) "I must")
(expect-inglua :en ((INTR NEG) 0 (see PERF)) "I haven't seen")
(expect-inglua :en ((INTR NEG) (THE girl PL) (see PERF)) "the girls haven't seen")
(expect-inglua :en ((INTR NEG) 1 (see PERF)) "you haven't seen")
(expect-inglua :en (TRANS 1 (stand_up_for PRES) (THAT girl)) "you stand up for that girl")

;; a or an
(expect-inglua :en (TRANS (INDEF honest man) (see PRES) (INDEF hour)) "an honest man sees an hour")

;; to shake his head
(expect-inglua :en (INTR () (shake_head INF)) "to shake one's head")

;; its stomach hurts
(expect-inglua :en (TRANS (THE stomach) (be_painful PRES) 13) "its stomach hurts")

;; infinitive may
(expect-inglua :en (INTR () (may_v INF)) "may")

;; infinitive can
(expect-inglua :en (INTR () (can INF)) "can")

;; those stairs
(expect-inglua :en (NOUN (THAT stairs)) "those stairs")

;; catch error
(expect-inglua :en (NOM (SUCH key) (ser IMPERF) (hungry)) "such a key was hungry")

;; depend on somebody
(expect-inglua :en (TRANS () (depend_on INF) SBY) "to depend on somebody")

;; depend on somebody
(expect-inglua :en (TRANS 0 (depend_on PRES) 2) "I depend on you")

;; to cut off somebody
(expect-inglua :en (TRANS () (cut_off INF) SBY) "to cut somebody off")

;; he cuts me off
(expect-inglua :en (TRANS 3 (cut_off PRES) 0) "he cuts me off")

;; he cuts the girl off
(expect-inglua :en (TRANS 3 (cut_off PRES) (THE girl)) "he cuts the girl off")

;; he cuts the girl off
(expect-inglua :en (TRANS 3 (cut_off PRES) (THE girl)) "he cuts off the girl")

;; not every dog barks
(expect-inglua :en ((INTR NEG) (EACH dog) (bark PRES)) "not every dog barks")

;; not all dogs bark
(expect-inglua :en ((INTR NEG) (ALL dog PL) (bark PRES)) "not all dogs bark")
