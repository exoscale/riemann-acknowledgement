riemann-acknowledgement
=======================

Acknowledge riemann alerts. Control on separate web interface.

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

## Installing

You will need to build this module for now and push it on riemann's classpath, for this
you will need a working JDK, JRE and [leiningen](http://leiningen.org).

First build the project:

```
lein uberjar
```

The resulting artifact will be in `target/riemann-acknowledgement-standalone-0.1.1.jar`.
You will need to push that jar on the machine(s) where riemann runs, for instance, in
`/usr/lib/riemann/riemann-acknowledgement.jar`.

If you have installed riemann from a stock package you will only need to tweak `/etc/default/riemann` and change
the line `EXTRA_CLASSPATH` to read:

```
EXTRA_CLASSPATH=/usr/lib/riemann/riemann-acknowledgement.jar
```

You can then use exposed functions, provided you have loaded the plugin in your configuration.

## Screenshot

![riemann-acknowledgement](http://i.imgur.com/CrqdYuS.png)

## Caveats

acknowledgements are preserved accross configuration reloads, not accross configuration restarts
