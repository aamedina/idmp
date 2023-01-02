(ns net.wikipunk.idmp
  "Identification of Medicinal Products"
  (:require
   [clojure.string :as str]
   [com.stuartsierra.component :as com]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.idmp.boot]
   [net.wikipunk.rdf :as rdf]))

(defn quickstart
  []
  (require '[net.wikipunk.rdf.cmns-av :as cmns-av]
           '[net.wikipunk.rdf.cmns-cds :as cmns-cds]
           '[net.wikipunk.rdf.cmns-cls :as cmns-cls]
           '[net.wikipunk.rdf.cmns-col :as cmns-col]
           '[net.wikipunk.rdf.cmns-cxtdsg :as cmns-cxtdsg]
           '[net.wikipunk.rdf.cmns-cxtid :as cmns-cxtid]
           '[net.wikipunk.rdf.cmns-doc :as cmns-doc]
           '[net.wikipunk.rdf.cmns-dsg :as cmns-dsg]
           '[net.wikipunk.rdf.cmns-dt :as cmns-dt]
           '[net.wikipunk.rdf.cmns-ge :as cmns-ge]
           '[net.wikipunk.rdf.cmns-ge-eeuj :as cmns-ge-eeuj]
           '[net.wikipunk.rdf.cmns-ge-euj :as cmns-ge-euj]
           '[net.wikipunk.rdf.cmns-ge-neuj :as cmns-ge-neuj]
           '[net.wikipunk.rdf.cmns-ge-seuj :as cmns-ge-seuj]
           '[net.wikipunk.rdf.cmns-ge-ukj :as cmns-ge-ukj]
           '[net.wikipunk.rdf.cmns-ge-wasj :as cmns-ge-wasj]
           '[net.wikipunk.rdf.cmns-ge-weuj :as cmns-ge-weuj]
           '[net.wikipunk.rdf.cmns-id :as cmns-id]
           '[net.wikipunk.rdf.cmns-loc :as cmns-loc]
           '[net.wikipunk.rdf.cmns-org :as cmns-org]
           '[net.wikipunk.rdf.cmns-prd :as cmns-prd]
           '[net.wikipunk.rdf.cmns-pts :as cmns-pts]
           '[net.wikipunk.rdf.cmns-qtu :as cmns-qtu]
           '[net.wikipunk.rdf.cmns-ra :as cmns-ra]
           '[net.wikipunk.rdf.cmns-rga :as cmns-rga]
           '[net.wikipunk.rdf.cmns-txt :as cmns-txt]
           '[net.wikipunk.rdf.idmp-amp :as idmp-amp]
           '[net.wikipunk.rdf.idmp-chg :as idmp-chg]
           '[net.wikipunk.rdf.idmp-cmpl :as idmp-cmpl]
           '[net.wikipunk.rdf.idmp-dtp :as idmp-dtp]
           '[net.wikipunk.rdf.idmp-euctr :as idmp-euctr]
           '[net.wikipunk.rdf.idmp-eura :as idmp-eura]
           '[net.wikipunk.rdf.idmp-eurga :as idmp-eurga]
           '[net.wikipunk.rdf.idmp-mprd :as idmp-mprd]
           '[net.wikipunk.rdf.idmp-phdf :as idmp-phdf]
           '[net.wikipunk.rdf.idmp-phprd :as idmp-phprd]
           '[net.wikipunk.rdf.idmp-ra :as idmp-ra]
           '[net.wikipunk.rdf.idmp-spec :as idmp-spec]
           '[net.wikipunk.rdf.idmp-spor :as idmp-spor]
           '[net.wikipunk.rdf.idmp-sub :as idmp-sub]
           '[net.wikipunk.rdf.idmp-trlp :as idmp-trlp]
           '[net.wikipunk.rdf.idmp-ucum :as idmp-ucum]
           '[net.wikipunk.rdf.idmp-uom :as idmp-uom]
           '[net.wikipunk.rdf.lcc-3166-1 :as lcc-3166-1]
           '[net.wikipunk.rdf.lcc-3166-2 :as lcc-3166-2]
           '[net.wikipunk.rdf.lcc-639-1 :as lcc-639-1]
           '[net.wikipunk.rdf.lcc-639-2 :as lcc-639-2]
           '[net.wikipunk.rdf.lcc-cr :as lcc-cr]
           '[net.wikipunk.rdf.lcc-lr :as lcc-lr]
           '[net.wikipunk.rdf.lcc-m49 :as lcc-m49]))

(defrecord IDMP [vocab domains modules]
  com/Lifecycle
  (start [this]
    (try
      (binding [*ns* (or (:quickstart-ns this) (find-ns 'dev))]
        (quickstart))
      (catch Throwable ex))
    this)
  (stop [this]
    this)

  rdf/NamespaceSpitter
  (emit [_ arg-map]
    (rdf/emit domains arg-map)
    (rdf/emit modules arg-map)))
