(ns clj-stock-symbols.core
  (:require [clojure.string :as cs]
            [clojure.java.io :as io]
            [clojure.data.csv :as csv]
            [camel-snake-kebab.core :as csk]))

;; source: http://www.nasdaq.com/screening/companies-by-industry.aspx
(def csv-file (io/resource "companylist.csv"))

(defn clean-trailing-commas
  "Remove trailing commas from lines and repackage input as a single
   string with newlines.
  "
  [^String text]
  (->> (cs/split-lines text)
       (map #(apply str (butlast %)))
       (cs/join \newline)))

(defn canonicalize-keys
  [^String key-label]
  ;; Manually fix since kebab conversion is not desirable
  (if (= "IPOyear" key-label)
    :ipo-year
    (csk/->kebab-case-keyword key-label)))

(defn csv-data->maps
  [csv-str-lines]
  (map zipmap
       (->> (first csv-str-lines)
            (map canonicalize-keys)
            repeat)
       (rest csv-str-lines)))

(defn trim-symbols
  "Fix stock symbols with extra spaces"
  [ms]
  (map #(update % :symbol cs/trim) ms))

(defn load-companies
  ([] (load-companies csv-file))
  ([^String csv-filename]
   (-> csv-filename
       slurp
       clean-trailing-commas
       csv/read-csv
       csv-data->maps
       trim-symbols)))
