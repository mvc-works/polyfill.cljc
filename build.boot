
(set-env!
  :resource-paths #{"src/"}
  :dependencies '[[org.clojure/clojure          "1.8.0"       :scope "test"]
                  [org.clojure/clojurescript    "1.9.293"     :scope "test"]])

(def +version+ "0.1.1")

(task-options!
  pom {:project     'mvc-works/polyfill
       :version     +version+
       :description "Polyfill functions to reuse in Clojure and ClojureScript"
       :url         "https://github.com/mvc-works/polyfill"
       :scm         {:url "https://github.com/mvc-works/polyfill"}
       :license     {"MIT" "http://opensource.org/licenses/mit-license.php"}})

(deftask build []
  (comp
    (pom)
    (jar)
    (install)
    (target)))

(deftask deploy []
  (set-env!
    :repositories #(conj % ["clojars" {:url "https://clojars.org/repo/"}]))
  (comp
    (build)
    (push :repo "clojars" :gpg-sign (not (.endsWith +version+ "-SNAPSHOT")))))
