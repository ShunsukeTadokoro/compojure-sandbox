(defproject compojure-sandbox "0.1.0-SNAPSHOT"
  :description "Sandbox Project for compojure."
  :url "https://github.com/ShunsukeTadokoro/compojure-sandbox"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler compojure-sandbox.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
