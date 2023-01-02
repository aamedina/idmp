(ns net.wikipunk.rdf.cmns-mod
  "The Commons (CMNS) Ontology Library Module includes ontologies that are defined in the Object Management Group (OMG) Commons Ontology Library standard, as well as others that are planned for inclusion."
  {:cmns-av/copyright ["Copyright (c) 2022 Pistoia Alliance, Inc."
                       "Copyright (c) 2022 EDM Council, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/MetadataCMNS.rdf",
   :dcterms/abstract
   "The Commons (CMNS) Ontology Library Module includes ontologies that are defined in the Object Management Group (OMG) Commons Ontology Library standard, as well as others that are planned for inclusion.",
   :dcterms/issued #inst "2022-11-16T23:00:00.000-00:00",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports
   ["https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"],
   :owl/versionIRI "https://www.omg.org/spec/Commons/202201101/MetadataCMNS/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-mod" "https://www.omg.org/spec/Commons/MetadataCMNS/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/MetadataCMNS/",
   :rdfa/prefix "cmns-mod",
   :rdfa/uri "https://www.omg.org/spec/Commons/MetadataCMNS/",
   :rdfs/label "Metadata for the IDMP Commons Ontology Library"})

(def CMNSModule
  "The Commons (CMNS) Ontology Library Module includes ontologies that are defined in the Object Management Group (OMG) Commons Ontology Library standard, as well as others that are planned for inclusion."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :db/ident :cmns-mod/CMNSModule,
   :dcterms/abstract
   "The Commons (CMNS) Ontology Library Module includes ontologies that are defined in the Object Management Group (OMG) Commons Ontology Library standard, as well as others that are planned for inclusion.",
   :dcterms/hasPart
   ["https://www.omg.org/spec/Commons/EuropeanJurisdiction/EasternEuropeGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/AsianJurisdiction/WesternAsiaGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/NorthernEuropeGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/EUGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/RegistrationAuthorities/"
    "https://www.omg.org/spec/Commons/Locations/"
    "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/SouthernEuropeGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/WesternEuropeGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/ContextualIdentifiers/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/Commons/Organizations/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/DatesAndTimes/"
    "https://www.omg.org/spec/Commons/GovernmentEntities/"
    "https://www.omg.org/spec/Commons/RegulatoryAgencies/"
    "https://www.omg.org/spec/Commons/Designators/"
    "https://www.omg.org/spec/Commons/PartiesAndSituations/"
    "https://www.omg.org/spec/Commons/Documents/"
    "https://www.omg.org/spec/Commons/EuropeanJurisdiction/UKGovernmentEntitiesAndJurisdictions/"
    "https://www.omg.org/spec/Commons/TextDatatype/"
    "https://www.omg.org/spec/Commons/ProductsAndServices/"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :rdf/type [:idmp-chg/Module :owl/NamedIndividual],
   :rdfs/label "Commons Ontology Library Module"})