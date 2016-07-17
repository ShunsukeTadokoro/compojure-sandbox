(ns compojure-sandbox.view.layout
  (:require [hiccup.page :refer [html5 include-css include-js]]))

(defn common [req & body]
  (html5
    [:head
      [:title "Compojure Sandbox"]
      (include-css
        "/css/normalize.css"
        "/css/main.css")
      (include-js "/js/main.js")]
    [:body
      [:header "Compojure Sandbox"]
      [:main body]]))
