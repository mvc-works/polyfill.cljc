
Polyfill Functions
----

To be reused by `*.cljc` files.

### Usages

```clojure
[mvc-works/polyfill "0.1.0"]
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
