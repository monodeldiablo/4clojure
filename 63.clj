(defn __ [f s]
  (apply merge-with concat (map #(assoc {} (f %) [%]) s)))

(= (__ #(> % 5) #{1 3 6 8}) {false [1 3], true [6 8]})
