(ns cljs-plus.core)

(defn ^:export clj-plus [x & xs]
  (apply + x xs))
