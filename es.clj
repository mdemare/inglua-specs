(ns official.es
  (:use [expectations]
        [clinglua.Gram]
        [helper]))

;(expect-not-include :es "por qué es el cielo azul" "((NOM IROG WHY) (THE sky) (ser PRES) (blue))")
;(expect-not-include :es "esas plantas son tan llenas como" "(NOM (THAT plant PL) (ser PRES) (EQL full 0))")
;(expect-not-include :es "esas plantas son tan llenas como" "(NOM (THAT plant PL) (ser PRES) (EQL full 12))")

;; negation transformations
(expect-inglua :es (TRANS 0 (see PRES) NTH) "no veo nada")
(expect-inglua :es (TRANS NBY (see PRES) 0) "nadie me ve")
(expect-inglua :es (TRANS 0 (see PRES) (NO spider PL)) "no veo ningunas arañas")
(expect-inglua :es (TRANS (NO spider PL) (scare PRES) 0) "ningunas arañas me asustan")

;; es: various issues
(expect-inglua :es (TRANS 13 (concern-es-0 PRES) (P2 husband)) "se trata de su marido")
(expect-inglua :es (NOUN (before THE summer)) "antes del verano")
(expect-inglua :es (TRANS 4 (postpone must PRES) (THE wedding-es-1)) "nosotros debemos aplazar el casamiento")
(expect-inglua :es ((TRANS NEG) 1 (beware PERF) 3) "no has tenido cuidado por él")
(expect-inglua :es ((TRANS) (NO state) (welcome_v PRES) (THE tiger)) "ningún estado da la bienvenida al tigre")
(expect-inglua :es ((NOM IROG WHY) (THE sky) (ser PRES) (blue)) "por qué el cielo es azul")
(expect-inglua :es (TRANS (Alice) (see PRES) (Bob)) "Alice ve a Bob")
(expect-inglua :es (NOM 3 (ser PRES) (orange)) "él es de color naranja")
(expect-inglua :es (NOM 12 (ser PRES) (orange)) "ella es de color naranja")
(expect-inglua :es (NOM 12 (ser PRES) (safe)) "ella es a salvo")
(expect-inglua :es (NOM 12 (ser PRES) (unkind)) "ella es poca amable")
(expect-inglua :es (NOM 12 (ser PRES) (stuffy)) "ella es mal ventilada")
(expect-inglua :es (NOUN (THE firstname)) "el nombre propio")
(expect-inglua :es (NOUN (THE firstname PL)) "los nombres propios")
(expect-inglua :es (NOUN (THE firstname PL)) "los nombres de pila")
(expect-inglua :es (NOUN (THE rear)) "la parte trasera")
(expect-inglua :es (NOUN (THE rear PL)) "las partes traseras")
(expect-inglua :es (NOUN (THE bird_of_prey PL)) "las aves rapaces")
(expect-inglua :es ((TRANS IROG) 1 (kill PRET) WHO) "a quién mataste")

;; sonreír
(expect-inglua :es ((TRANS) 7 (break PRET) (BOTH dishtowel PL)) "rompieron ambos trapos de cocina")

;; sonreír
(expect-inglua :es (INTR () (smile INF)) "sonreír")

;; 'darse prisa'
(expect-inglua :es (INTR () (hurry INF)) "darse prisa")

;; reflexive verbs
(expect-inglua :es (INTR () (be_sorry INF)) "lo sentirse")
(expect-inglua :es (INTR () (stoop INF)) "agacharse")
(expect-inglua :es (INTR () (enjoy INF)) "divertirse")

;; darse cuenta
(expect-inglua :es (INTR () (realize INF)) "darse cuenta")

;; no cada perro ladra
(expect-inglua :es ((INTR NEG) (EACH dog) (bark PRES)) "no cada perro ladra")

;; no todos los perros ladran
(expect-inglua :es ((INTR NEG) (ALL dog PL) (bark PRES)) "no todos los perros ladran")

;; hacer daño a alguien
(expect-inglua :es (TRANS () (harm INF) SBY) "hacer daño a alguien")

;; tomar prestado
(expect-inglua :es (TRANS () (borrow INF) STH) "tomar algo prestado")

;; la vecina
(expect-inglua :es (NOUN (THE neighbor_f)) "la vecina")

;; (NOUN (THE underside))
(expect-inglua :es (NOUN (THE underside)) "la parte de abajo")

;; cerrar con llave
(expect-inglua :es (TRANS () (lock_v INF) STH) "cerrar algo con llave")

;; subj compl
(expect-inglua :es (NOM (INDEF woman) (ser PRES) (pretty)) "una mujer es guapa")

;; subj compl
(expect-inglua :es (NOM (INDEF woman) (ser PRES) (unemployed)) "una mujer es en paro")

;; subj compl
(expect-inglua :es (INTR (INDEF woman) (doubt_intr PRES)) "una mujer está indecisa")

;; move accent
(expect-inglua :es (INTR (THE heart PL) (burn PRES)) "los corazones queman")
(expect-inglua :es (INTR (THE end PL) (burn PRES)) "los fines queman")
(expect-inglua :es (INTR (THE garden PL) (burn PRES)) "los jardines queman")
(expect-inglua :es (INTR (THE crime PL) (burn PRES)) "los crímenes queman")
(expect-inglua :es (INTR (THE character PL) (burn PRES)) "los caracteres queman")
(expect-inglua :es (INTR (THE order PL) (burn PRES)) "los órdenes queman")

;; human object -> a
(expect-inglua :es (TRANS 0 (see PRES) (THE dog PL)) "veo los perros")
(expect-inglua :es (TRANS 0 (see PRES) (THE brother PL)) "veo a los hermanos")
(expect-inglua :es (TRANS 0 (see PRES) (INDEF child)) "veo un niño")
(expect-inglua :es (TRANS 0 (see PRES) (P0 son)) "veo a mi hijo")
(expect-inglua :es (TRANS 0 (see PRES) (N3 brother PL)) "veo tres hermanos")
(expect-inglua :es ((TRANS NEG) 0 (see PRES) (NO brother PL)) "no veo ningunos hermanos")
