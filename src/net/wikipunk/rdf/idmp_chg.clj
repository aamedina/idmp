(ns net.wikipunk.rdf.idmp-chg
  "The IDMP Change Management ontology provides metadata for data management and governance of the IDMP ontologies."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/META/ChangeManagement.rdf",
   :dcterms/abstract
   "The IDMP Change Management ontology provides metadata for data management and governance of the IDMP ontologies.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/references "http://purl.org/dc/terms/",
   :idmp-chg/hasMaturityLevel :idmp-chg/Release,
   :owl/imports ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
                 "https://www.omg.org/spec/Commons/Classifiers/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/META/20221001/ChangeManagement/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
   :rdfa/prefix "idmp-chg",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
   :rdfs/label "Change Management Ontology"})

(def Informative
  "entity that demonstrates how to use some elements of the ontology"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Informative content includes examples that are useful but should not be incorporated in any application. They have been created to support testing and provide guidance to users with respect to how to implement certain constructs."},
   :db/ident :idmp-chg/Informative,
   :rdf/type [:idmp-chg/MaturityLevel :owl/NamedIndividual],
   :rdfs/label "informative",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entity that demonstrates how to use some elements of the ontology"}})

(def MaturityLevel
  "classifier used to indicate the state of an artifact with respect to the IDMP data management and governance lifecycle"
  {:db/ident :idmp-chg/MaturityLevel,
   :rdf/type :owl/Class,
   :rdfs/label "maturity level",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   "classifier used to indicate the state of an artifact with respect to the IDMP data management and governance lifecycle"})

(def Module
  "separable component of something else, organized by topic or functional area"
  {:db/ident :idmp-chg/Module,
   :rdf/type :owl/Class,
   :rdfs/label "module",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "separable component of something else, organized by topic or functional area"},
   :skos/note
   {:rdf/language "en",
    :rdf/value
    "Modularization of any engineering model, including a large ontology, involves principles of the model driven architecture methodology (MDA), such as separation of concerns, coherence, and establishing clear logical boundaries in order to increase reusability and maintainability.\n\nA module should be designed to reflect these principles, including a small number of models that have well-defined relationships with one another, that form a coherent and cohesive whole for some purpose, and that have clear boundaries or interfaces to other external modules."}})

(def Preliminary
  "entity that is considered to be in early stages of development"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Preliminary content is subject to significant change, and may be renamed or moved to another ontology prior to achieving provisional status. Users should be aware that it is not dependable, but could be used for reference and as the basis for further work."},
   :db/ident :idmp-chg/Preliminary,
   :rdf/type [:idmp-chg/MaturityLevel :owl/NamedIndividual],
   :rdfs/label "preliminary",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entity that is considered to be in early stages of development"}})

(def Provisional
  "entity that is considered to be in later stages of development"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Provisional content may change prior to release but is more stable and reliable than preliminary content."},
   :db/ident :idmp-chg/Provisional,
   :rdf/type [:idmp-chg/MaturityLevel :owl/NamedIndividual],
   :rdfs/label "provisional",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entity that is considered to be in later stages of development"}})

(def Release
  "entity that is considered to be stable and mature from a development perspective"
  {:cmns-av/explanatoryNote
   {:rdf/language "en",
    :rdf/value
    "Release notes will be provided for any changes with respect to released content, and any revisions will be backwards compatible with the prior version to the degree possible."},
   :db/ident :idmp-chg/Release,
   :rdf/type [:idmp-chg/MaturityLevel :owl/NamedIndividual],
   :rdfs/label "release",
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "entity that is considered to be stable and mature from a development perspective"}})

(def Specification
  "explicit set of requirements to be satisfied by a material, model, product, or service"
  {:cmns-av/abbreviation {:rdf/language "en",
                          :rdf/value    "spec"},
   :db/ident :idmp-chg/Specification,
   :rdf/type :owl/Class,
   :rdfs/label "specification",
   :rdfs/subClassOf :cmns-cls/Classifier,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "explicit set of requirements to be satisfied by a material, model, product, or service"}})

(def hasMaturityLevel
  "links something to its state with respect to a development lifecycle"
  {:db/ident :idmp-chg/hasMaturityLevel,
   :rdf/type :owl/AnnotationProperty,
   :rdfs/label "has maturity level",
   :skos/definition
   "links something to its state with respect to a development lifecycle"})