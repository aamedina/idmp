(ns net.wikipunk.rdf.idmp-ext-mod
  "The IDMP Extensions Library Module includes ontologies that extend the core ISO standard ontologies to provide examples and other details that are important to demonstrate the efficacy of the IDMP ontologies and assist users in mapping their data. Note that these ontologies are informative, not a normative part of the set of IDMP ontology specification, and this should not be incorporated in applications but are available to inform IDMP ontology users."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/MetadataEXT.rdf",
   :dcterms/abstract
   "The IDMP Extensions Library Module includes ontologies that extend the core ISO standard ontologies to provide examples and other details that are important to demonstrate the efficacy of the IDMP ontologies and assist users in mapping their data. Note that these ontologies are informative, not a normative part of the set of IDMP ontology specification, and this should not be incorporated in applications but are available to inform IDMP ontology users.",
   :dcterms/issued #inst "2022-09-20T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/20220901/MetadataEXT/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-ext-mod"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/MetadataEXT/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.pistoiaalliance.org/idmp/ontology/EXT/MetadataEXT/",
   :rdfa/prefix "idmp-ext-mod",
   :rdfa/uri "https://spec.pistoiaalliance.org/idmp/ontology/EXT/MetadataEXT/",
   :rdfs/label "IDMP Extensions Library"})

(def EXTModule
  "The IDMP Extensions Library Module includes ontologies that extend the core ISO standard ontologies to provide examples and other details that are important to demonstrate the efficacy of the IDMP ontologies and assist users in mapping their data."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :db/ident :idmp-ext-mod/EXTModule,
   :dcterms/abstract
   "The IDMP Extensions Library Module includes ontologies that extend the core ISO standard ontologies to provide examples and other details that are important to demonstrate the efficacy of the IDMP ontologies and assist users in mapping their data.",
   :dcterms/hasPart
   ["https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/TerlipressinExample/"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/EuropeanUnionClinicalTrialsRegister/"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Extensions/UnifiedCodeForUnitsOfMeasure/"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Examples/AmlodipineExample/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:idmp-chg/Module :owl/NamedIndividual],
   :rdfs/label "IDMP Extensions Library"})