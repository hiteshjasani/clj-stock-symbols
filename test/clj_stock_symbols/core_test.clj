(ns clj-stock-symbols.core-test
  (:require [clojure.test :refer :all]
            [clj-stock-symbols.core :refer :all]))

(deftest reading-companies
  (let [companies (load-companies)]
    (testing "parsed CSV correctly"
      (is (= 6773 (count companies)))
      (is (= {:symbol "PIH", :name "1347 Property Insurance Holdings, Inc.",
              :last-sale "6.9", :market-cap "41294885.4", :adr-tso "n/a",
              :ipo-year "2014", :sector "Finance",
              :industry "Property-Casualty Insurers",
              :summary-quote "http://www.nasdaq.com/symbol/pih"}
             (first companies)))
      (is (= {:symbol "ZNGA", :name "Zynga Inc.", :last-sale "3.72",
              :market-cap "3238423110.84", :adr-tso "n/a", :ipo-year "2011",
              :sector "Technology", :industry "EDP Services",
              :summary-quote "http://www.nasdaq.com/symbol/znga"}
             (last companies)))
      )
    ))
