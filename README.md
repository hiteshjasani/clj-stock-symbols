# clj-stock-symbols

[![Clojars Project](https://img.shields.io/clojars/v/org.jasani/clj-stock-symbols.svg)](https://clojars.org/org.jasani/clj-stock-symbols)

A Clojure library containing public US company stock symbols.


## Usage

``` clojure
(:require [clj-stock-symbols.core :as ss])

(take 3 (ss/load-companies))
=> ({:symbol "PIH", :name "1347 Property Insurance Holdings, Inc.", :last-sale "6.9", :market-cap "41294885.4", :adr-tso "n/a", :ipo-year "2014", :sector "Finance", :industry "Property-Casualty Insurers", :summary-quote "http://www.nasdaq.com/symbol/pih"} {:symbol "TURN", :name "180 Degree Capital Corp.", :last-sale "2.05", :market-cap "63799202.1", :adr-tso "n/a", :ipo-year "n/a", :sector "Finance", :industry "Finance/Investors Services", :summary-quote "http://www.nasdaq.com/symbol/turn"} {:symbol "FLWS", :name "1-800 FLOWERS.COM, Inc.", :last-sale "11.75", :market-cap "759337428.5", :adr-tso "n/a", :ipo-year "1999", :sector "Consumer Services", :industry "Other Specialty Stores", :summary-quote "http://www.nasdaq.com/symbol/flws"})
```

## License

Copyright © 2018 Hitesh Jasani

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
