(ns leiningen.create-migration
  (:require [leiningen.compile :as lein-compile]))

(defn create-migration [project & args]
  "Create a new migration file."
  (lein-compile/eval-in-project project
    `(drift.generator/generate-migration-file ~(first args))
    nil nil '(require 'drift.generator)))

