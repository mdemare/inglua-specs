(ns official.modal
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

;; modal verbs en
;; can
(expect-inglua :en (INTR 0 (swim can PRES)) "I can swim")
(expect-inglua :en (TRANS 0 (kill want PRES) (THE dog)) "I want to kill the dog")
(expect-inglua :en ((TRANS NEG) 0 (depend_on may_v PRES) (THE dog)) "I may not depend on the dog")

;; modal verbs es
;; poder
(expect-inglua :es (INTR 0 (swim can PRES)) "sé nadar")
(expect-inglua :es (TRANS 0 (kill want PRES) (THE dog)) "quiero matar el perro")
(expect-inglua :es ((TRANS NEG) 0 (depend_on may_v PRES) (THE dog)) "no puedo depender del perro")

;; modal verbs nl
;; kunnen
(expect-inglua :nl (INTR 0 (swim can PRES)) "ik kan zwemmen")
(expect-inglua :nl (TRANS 0 (kill want PRES) (THE dog)) "ik wil de hond doodmaken")
(expect-inglua :nl ((TRANS NEG) 0 (depend_on may_v PRES) (THE dog)) "ik mag niet afhangen van de hond")

;; modal verbs de
;; können
(expect-inglua :de (INTR 0 (swim can PRES)) "ich kann schwimmen")
(expect-inglua :de (TRANS 0 (kill want PRES) (THE dog)) "ich will den Hund töten")
(expect-inglua :de ((TRANS NEG) 0 (depend_on may_v PRES) (THE dog)) "ich darf mich nicht abhängen von dem Hund")

;; modal verbs fr
;; pouvoir
(expect-inglua :fr (INTR 0 (swim can PRES)) "je sais nager")
(expect-inglua :fr (TRANS 0 (kill want PRES) (THE dog)) "je veux tuer le chien")
(expect-inglua :fr ((TRANS NEG) 0 (depend_on may_v PRES) (THE dog)) "je ne peux pas dépendre du chien")

;; modal verbs it
;; pouvoir
(expect-inglua :it (INTR 0 (swim can PRES)) "sapo nuotare")
(expect-inglua :it (TRANS 0 (kill want PRES) (THE dog)) "voglio uccidere il cane")
(expect-inglua :it ((TRANS NEG) 0 (depend_on may_v PRES) (THE dog)) "non posso dipendere dal cane")

;; multiple infinitives
(expect-inglua :en ((INTR NEG) 0 (swim want PRES)) "I do not want to swim")
(expect-inglua :es (TRANS 0 (drop_v want PRES) (THE dog)) "quiero dejar caer el perro")
(expect-inglua :nl (TRANS 0 (drop_v want PRES) (THE dog)) "ik wil de hond laten vallen")
(expect-inglua :nl (TRANS 0 (drop_v want PERF) (THE dog)) "ik heb de hond willen laten vallen")
(expect-inglua :de (TRANS 0 (drop_v want PRES) (THE dog)) "ich will den Hund fallen lassen")
(expect-inglua :fr (TRANS 0 (drop_v want PRES) (THE dog)) "je veux laisser tomber le chien")
(expect-inglua :it (TRANS 0 (drop_v want PRES) (THE dog)) "voglio far cadere il cane")

(expect-inglua :en (INTR 0 (swim can PERF)) "I have been able to swim")
(expect-inglua :en ((INTR NEG) 0 (swim want PERF)) "I have not wanted to swim")

(expect-inglua :de (TRANS 0 (drop_v want PERF) (THE dog)) "ich habe den Hund fallen lassen wollen")
(expect-inglua :en (TRANS 0 (drop_v want PERF) (THE dog)) "I have wanted to drop the dog")
(expect-inglua :es (TRANS 0 (drop_v want PERF) (THE dog)) "he querido dejar caer el perro")
(expect-inglua :fr (TRANS 0 (drop_v want PERF) (THE dog)) "j'ai voulu laisser tomber le chien")
(expect-inglua :it (TRANS 0 (drop_v want PERF) (THE dog)) "ho voluto far cadere il cane")
(expect-inglua :nl (TRANS 0 (drop_v want PERF) (THE dog)) "ik heb de hond willen laten vallen")
