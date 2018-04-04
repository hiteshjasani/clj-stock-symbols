(defproject org.jasani/clj-stock-symbols "0.1.1-SNAPSHOT"
  :description "Library of public US company stock symbols"
  :url "https://github.com/hiteshjasani/clj-stock-symbols"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/spec.alpha "0.1.123"]
                 [org.clojure/data.csv "0.1.4"]
                 [camel-snake-kebab "0.4.0"]]
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :sign-releases false}
                        ]])
