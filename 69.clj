(defn __ [f & maps]
  (let [x (fn [m e]
            (let [[k v] e]
              (if (contains? m k)
                (assoc m k (f (m k) v))
                (assoc m k v))))]
    (reduce #(reduce x (or % {}) %2) maps)))

(= (__ * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
   {:a 4, :b 6, :c 20})
	
(= (__ - {1 10, 2 20} {1 3, 2 10, 3 15})
   {1 7, 2 10, 3 15})
	
(= (__ concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
   {:a [3 4 5], :b [6 7], :c [8 9]})