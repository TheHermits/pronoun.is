(defproject witch-house/pronouns "1.12.0-SNAPSHOT"
  :description "Pronoun.is is a website for personal pronoun usage examples"
  :url "http://pronoun.is"
  :license "GNU Affero General Public License 3.0"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [compojure "1.6.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [environ "1.1.0"]
                 [hiccup "1.0.5"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]
            [lein-ring "0.9.7"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "pronouns-standalone.jar"
  ;; FIXME morgan.astra <2018-11-14 Wed>
  ;; Is this production profile used for anything?
  :profiles {:production {:env {:production true}}
             :dev {:dependencies [[ring/ring-devel "1.7.1"]]}}
  :ring {:handler pronouns.web/app})
