(defproject riemann-acknowledgement "0.1.3"
  :description "riemann acknowledgment plugin"
  :url "https://github.com/exoscale/riemann-acknowledgement"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure       "1.6.0"]
                 [compojure                 "1.3.1"]
                 [ring/ring-json            "0.3.1"]
                 [javax.servlet/servlet-api "2.5"]
                 [riemann                   "0.2.6"
                  :exclusions [org.slf4j/slf4j-log4j12 joda-time]]])
