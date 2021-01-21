(ns clojure-consuming-rest.core
  (:require [clj-http.client :as http])
  (:gen-class))

(defn get-slideshow []
  (let [response (http/get "http://httpbin.org/json" {:as :json})]
    (:body response)))

(defn -main
  "Get JSON web service"
  [& args]
  (println (get-slideshow)))
