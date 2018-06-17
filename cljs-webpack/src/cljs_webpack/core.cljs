(ns cljs-webpack.core)

(defn ^:export clj-plus [x & xs]
  (apply + x xs))
