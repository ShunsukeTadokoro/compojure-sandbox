(ns compojure-sandbox.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [compojure-sandbox.view.main :as view]))

(defn home [req]
  (-> (view/home-view req)))

(defroutes app-routes
  (GET "/" _ home)
  (GET "/hoge" [] "GET /hoge")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
