(ns Elrond.comm)

(defn resolve-var
  [sym]
  (var-get (resolve sym)))