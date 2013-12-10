riemann-acknowledgement
=======================

Acknowledge riemann alerts. Control on separate web interface

## Synopsis

In riemann.config

```clojure

(load-plugins)

(acknowledgement/acknowledgement-server)

(def mailout (let [m (mailer {:from "riemann@example.com"})]
               (m "alerts@example.com")))

(streams

  (acknowledgement/acked-alert-stream
     mailout))
```

## Screenshot

![riemann-acknowledgement](http://i.imgur.com/CrqdYuS.png)
