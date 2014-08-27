(defproject riemann-acknowledgement "0.1.2"
  :description "riemann acknowledgment plugin"
  :url "https://github.com/exoscale/riemann-acknowledgement"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[riemann "0.2.6"]]}}
  :dependencies [[org.clojure/clojure       "1.5.1"]
                 [compojure                 "1.1.6"]
                 [ring/ring-json            "0.2.0"]
                 [javax.servlet/servlet-api "2.5"]])
