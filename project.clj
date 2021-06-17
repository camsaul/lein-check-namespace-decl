(defproject lein-check-namespace-decls "1.0.4-SNAPSHOT"
  :min-lein-version "2.5.0"

  :description
  "Linter that checks that namespace decls for files in a Leinigen project's `:source-paths` are cleaned the way
  `clj-refactor` would clean them."
  :url "https://github.com/camsaul/lein-check-namespace-decls"
  :license
  {:name "EPL-2.0"
   :url  "https://www.eclipse.org/legal/epl-2.0/"}

  :aliases
  {"test" ["with-profile" "+test" "test"]}

  :dependencies
  [[org.clojure/tools.namespace "1.1.0"]
   [cider/cider-nrepl "0.26.0"]
   [mvxcvi/puget "1.3.1"]
   [refactor-nrepl "2.5.1"]]

  :profiles
  {:dev
   {:dependencies      [[org.clojure/clojure "1.10.3"]
                        [pjstadig/humane-test-output "0.11.0"]]
    :injections        [(require 'pjstadig.humane-test-output)
                        (pjstadig.humane-test-output/activate!)]
    :eval-in-leiningen false}

   :test {}}

  :eval-in-leiningen true

  :deploy-repositories
  [["clojars"
    {:url           "https://clojars.org/repo"
     :username      :env/clojars_username
     :password      :env/clojars_password
     :sign-releases false}]])
