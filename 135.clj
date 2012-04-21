;; The recursive solution to this is way cooler. I wish I had thought
;; of it.
;;
;; Example:
;;
;; (fn f [a o b & c]
;;  (if c
;;    (apply f (o a b) c)
;;    (o a b)))
;;
;; credit: amcnamara

(def __
  (fn [x & s]
    (reduce #((first %2) % (last %2)) x (partition 2 s)))
  )


(= 7  (__ 2 + 5))
	
(= 42 (__ 38 + 48 - 2 / 2))
	
(= 8  (__ 10 / 2 - 1 * 2))
	
(= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))
