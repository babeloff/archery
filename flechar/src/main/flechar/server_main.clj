(ns flechar.server-main
  (:require
    [mount.core :as mount]
    flechar.server-components.http-server)
  (:gen-class))

;; This is a separate file for the uberjar only.
;; We control the server in dev mode from src/dev/user.clj
(defn -main [& args]
  (print args)
  (mount/start-with-args {:config "config/prod.edn"}))
