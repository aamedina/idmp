(ns net.wikipunk.rdf.idmp-meta-mod
  "The Metadata Ontologies Module includes ontologies that support the data management and governance program for the Identification of Medicinal Products (IDMP) ontologies. These include IDMP-specific annotations, concepts related to the development process, and so forth."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/META/MetadataMETA.rdf",
   :dcterms/abstract
   "The Metadata Ontologies Module includes ontologies that support the data management and governance program for the Identification of Medicinal Products (IDMP) ontologies. These include IDMP-specific annotations, concepts related to the development process, and so forth.",
   :dcterms/issued #inst "2022-08-29T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/META/20220801/MetadataMETA/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-cmpl"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/",
    "idmp-meta-mod"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/MetadataMETA/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.pistoiaalliance.org/idmp/ontology/META/MetadataMETA/",
   :rdfa/prefix "idmp-meta-mod",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/META/MetadataMETA/",
   :rdfs/label "Metadata for the IDMP Metadata Ontologies Module"})

(def METAModule
  "The Metadata Ontologies Module includes ontologies that support the data management and governance program for the Identification of Medicinal Products (IDMP) ontologies. These include IDMP-specific annotations, concepts related to the development process, and so forth."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :db/ident :idmp-meta-mod/METAModule,
   :dcterms/abstract
   "The Metadata Ontologies Module includes ontologies that support the data management and governance program for the Identification of Medicinal Products (IDMP) ontologies. These include IDMP-specific annotations, concepts related to the development process, and so forth.",
   :dcterms/hasPart
   ["https://spec.pistoiaalliance.org/idmp/ontology/META/ISOConformanceAnnotations/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:idmp-chg/Module :owl/NamedIndividual],
   :rdfs/label "IDMP Metadata Ontologies Module"})