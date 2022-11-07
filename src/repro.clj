(ns repro
  (:require [hugsql.core :as hugsql]))

(hugsql/def-db-fns "query.sql")

(ns-publics 'repro) ;; => {hello #'repro/hello}

#_hello ;; uncomment to reproduce
