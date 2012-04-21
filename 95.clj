(def __
  (fn ? [n]
    (or (nil? n)
        (and (coll? n)
             (= 3 (count n))
             (every? ? (rest n)))))
  )


(= (__ '(:a (:b nil nil) nil))
   true)
	
(= (__ '(:a (:b nil nil)))
   false)
	
(= (__ [1 nil [2 [3 nil nil] [4 nil nil]]])
   true)
	
(= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]])
   false)
	
(= (__ [1 [2 [3 [4 nil nil] nil] nil] nil])
   true)
	
(= (__ [1 [2 [3 [4 false nil] nil] nil] nil])
   false)
	
(= (__ '(:a nil ()))
   false)