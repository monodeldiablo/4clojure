(def __
  (fn m [f [h & r]]
    (lazy-seq
     (cons
      (f h)
      (if r (m f r)))))
  )


(= [3 4 5 6 7]
   (__ inc [2 3 4 5 6]))
	
(= (repeat 10 nil)
   (__ (fn [_] nil) (range 10)))
	
(= [1e6 (inc 1e6)]
   (->> (__ inc (range))
        (drop (dec 1e6))
        (take 2)))