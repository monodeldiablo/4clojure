(def __
  (fn [x s]
    (loop [p (take x s)
           n (drop x s)
           r '()]
      (if-not (= x (count p))
        (reverse r)
        (recur (take x n) (drop x n) (conj r p)))))
  )

(= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
	
(= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
	
(= (__ 3 (range 8)) '((0 1 2) (3 4 5)))