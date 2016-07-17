(ns compojure-sandbox.view.main
  (:require [compojure-sandbox.view.layout :as layout]))

(defn home-view [req]
  (->>
    [:section
      [:h2 "Home"]]
    (layout/common req)))