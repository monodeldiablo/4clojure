(def __
  (fn [x s]
    (loop [n s
           r '()]
      (if (> x (count n))
        (reverse r)
        (recur (drop x n) (conj r (take x n))))))
  )

(= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
	
(= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
	
(= (__ 3 (range 8)) '((0 1 2) (3 4 5)))