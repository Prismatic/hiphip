(ns hiphip.generative.float
  (:use hiphip.float hiphip.generative.type_impl_gen)
  (:require [clojure.test.generative :as test :refer (defspec)]
            [hiphip.generators :as gen])
  (:refer-clojure :exclude [amap areduce alength aclone aset aget]))

(def array-gen #(gen/farray 10e1))
(def range-gen #(gen/frange 10e1))
(def new-array float-array)
(defn is-type? [n] (instance? Float n))

(eval (read-string (load-type-impl-gen)))