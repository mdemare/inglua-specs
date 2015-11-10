(ns official.nl
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

(expect-inglua :nl ((TRANS) 4 (see PLUPERF) (THE whole wine )) "wij hadden de hele wijn gezien")

(expect-inglua :nl ((NOM IROG) (THE gratis flower PL) (ser IMPERF) (beautiful)) "waren de gratis bloemen mooi")

(expect-inglua :nl (TRANS 7 (belong_to PERF) STH) "ze hebben ergens toe behoord")

(expect-inglua :nl ((INTR NEG) 7 (be_thirsty PRES)) "ze hebben geen dorst")

(expect-inglua :nl ((INTR NEG) SBY (comment PRES)) "iemand geeft geen commentaar")

(expect-inglua :nl (TRANS () (concern INF) SBY) "te maken hebben met iemand")

(expect-inglua :nl (TRANS () (concern INF) SBY) "met iemand te maken hebben")

(expect-inglua :nl (TRANS 13 (concern PRES) (P2 husband)) "het heeft met uw man te maken")

(expect-inglua :nl (TRANS 13 (concern PRES) (P2 husband)) "het heeft te maken met uw man")

(expect-inglua :nl (TRANS 2 (contemplate PRES) STH) "u overweegt iets")

(expect-inglua :nl (TRANS 1 (fear_v PERF) STH) "je bent ergens bang voor geweest")

(expect-inglua :nl (TRANS () (wait_for INF) STH) "ergens op wachten")

(expect-inglua :nl (TRANS 7 (belong_to PERF) STH) "ze hebben ergens toe behoord")

(expect-inglua :nl (TRANS () (fear_v INF) STH) "ergens bang voor zijn")

(expect-inglua :nl ((TRANS NEG) 6 (harm PRES) 0) "u doet me geen kwaad")

(expect-inglua :nl (TRANS () (look INF) STH) "ergens naar kijken")

(expect-inglua :nl (INTR SBY (shake_head PRES)) "iemand schudt zijn hoofd")

(expect-inglua :nl (TRANS 1 (forgive PERF) SBY) "je hebt iemand vergeven")

(expect-inglua :nl (TRANS 0 (see PRES) NTH) "ik zie niets")

(expect-inglua :nl (TRANS 0 (see PRES) NTH) "ik zie niks")

(expect-inglua :nl (TRANS NBY (see PRES) 0) "niemand ziet mij")

(expect-inglua :nl (DAT 2 (owe PRES) 13 SBY) "u bent het iemand schuldig")

(expect-inglua :nl (TRANS (THE ice) (bear_v pouvoir IMPERF) (BOTH bear PL)) "het ijs kon beide beren dragen")

(expect-inglua :nl ((NOM) (THE look_n PL) (ser PERF) (distant)) "de blikken zijn ver geweest")

(expect-inglua :nl (TRANS (Alice) (see PRES) (Bob)) "Alice ziet Bob")

(expect-inglua :nl (NOUN (P4 foreign grandmother)) "onze buitenlandse oma")

(expect-inglua :nl (TRANS 12 (request IMPERF) STH) "ze vroeg ergens om")

(expect-inglua :nl (TRANS 12 (request IMPERF) STH) "ze verzocht iets")

(expect-inglua :nl ((TRANS IROG) (ALL snow) (be_owned PRES) WHO) "van wie is alle sneeuw")

(expect-inglua :nl ((TRANS NEG) 1 (bother PERF) 0) "ik heb geen last van jou gehad")

(expect-inglua :nl ((INTR NEG) 1 (rebel PERF)) "jij bent niet in opstand gekomen")

(expect-inglua :nl (INTR () (rebel INF)) "in opstand komen")

(expect-inglua :nl (INTR 0 (stand_up PRES)) "ik ga staan")

(expect-inglua :nl ((INTR NEG) (INDEF parent) (be_lucky PERF)) "een ouder heeft geen geluk gehad")

(expect-inglua :nl (NOUN (INDEF noun)) "een zelfstandig naamwoord")

(expect-inglua :nl (NOUN (SUCH amusing snow)) "zulke leuke sneeuw")

(expect-inglua :nl (NOUN (INDEF noun PL)) "zelfstandige naamwoorden")

(expect-inglua :nl (NOUN (INDEF noun)) "een zelfstandig naamwoord")

(expect-inglua :nl (NOUN (ZERO noun)) "zelfstandig naamwoord")

(expect-inglua :nl (INTR () (take_the_trouble INF)) "moeite doen")

;; van iets -> ergens van
(expect-inglua :nl (TRANS 0 (love_v PRES) STH) "ik houd ergens van")

(expect-inglua :nl (TRANS 2 (get_rid_of PERF) STH) "u heeft zich ergens van ontdaan")


;; Grundrecht
(expect-inglua :nl (NOUN (ZERO basic right)) "grondrecht")

(expect-inglua :nl (NOUN (ZERO main cause)) "hoofdoorzaak")

;; van plan zijn
(expect-inglua :nl ((TRANS) 0 (intend PRES) 13) "ik ben het van plan")

(expect-inglua :nl ((TRANS) 0 (intend PERF) 13) "ik ben het van plan geweest")

(expect-inglua :nl ((TRANS) 0 (intend must PRES) 13) "ik moet het van plan zijn")

(expect-inglua :nl ((TRANS IROG) 0 (intend PRES) 13) "ben ik het van plan")

(expect-inglua :nl ((TRANS IROG) 0 (intend PERF) 13) "ben ik het van plan geweest")

(expect-inglua :nl ((TRANS IROG) 0 (intend must PRES) 13) "moet ik het van plan zijn")

(expect-inglua :nl ((TRANS NEG) 0 (intend PRES) 13) "ik ben het niet van plan")

(expect-inglua :nl ((TRANS NEG) 0 (intend PERF) 13) "ik ben het niet van plan geweest")

(expect-inglua :nl ((TRANS NEG) 0 (intend must PRES) 13) "ik moet het niet van plan zijn")

;; het doet me versteld staan
(expect-inglua :nl (TRANS 13 (surprise PRES) 0) "het doet me versteld staan")

;; determiners
(expect-inglua :nl (NOUN (EACH spider)) "iedere spin")
(expect-inglua :nl (NOUN (SEVERAL woman PL)) "meerdere vrouwen")
(expect-inglua :nl (NOUN (ALL water)) "al het water")


;; ik geef het haar aan
(expect-inglua :nl ((DAT NEG) (THIS girl) (give PRES) 13 (THE dog)) "dit meisje geeft het niet aan de hond")

;; alle melk
(expect-inglua :nl (NOUN (ALL milk)) "alle melk")


;; tweeënnegentig
(expect-inglua :nl (TRANS 0 (be_owned PRES) 1) "ik ben van jou")

;; we mogen komen in opstand

;; tweeënnegentig
(expect-inglua :nl (NOUN (N92 apple PL)) "tweeënnegentig appels")

;; nl: met het -> ermee
(expect-inglua :nl (TRANS 0 (meet PRES) 13) "ik maak er kennis mee")

;; nl: tot het -> ertoe
(expect-inglua :nl (TRANS 0 (belong_to PRES) 13) "ik behoor er toe")

;; make-up
(expect-inglua :nl ((TRANS) (THE year PL) (compete dare PRES) 4) "de jaren durven met ons te concurreren")

;; ik heb last van de vliegen
(expect-inglua :nl (TRANS (THE fly_noun PL) (bother PRES) 0) "ik heb last van de vliegen")

;; de vrienden hebben belegd
(expect-inglua :nl ((INTR) (THE male_friend PL) (invest PERF)) "de vrienden hebben belegd")

;; zijn maag doet pijn
(expect-inglua :nl (TRANS (THE stomach) (be_painful PRES) 13) "zijn maag doet pijn")

;; jullie komden?
(expect-inglua :nl (INTR 5 (come IMPERF)) "jullie kwamen")

;; kleedde u zich uit
(expect-inglua :nl ((INTR IROG) 2 (undress IMPERF)) "kleedde u zich uit")

;; ze moeten er boeten voor

;; het mag niet afhangen van het weer
(expect-inglua :nl ((TRANS NEG) 13 (depend_on may_v PRES) (THE weather)) "het mag niet afhangen van het weer")

;; geen spin is zo giftig als een slang
(expect-inglua :nl (NOM (NO spider) (ser PRES) (EQL venomous (INDEF snake))) "geen spin is zo giftig als een slang")

;; niet elke hond blaft
(expect-inglua :nl ((INTR NEG) (EACH dog) (bark PRES)) "niet elke hond blaft")

;; niet alle honden blaffen
(expect-inglua :nl ((INTR NEG) (ALL dog PL) (bark PRES)) "niet alle honden blaffen")

;; zulke hersens
(expect-inglua :nl (NOUN (SUCH brain)) "zulke hersens")

;; jij scheert jou

;; jullie durven het niet te toegeven
(expect-inglua :nl ((TRANS NEG) 5 (admit dare PRES) 13) "jullie durven het niet toe te geven")

;; ik durf liever te hebben
(expect-inglua :nl (INTR 0 (prefer dare PRES)) "ik durf liever te hebben")

;; ondervindend voornaamwoord
;; kwaad doen aan

;; aan mij een standje geven

(expect-inglua :nl ((INTR) 4 (agree PRES)) "wij zijn het eens")

(expect-inglua :nl ((INTR NEG) 4 (agree PRES)) "wij zijn het niet eens")

(expect-inglua :nl ((INTR) 4 (disagree PRES)) "wij zijn het oneens")

(expect-inglua :nl ((INTR NEG) 4 (disagree PRES)) "wij zijn het niet oneens")

;; irregular verbs

(expect-inglua :nl (INTR 7 (exist PERF)) "ze hebben bestaan")

(expect-inglua :nl (INTR 13 (appear PERF)) "het is verschenen")

(expect-inglua :nl (INTR 3 (drown IMPERF)) "hij verdronk")

(expect-inglua :nl (TRANS 0 (organize PRES) STH) "ik organiseer iets")

(expect-inglua :nl ((TRANS NEG) 7 (defeat PRET) (P12 pupil_fem PL)) "zij versloegen haar leerlinges niet")

(expect-inglua :nl ((INTR) (OTHER bowl) (appear IMPERF)) "de andere schaal verscheen")

(expect-inglua :nl (INTR 7 (exist PRET)) "zij bestonden")

(expect-inglua :nl (TRANS 5 (commit IMPERF) STH) "jullie begingen iets")

(expect-inglua :nl (TRANS 0 (say IMPERF) STH) "ik zei iets")

(expect-inglua :nl ((TRANS) (THE boy PL) (get_rid_of PERF) (P7 name)) "de jongens hebben zich ontdaan van hun naam")

(expect-inglua :nl (TRANS 3 (lay_off IMPERF) SBY) "hij ontsloeg iemand")

;; iemand voorzien van

(expect-inglua :nl (DAT 3 (provide PRET) 4 (INDEF blanket PL)) "hij voorzag ons van dekens")

(expect-inglua :nl ((DAT IROG WHEN) 3 (provide PRET) 4 (INDEF blanket PL)) "wanneer voorzag hij ons van dekens")

(expect-inglua :nl ((DAT IROG) 3 (provide PRET) 4 (INDEF blanket PL)) "voorzag hij ons van dekens")

(expect-inglua :nl ((DAT IROG) WHO (provide PRET) 4 (INDEF blanket PL)) "wie voorzag ons van dekens")

(expect-inglua :nl ((DAT IROG) 3 (provide PRET) WHO (INDEF blanket PL)) "wie voorzag hij van dekens")

(expect-inglua :nl ((DAT IROG) 3 (provide PRET) 4 SBY) "voorzag hij ons van iemand")

(expect-inglua :nl ((DAT IROG) 3 (provide PRET) 4 STH) "voorzag hij ons ergens van")

(expect-inglua :nl ((DAT IROG) 3 (provide PRET) 4 STH) "voorzag hij ons van iets")

(expect-inglua :nl ((DAT IROG) 3 (provide PRET) 4 WHO) "van wie voorzag hij ons")

(expect-inglua :nl ((DAT IROG) 3 (provide PRET) 4 WHAT) "van wat voorzag hij ons")

(expect-inglua :nl ((DAT IROG) 3 (provide PRET) 4 WHAT) "waar voorzag hij ons van")

(expect-inglua :nl (TRANS 0 (intend can PRES) 13) "ik kan het van plan zijn")

(expect-inglua :nl ((TRANS NEG) 0 (intend can PRES) 13) "ik kan het niet van plan zijn")

(expect-inglua :nl ((TRANS NEG) 0 (intend can PRES) 13) "ik kan het niet van plan zijn")


(expect-inglua :nl (TRANS 11 (drop_v PRES) (THE blanket)) "zij laten de deken vallen")

(expect-inglua :nl (TRANS 12 (pat PRES) 0) "zij geeft mij een klopje")

(expect-inglua :nl (TRANS 12 (pat PRES) 0) "zij geeft me een klopje")

(expect-inglua :nl (TRANS 12 (pat PRES) 0) "ze geeft mij een klopje")

(expect-inglua :nl (TRANS (THE deep accident) (need PRES) (THE king PL)) "het diepe ongeval heeft de koningen nodig")

(expect-inglua :nl (TRANS (THE brave disease) (encourage PRES) 13) "de dappere ziekte moedigt het aan")

(expect-inglua :nl (INTR 0 (go_away PRES)) "ik ga weg")

(expect-inglua :nl (INTR 0 (undress PRES)) "ik kleed me uit")

(expect-inglua :nl (INTR (THE junk) (copy PRES)) "de rotzooi kopiëert")

(expect-inglua :nl (TRANS 1 (tolerate PRES) (THE biased development PL)) "je staat de bevooroordeelde ontwikkelingen uit")

(expect-inglua :nl (DAT 4 (teach PRES) (THE objective PL) 7) "we leren de doelen aan hen")

;; geboren worden
 (expect-inglua :nl ((INTR) 0 (be_born PERF)) "ik ben geboren")

 (expect-inglua :nl ((INTR) 0 (be_born want PERF)) "ik wil geboren zijn")

 ;; het mag niet er niet van afhangen
 (expect-inglua :nl ((TRANS NEG) 13 (depend_on may_v PRES) 13) "het mag er niet van afhangen")

;; gaan zitten
(expect-inglua :nl (INTR () (sit_down INF)) "gaan zitten")

;; even strak als jij

;; correct geven aan
(expect-inglua :nl (DAT 0 (give PRES) (THE bicycle) 13) "ik geef het de fiets")

(expect-inglua :nl (DAT 0 (give PRES) (THE bicycle) 13) "ik geef er de fiets aan")


;; correct vertrouwen op

(expect-inglua :nl (TRANS 0 (rely_on PRES) 13) "ik vertrouw erop")

;; naar tevredenheide

(expect-inglua :nl (NOM 12 (ser PRES) (satisfactory)) "ze is naar tevredenheid")

;; liever hebben
(expect-inglua :nl (INTR 0 (prefer PRES)) "ik heb liever")

;; transform(obj -> ind_object, nil -> obj) with np
(expect-inglua :nl (TRANS (THE girl) (pat PRES) 0) "het meisje geeft mij een klopje")

(expect-inglua :nl (TRANS 0 (pat PRES) (THE dog)) "ik geef de hond een klopje")
