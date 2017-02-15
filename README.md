
Polyfill Functions
----

To be reused by `*.cljc` files.

### Usages

[![Clojars Project](https://img.shields.io/clojars/v/mvc-works/polyfill.svg)](https://clojars.org/mvc-works/polyfill)

```clojure
[mvc-works/polyfill "0.1.1"]
```

```clojure
(polyfill.core/read-string* "1")
(polyfill.core/document-create-element* "div" {})
(polyfill.core/io-get-time*)
(polyfill.core/raise* "Error message")
(polyfill.core/text-width* content font-size font-family)
(polyfill.core/log* arg)
(polyfill.core/set-timeout* (fn []))
```

### License

MIT
