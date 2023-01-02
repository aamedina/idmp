(ns net.wikipunk.rdf.idmp-spec
  "The IDMP Metadata Ontology describes the various modules that make up the IDMP ontology library and supports the data management and governance program for the Identification of Medicinal Products (IDMP) program in general."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/MetadataIDMP.rdf",
   :dcterms/abstract
   "The IDMP Metadata Ontology describes the various modules that make up the IDMP ontology library and supports the data management and governance program for the Identification of Medicinal Products (IDMP) program in general.",
   :dcterms/issued #inst "2022-09-20T22:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/MetadataCMNS/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/MetadataISO/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/MetadataMETA/"
    "https://www.omg.org/spec/LCC/MetadataLCC/"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/MetadataEXT/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/20220901/MetadataIDMP/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-mod" "https://www.omg.org/spec/Commons/MetadataCMNS/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-ext-mod"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/MetadataEXT/",
    "idmp-iso-mod"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/MetadataISO/",
    "idmp-meta-mod"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/MetadataMETA/",
    "idmp-spec" "https://spec.pistoiaalliance.org/idmp/ontology/MetadataIDMP/",
    "lcc-mod" "https://www.omg.org/spec/LCC/MetadataLCC/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://spec.pistoiaalliance.org/idmp/ontology/MetadataIDMP/",
   :rdfa/prefix "idmp-spec",
   :rdfa/uri "https://spec.pistoiaalliance.org/idmp/ontology/MetadataIDMP/",
   :rdfs/label "Metadata for the IDMP Metadata Ontology"})

(def IDMPSpecification
  "The IDMP Specification comprises all metadata describing the various modules and ontologies that make up the IDMP ontology library and supports the data management and governance program for the Identification of Medicinal Products (IDMP) program."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :db/ident :idmp-spec/IDMPSpecification,
   :dcterms/abstract
   "The IDMP Specification comprises all metadata describing the various modules and ontologies that make up the IDMP ontology library and supports the data management and governance program for the Identification of Medicinal Products (IDMP) program.",
   :dcterms/hasPart [:lcc-mod/LCCModule
                     :idmp-meta-mod/METAModule
                     :idmp-iso-mod/ISOModule
                     :idmp-ext-mod/EXTModule
                     :cmns-mod/CMNSModule],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/title "IDMP Specification",
   :rdf/type [:owl/NamedIndividual :idmp-chg/Specification],
   :rdfs/label "IDMP Specification"})