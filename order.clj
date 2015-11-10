(ns official.order
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

(expect-all ((INTR IROG WHEN) 3 (die PRET))
  [:de "wann starb er"]
  [:en "when did he die"]
  [:es "cuándo murió"]
  [:fr "quand mourait-il"]
  [:it "quando morì"]
  [:nl "wanneer stierf hij"])

(expect-all ((INTR IROG WHY) 1 (smile PRES))
  [:de "warum lächelst du"]
  [:en "why do you smile"]
  [:es "por qué sonríes"]
  [:fr "pourquoi souris-tu"]
  [:it "perché sorridi"]
  [:it "come mai sorridi"]
  [:nl "waarom glimlach je"])

(expect-all ((INTR IROG WHY) (THE dog) (smile PRES))
  [:de "warum lächelt der Hund"]
  [:en "why does the dog smile"]
  [:es "por qué sonríe el perro"]
  [:fr "pourquoi est-ce que le chien sourit"]
  [:it "perché il cane sorride"]
  [:it "come mai il cane sorride"]
  [:nl "waarom glimlacht de hond"])

(expect-all ((NOM IROG WHY) (P2 son_in_law PL) (ser PERF) (faithful))
  [:de "warum sind Ihre Schwiegersöhne treu gewesen"]
  [:en "why have your sons-in-law been faithful"]
  [:es "por qué sus yernos han sido fieles"]
  [:fr "pourquoi est-ce que vos gendres ont été fidèles"]
  [:it "come mai i suoi generi sono stati fedeli"]
  [:nl "waarom zijn uw schoonzoons trouw geweest"])

(expect-all ((TRANS IROG HOW) 2 (solve PERF) (THE problem))
  [:de "wie haben Sie das Problem gelöst"]
  [:en "how have you solved the problem"]
  [:es "cómo ha resuelto el problema"]
  [:fr "comment avez-vous résolu le problème"]
  [:it "come ha risoluto il problema"]
  [:nl "hoe heeft u het probleem opgelost"])

(expect-all ((TRANS IROG HOW) (THE thief_masc) (solve PERF) (THE problem))
  [:de "wie hat der Dieb das Problem gelöst"]
  [:en "how has the thief solved the problem"]
  [:es "cómo ha resuelto el ladrón el problema"]
  [:fr "comment le voleur a-t-il résolu le problème"]
  [:it "come ha risoluto il ladro il problema"]
  [:nl "hoe heeft de dief het probleem opgelost"])

(expect-all ((TRANS IROG) 1 (choose PRES) (WHICH pen))
  [:de "welche Feder wählst du"]
  [:en "which pen do you choose"]
  [:es "cuál bolígrafo eliges"]
  [:fr "quel stylo choisis-tu"]
  [:fr "quel stylo est-ce que tu choisis"]
  [:it "quale penna scegli"]
  [:it "che penna scegli"]
  [:nl "welke pen kies je"])

(expect-all ((INTR IROG) (WHICH girl) (swim PRES))
  [:de "welches Mädchen schwimmt"]
  [:en "which girl swims"]
  [:es "cuál chica nada"]
  [:fr "quelle fille nage"]
  [:it "quale ragazza nuota"]
  [:it "che ragazza nuota"]
  [:nl "welk meisje zwemt"])

(expect-all ((INTR IROG) WHO (swim PRES))
  [:de "wer schwimmt"]
  [:en "who swims"]
  [:es "quién nada"]
  [:fr "qui nage"]
  [:fr "qui est-ce que nage"]
  [:it "chi nuota"]
  [:nl "wie zwemt"]
  [:nl "wie zwemt er"])

(expect-all ((TRANS IROG) 1 (choose PRES) WHO)
  [:de "wen wählst du"]
  [:en "who do you choose"]
  [:en "whom do you choose"]
  [:es "a quién eliges"]
  [:fr "qui est-ce que tu choisis"]
  [:fr "qui choisis-tu"]
  [:it "chi scegli"]
  [:nl "wie kies je"])

(expect-all ((INTR IROG) WHAT (swim PRES))
  [:de "was schwimmt"]
  [:en "what swims"]
  [:es "qué nada"]
  [:fr "qu'est-ce que nage"]
  [:it "che nuota"]
  [:nl "wat zwemt"]
  [:nl "wat zwemt er"])

(expect-all ((TRANS IROG) 1 (choose PRES) WHAT)
  [:de "was wählst du"]
  [:en "what do you choose"]
  [:es "qué eliges"]
  [:fr "qu'est-ce que tu choisis"]
  [:it "che scegli"]
  [:nl "wat kies je"])
